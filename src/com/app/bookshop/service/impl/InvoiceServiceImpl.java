package com.app.bookshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dao.InvoiceDao;
import com.app.bookshop.dao.InvoiceDetailDao;
import com.app.bookshop.dto.CartDto;
import com.app.bookshop.dto.InvoiceParameter;
import com.app.bookshop.entity.Account;
import com.app.bookshop.entity.InvoiceDetail;
import com.app.bookshop.service.InvoiceService;

public class InvoiceServiceImpl implements InvoiceService {

	@Resource
	InvoiceDao invoiceDao;

	@Resource
	InvoiceDetailDao invoiceDetailDao;
	
	@Resource	
	BookDao bookDao;
	
	@Override
	public Integer insertInvoice(Account account, CartDto cart) {
		// TODO Auto-generated method stub

		InvoiceParameter invoice = new InvoiceParameter();

		invoice.accountId = account.getId();
		invoice.total = cart.getMoneyTotal();

		Integer invoiceId = invoiceDao.insertInvoice(invoice).id;

		for (int i = 0; i < cart.getBooks().size(); i++) {
			InvoiceDetail ivd = new InvoiceDetail();
			ivd.setInvoiceId(invoiceId);
			ivd.setBookId(cart.getBooks().get(i).getId());
			ivd.setAmount(cart.getBooks().get(i).getAmount());
			ivd.setPrice(cart.getBooks().get(i).getPrice());
			
			// Insert invoice detail
			invoiceDetailDao.insert(ivd);
			
			//Update amount of book
			bookDao.updateAmount(cart.getBooks().get(i).getId(), cart.getBooks().get(i).getAmount());
		}
		return invoiceId;
	}

	@Override
	public List<?> getAllInvoice(Integer accountId) {
		// TODO Auto-generated method stub
		return invoiceDao.getAllInvoice(accountId);
	}

}
