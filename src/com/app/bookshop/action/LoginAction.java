package com.app.bookshop.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.service.LoginService;

@StrutsAction(input = LoginAction.ERROR)
public class LoginAction extends BaseAction {

	// private HttpServletRequest req;
	//
	//
	//
	// public void setReq(HttpServletRequest req) {
	// this.req = req;
	// }

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
		BookDto book = bookDao.getBookDtoById(1);
		logger.info("book1: " + book.getTitle());
		logger.info("book1: " + book.getCategoryName());
		// Return login page if command == "loggin"
		if ("login".equals(command)) {
			logger.info("fisrt");
			return ERROR;
		}

		if (req.getSession().getAttribute(Constaint.LOGIN) != null) {
			setCategory(req);
			return SUCCESS;
		}

		if (loginService.checkAccount(email, password)) {
			setCategory(req);
			req.getSession().setAttribute(Constaint.LOGIN, loginService.getAccountByEmail(email));
			return SUCCESS;
		} else {
			logger.info("error");
			req.setAttribute("error", "Email or password is incorrect!");
			return ERROR;
		}

	}

}
