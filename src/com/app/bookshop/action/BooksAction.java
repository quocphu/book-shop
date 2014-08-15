package com.app.bookshop.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.service.BookService;

@StrutsAction( input=BooksAction.PRODUCT)
public class BooksAction extends BaseAction{
	@StrutsActionForward
	public static final String PRODUCT="/WEB-INF/view/bookshop/product.jsp";
	
	@Resource
	BookService bookService;
	
	public String execute() {
		// Check login status
		if(!isLogined(req)){
			return LoginAction.ERROR;
		}
		
		// Get page
		String pageString = req.getParameter("page");
		Integer page;
		if(pageString == ""){
			page=0;
		}else{
			try{
				page = Integer.parseInt(pageString);
			}catch(Exception ex){
				page = 0;
			}
		}
		
		req.setAttribute("books", bookService.getAllBook());
		
		return PRODUCT;
	}
}
