package com.app.bookshop.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

import com.app.bookshop.comon.Constaint;
import com.app.bookshop.entity.Account;
import com.app.bookshop.service.InvoiceService;

@StrutsAction(input = "/history.do")
public class HistoryAction extends BaseAction {
	@Resource
	InvoiceService invoiceService;

	@StrutsActionForward
	public static final String HISTORY = "/WEB-INF/view/bookshop/history.jsp";

	public String execute() {
		Account account = (Account) req.getAttribute(Constaint.LOGIN);
		List<?> listInvoice = invoiceService.getAllInvoice(account.getId());
		req.setAttribute(Constaint.INVOICE, listInvoice);

		return HISTORY;
	}
}
