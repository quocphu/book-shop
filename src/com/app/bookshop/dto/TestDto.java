package com.app.bookshop.dto;

import org.seasar.dao.annotation.tiger.ParameterType;
import org.seasar.dao.annotation.tiger.ProcedureParameter;

public class TestDto {
	@ProcedureParameter(ParameterType.RETURN)
	public Integer id;
	 @ProcedureParameter (ParameterType.IN)
	public String no;
}
