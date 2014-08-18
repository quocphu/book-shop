package com.app.bookshop.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.service.LoginService;
@StrutsAction( input=LogoutAction.LOGOUT)
public class LogoutAction extends BaseAction {
//	private HttpServletRequest req;
//
//	public void setReq(HttpServletRequest req) {
//		this.req = req;
//	}

	@StrutsActionForward
	public static final String LOGOUT = "/WEB-INF/view/bookshop/login.jsp";


	@Resource
	LoginService loginService;

	Logger logger = Logger.getLogger(getClass());

	public String execute() {
		req.getSession().setAttribute("LOGIN", null);
		return LOGOUT;

	}
}
