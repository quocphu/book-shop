package com.app.bookshop.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.ProcedureCall;
import org.seasar.dao.annotation.tiger.S2Dao;

import com.app.bookshop.dto.InvoiceParameter;
import com.app.bookshop.entity.Invoice;

/**
 * Content: get Invoice from database
 * @author khong.phu
 * @version 1.00
 */
@S2Dao(bean=Invoice.class)
public interface InvoiceDao {
	public int insert(Invoice invoice);
	
	@ProcedureCall("insertInvoice")
	public InvoiceParameter insertInvoice(InvoiceParameter invoice);

	@Arguments({"accountId"})
	public List<?> getAllInvoice(Integer accountId);
}
