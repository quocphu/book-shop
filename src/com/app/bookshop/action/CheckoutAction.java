package com.app.bookshop.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.service.BookService;

public class CheckoutAction extends BaseAction {

	@StrutsActionForward
	public static final String SUCCESS = "/WEB-INF/view/bookshop/checkout.jsp";

	@Resource
	BookService bookService;

	public String execute() {
		// Check login status
		if (!isLogined(req)) {
			return BaseAction.LOGIN;
		}

		if (req.getSession().getAttribute(Constaint.CART) == null) {
			return BaseAction.LOGIN;
		}

		CartDto cart = (CartDto) req.getSession().getAttribute(Constaint.CART);

		req.getSession().setAttribute(Constaint.CART, cart);
		return SUCCESS;
	}
}
