package com.app.bookshop.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.service.BookService;
/**
 * Content: Add cart to session
 * @author khong.phu
 * @version 1.00
 */
@StrutsAction(input = "addcart.do")
public class AddcartAction extends BaseAction{
	
	
	@StrutsActionForward
	public static final String DETAIL="/cartdetail.do";
	
	@StrutsActionForward
	public static final String BOOK_DETAIL="/WEB-INF/view/bookshop/bookdetail.jsp";
	@Resource
	BookService bookService;
	public String execute(){
		// Check status is logined
		if(!isLogined(req)){
			return LOGIN;
		}
		
		// Get parameter
		String idString = req.getParameter("bookId");
		String amountString =req.getParameter("amount");
		
		Integer bookId, amount;
		
		bookId=Integer.parseInt(idString);
		BookDto book = bookService.getBookDto(bookId);;
		
		try{
			amount = Integer.parseInt(amountString);
		}catch(Exception ex){
			amount = 0;
		}
		// Check amount is valid
		if(amount <= 0 || book.getAmount() < amount){
			req.setAttribute(Constaint.ERROR, amountString==""?"0":amountString);
			req.setAttribute("book", book);
			return BOOK_DETAIL;
		}
		
		book.setAmount(amount);
		CartDto cart;
		
		// Add cart to session
		if(req.getSession().getAttribute(Constaint.CART) == null){
			cart = new CartDto();
		}else{
			cart = (CartDto)req.getSession().getAttribute(Constaint.CART);
		}
		cart.add(book);
		
		req.getSession().setAttribute(Constaint.CART, cart);
		return DETAIL;
	}
}
