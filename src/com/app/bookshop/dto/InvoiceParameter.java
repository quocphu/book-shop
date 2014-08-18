package com.app.bookshop.dto;

import org.seasar.dao.annotation.tiger.ParameterType;
import org.seasar.dao.annotation.tiger.ProcedureParameter;

public class InvoiceParameter {
	@ProcedureParameter(ParameterType.RETURN)
	public Integer id;
	@ProcedureParameter(ParameterType.IN)
	public Integer accountId;
	@ProcedureParameter(ParameterType.IN)
	public Integer total;
	

}
