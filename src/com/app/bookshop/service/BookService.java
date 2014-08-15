package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.BookDto;

public interface BookService {
	List getAllBook();
	List getBookPerPage(Integer page, Integer num);
	BookDto getBookDto(Integer id);
}
