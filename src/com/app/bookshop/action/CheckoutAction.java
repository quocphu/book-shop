package com.app.bookshop.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.entity.Account;
import com.app.bookshop.service.InvoiceService;
//@StrutsAction(input = BooksAction.PRODUCT)
public class CheckoutAction extends BaseAction {

	@StrutsActionForward
	public static final String SUCCESS = "/WEB-INF/view/bookshop/checkout.jsp";

	@Resource
	InvoiceService invoiceService;

	public String execute() {
		// Check login status
		if (!isLogined(req)) {
			return BaseAction.LOGIN;
		}

		if (req.getSession().getAttribute(Constaint.CART) == null) {
			return BaseAction.LOGIN;
		}

		List lstBook= (List) req.getSession().getAttribute(Constaint.TEST);
		for(int i=0;i<lstBook.size();i++){
			BookDto b = (BookDto) lstBook.get(i);
			logger.info(b.getTitle());
		}
		
		CartDto cart = (CartDto) req.getSession().getAttribute(Constaint.CART);
		Account account = (Account)req.getSession().getAttribute(Constaint.LOGIN);
	
		
		
		// Insert invoice
		invoiceService.insertInvoice(account, cart);
		
		req.getSession().setAttribute(Constaint.CART, null);
		return SUCCESS;
	}
	
	
}
