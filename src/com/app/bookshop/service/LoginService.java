package com.app.bookshop.service;

import com.app.bookshop.entity.Account;
/**
 * Content: Account processing
 * @author khong.phu
 * @version 1.00
 */
public interface LoginService {
	/**
	 * Check account is valid
	 * @param email
	 * @param password
	 * @return
	 */
	public boolean checkAccount(String email, String password);
	
	/**
	 * get account from database by email
	 * @param email
	 * @return
	 */
	public Account getAccountByEmail(String email);
}
