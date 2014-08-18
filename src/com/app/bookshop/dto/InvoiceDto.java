package com.app.bookshop.dto;

import com.app.bookshop.entity.Invoice;

public class InvoiceDto extends Invoice{
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
