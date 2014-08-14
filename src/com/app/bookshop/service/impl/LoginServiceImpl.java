package com.app.bookshop.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.app.bookshop.dao.AccountDao;
import com.app.bookshop.entity.Account;
import com.app.bookshop.service.LoginService;

public class LoginServiceImpl implements LoginService {
	Logger logger = Logger.getLogger(getClass());
	
	@Resource
	private AccountDao accountDao;
	
	@Override
	public boolean checkAccount(String email, String password) {
		// TODO Auto-generated method stub
		
		logger.info("email: " + email);
		logger.info("password: " + password);
		if(email == "" || password ==""){
			return false;
		}

		Account account = accountDao.getAccountByEmail(email);

		
		return account != null && account.getPassword().equals(password);
		
	}

	@Override
	public Account getAccountByEmail(String email) {
		// TODO Auto-generated method stub
		return accountDao.getAccountByEmail(email);
	}

}
