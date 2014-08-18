package com.app.bookshop.action;

import org.seasar.struts.annotation.tiger.StrutsAction;
import org.seasar.struts.annotation.tiger.StrutsActionForward;

@StrutsAction(input = BookdetailAction.DETAIL)
public class CartdetailAction extends BaseAction {
	@StrutsActionForward
	public static final String DETAIL = "/WEB-INF/view/bookshop/cartdetail.jsp";

	public String execute() {

		// Check login status
		if (!isLogined(req)) {
			return BaseAction.LOGIN;
		}
		
		setCategory(req);
		
		return DETAIL;
	}
}
