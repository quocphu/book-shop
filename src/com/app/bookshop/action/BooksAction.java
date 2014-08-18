package com.app.bookshop.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.service.BookService;
/**
 * Content: Show all available book
 * @author khong.phu
 * @version 1.00
 */
@StrutsAction(input = BooksAction.PRODUCT)
public class BooksAction extends BaseAction {
	@StrutsActionForward
	public static final String PRODUCT = "/WEB-INF/view/bookshop/product.jsp";

	@Resource
	BookService bookService;

	public String execute() {
		// Check login status
		if (!isLogined(req)) {
			return LoginAction.ERROR;
		}

		// Get page
//		String pageString = req.getParameter("page");
		String categoryString =req.getParameter("categoryid");
		
//		Integer page;
//		if (pageString == "") {
//			page = 0;
//		} else {
//			try {
//				page = Integer.parseInt(pageString);
//			} catch (Exception ex) {
//				page = 0;
//			}
//		}
		
		// If categoryid is null, we will get all book
		if(categoryString != null && categoryString != ""){
			req.setAttribute("books", bookService.getBookByCategory(categoryString));
		}else{
			req.setAttribute("books", bookService.getAllBook());
		}
		
		return PRODUCT;
	}
}
