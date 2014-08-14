package com.app.bookshop.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;

import com.app.bookshop.entity.Account;
/**
 * Content: Account Dao
 * @author khong.phu
 * @version 1.00
 */
@S2Dao(bean=Account.class)
public interface AccountDao {
	@Arguments("email")
	public Account getAccountByEmail(String email);
}
