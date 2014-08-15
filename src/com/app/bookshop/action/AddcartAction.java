package com.app.bookshop.action;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.service.BookService;

@StrutsAction(input = BookdetailAction.DETAIL)
public class AddcartAction extends BaseAction{
	
	@StrutsActionForward
	public static final String DETAIL = "/WEB-INF/view/bookshop/cartdetail.jsp";
	
	public static final String ADDCART="carddetail.do";
	
	@Resource
	BookService bookService;
	public String execute(){
		
//		if(!isLogined(req)){
//			return "login.do";
//		}
		String idString = req.getParameter("bookId");
		String amountString =req.getParameter("amount");
		
		Integer bookId, amount;
		
		bookId=Integer.parseInt(idString);
		amount = Integer.parseInt(amountString);
		
		logger.info("id stirng:"+idString);
		logger.info(amountString);
		
		BookDto book= bookService.getBookDto(bookId);
		book.setAmount(amount);
		CartDto cart;
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
