package com.app.bookshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class LoginFilter implements Filter {
	Logger logger = Logger.getLogger(getClass());

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse respone, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("Login filter");
		
		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		if (session.getAttribute("LOGIN") == null && !(uri.endsWith("login.do") || uri.endsWith("login.jsp"))) {
			request.getRequestDispatcher("/login.do").forward(request, respone);

		} else {
			chain.doFilter(request, respone);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
