package com.app.bookshop.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.service.BookService;

/**
 * Content: Show detail of book
 * 
 * @author khong.phu
 * @version 1.00
 */

@StrutsAction(input = BookdetailAction.DETAIL)
public class BookdetailAction extends BaseAction {
	@StrutsActionForward
	public static final String DETAIL = "/WEB-INF/view/bookshop/bookdetail.jsp";

	@Resource
	BookService bookService;

	public String execute() {
		// Check login status
		if (!isLogined(req)) {
			return BaseAction.LOGIN;
		}

		// Get page
		String bookIdString = req.getParameter("id");
		Integer bookId;

		try {
			bookId = Integer.parseInt(bookIdString);
		} catch (Exception ex) {
			bookId = 0;
		}

		req.setAttribute("book", bookService.getBookDto(bookId));

		return DETAIL;
	}
}
