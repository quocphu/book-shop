package com.app.bookshop.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.service.CategoryService;

public class BaseAction {
	protected HttpServletRequest req;

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
