package com.app.bookshop.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import org.seasar.dao.annotation.tiger.SqlFile;

import com.app.bookshop.entity.InvoiceDetail;
@S2Dao(bean=InvoiceDetail.class)
public interface InvoiceDetailDao {
	@SqlFile
	@Arguments({"invoiceDetail"}) 
	public int insert(InvoiceDetail invoiceDetail);
}
