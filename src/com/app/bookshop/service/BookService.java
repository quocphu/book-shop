package com.app.bookshop.service;

import java.util.List;

import com.app.bookshop.dto.BookDto;
/**
 * Content: Book processing
 * @author khong.phu
 * @version 1.00
 */
public interface BookService {

	/**
	 * Get all book from database
	 * @return List of book
	 */
	List<?> getAllBook();
	List<?> getBookPerPage(Integer page, Integer num);
	
	/**
	 * Get all book of category
	 * @param categoryId
	 * @return List of book
	 */
	List<?> getBookByCategory(String categoryId);
	
	/**
	 * Get book by id
	 * @param id
	 * @return BookDto
	 */
	BookDto getBookDto(Integer id);
}
