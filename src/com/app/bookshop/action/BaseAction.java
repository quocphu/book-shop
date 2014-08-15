package com.app.bookshop.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.service.CategoryService;

public class BaseAction {
	
	Logger logger = Logger.getLogger(getClass());
	
	protected HttpServletRequest req;
	@StrutsActionForward
	public static final String LOGIN = "/login.do";
	
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}

	@Resource
	CategoryService categoryService;

	public void setCategory(HttpServletRequest req) {
		List category = categoryService.getAllCategory();
		req.setAttribute("category", category);
	}
	
	public boolean isLogined(HttpServletRequest req) {
		return req.getSession().getAttribute(Constaint.LOGIN)!=null;
	}
}
