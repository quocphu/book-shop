package com.app.bookshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.app.bookshop.dao.BookDao;
import com.app.bookshop.dto.BookDto;
import com.app.bookshop.service.BookService;

public class BookServiceImpl implements BookService {

	@Resource
	BookDao bookDao;
	
	@Override
	public List getAllBook() {
		// TODO Auto-generated method stub
		return bookDao.getAllBookDto();
	}

	@Override
	public List getBookPerPage(Integer page, Integer num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto getBookDto(Integer id) {
		// TODO Auto-generated method stub
		return bookDao.getBookDtoById(id);
	}

	@Override
	public List getBookByCategory(String categoryId) {
		// TODO Auto-generated method stub
		return bookDao.getBookByCategory(categoryId);
	}

}
