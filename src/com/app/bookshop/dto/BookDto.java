package com.app.bookshop.dto;

import java.io.Serializable;

import com.app.bookshop.entity.Book;

public class BookDto extends Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString(){
		return this.getTitle();
	}
}
