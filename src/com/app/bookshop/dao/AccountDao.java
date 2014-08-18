package com.app.bookshop.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;

import com.app.bookshop.entity.Account;
/**
 * Content: get Account form database
 * @author khong.phu
 * @version 1.00
 */
@S2Dao(bean=Account.class)
public interface AccountDao {
	@Arguments("email")
	public Account getAccountByEmail(String email);
}
