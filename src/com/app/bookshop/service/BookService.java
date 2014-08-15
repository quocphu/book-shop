package com.app.bookshop.service;

import java.util.List;

public interface BookService {
	List getAllBook();
	List getBookPerPage(Integer page, Integer num);
}
