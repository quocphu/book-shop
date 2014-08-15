package com.app.bookshop.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.app.bookshop.service.CategoryService;
import com.app.bookshop.service.impl.CategoryServiceImpl;

public class LoginFilter implements Filter {
	Logger logger = Logger.getLogger(getClass());

//	@Resource
//	CategoryService categoryService;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse respone, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("Login filter");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse)respone;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		if (session.getAttribute("LOGIN") == null && !(uri.endsWith("login.do") || uri.endsWith("login.jsp"))) {
//			request.getRequestDispatcher("/login.do").forward(request, respone);
		//	res.sendRedirect("/login.do");
		}
		
		// Get all category for menu
		if(session.getAttribute("LOGIN") != null){
//			CategoryService categoryService = new CategoryServiceImpl();
//			List category = categoryService.getAllCategory();
//			req.setAttribute("category", category);
		}
			chain.doFilter(request, respone);
		

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
