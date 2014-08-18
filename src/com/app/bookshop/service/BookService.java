package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.BookDto;
@SuppressWarnings("rawtypes")
public interface BookService {

	List getAllBook();
	List getBookPerPage(Integer page, Integer num);
	List getBookByCategory(String categoryId);
	BookDto getBookDto(Integer id);
}
