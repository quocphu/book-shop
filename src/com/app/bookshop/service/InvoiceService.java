package com.app.bookshop.service;

import com.app.bookshop.dto.CartDto;
import com.app.bookshop.entity.Account;

public interface InvoiceService {
	public Integer insertInvoice(Account account, CartDto cart);
}
