package com.app.bookshop.dao;

import org.seasar.dao.annotation.tiger.ProcedureCall;
import org.seasar.dao.annotation.tiger.S2Dao;

import com.app.bookshop.dto.InvoiceParameter;
import com.app.bookshop.entity.Invoice;
@S2Dao(bean=Invoice.class)
public interface InvoiceDao {
	public int insert(Invoice invoice);
	
	@ProcedureCall("insertInvoice")
	public InvoiceParameter insertInvoice(InvoiceParameter invoice);
}
