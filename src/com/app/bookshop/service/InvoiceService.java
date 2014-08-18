package com.app.bookshop.service;

import com.app.bookshop.dto.CartDto;
import com.app.bookshop.entity.Account;
/**
 * Content: Invoice processing
 * @author khong.phu
 * @version 1.00
 */
public interface InvoiceService {
	/**
	 * Insert invoice and invoice's detail to database
	 * @param account
	 * @param cart
	 * @return id of invoice is inserted
	 */
	public Integer insertInvoice(Account account, CartDto cart);
}
