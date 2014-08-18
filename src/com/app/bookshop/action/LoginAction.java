package com.app.bookshop.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.service.LoginService;

@StrutsAction(input = LoginAction.ERROR)
public class LoginAction extends BaseAction {


	@StrutsActionForward
	public static final String ERROR = "/WEB-INF/view/bookshop/login.jsp";

	@StrutsActionForward
	public static final String SUCCESS = "/books.do";

	@Resource
	BookDao bookDao;

	@Resource
	LoginService loginService;

	Logger logger = Logger.getLogger(getClass());

	public String execute() {
		String email, password, command;
		command = req.getParameter("command");
		email = req.getParameter("email");
		password = req.getParameter("password");
		
		if (req.getSession().getAttribute(Constaint.LOGIN) != null) {
			logger.info("session is existed");
			setCategory(req);
			return SUCCESS;
		}
		
		// Return login page if command == "login"
		if ("login".equals(command)) {
			logger.info("fisrt");
			return ERROR;
		}


		if (loginService.checkAccount(email, password)) {
			setCategory(req);
			req.getSession().setAttribute(Constaint.LOGIN, loginService.getAccountByEmail(email));
			req.getSession().setAttribute(Constaint.CART, null);
			
			logger.info("loggin ok");
			return SUCCESS;
		} else {
			logger.info("error");
			req.setAttribute("error", "Email or password is incorrect!");
			return ERROR;
		}

	}

}
