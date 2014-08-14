package com.app.bookshop.service;

import com.app.bookshop.entity.Account;

public interface LoginService {
	public boolean checkAccount(String email, String password);
	public Account getAccountByEmail(String email);
}
