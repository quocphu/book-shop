package com.app.bookshop.service.impl;

import javax.annotation.Resource;

import com.app.bookshop.dao.InvoiceDao;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.dto.InvoiceParameter;
import com.app.bookshop.entity.Account;
import com.app.bookshop.service.InvoiceService;

public class InvoiceServiceImpl  implements InvoiceService {

	@Resource
	InvoiceDao invoiceDao;
	@Override
	public Integer insertInvoice(Account account, CartDto cart) {
		// TODO Auto-generated method stub
		
		InvoiceParameter invoice = new InvoiceParameter();
		
		invoice.accountId = account.getId();
		invoice.total = cart.getMoneyTotal();
		return invoiceDao.insertInvoice(invoice).id;
	}

}
