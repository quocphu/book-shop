package com.app.bookshop.dto;

import com.app.bookshop.entity.Book;

public class BookDto extends Book{
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
