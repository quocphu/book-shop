package com.app.bookshop.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import org.seasar.dao.annotation.tiger.SqlFile;

import com.app.bookshop.dto.BookDto;
import com.app.bookshop.entity.Book;

/**
 * Content: Book Dao
 * @author khong.phu
 * @version 1.00
 */
@S2Dao(bean = Book.class)
public interface BookDao {
	@Arguments("id")
	public Book getBookById(Integer id);
	
	@SqlFile
	@Arguments("id")
	public BookDto getBookDtoById(Integer id);

	public List getAllBookDto();
	
	@Arguments({"page", "num"})
	public List getBookDtoLimit(Integer limit, Integer offset);
}
