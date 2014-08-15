package com.app.bookshop.dao;

import java.util.List;

import org.seasar.dao.annotation.tiger.S2Dao;

import com.app.bookshop.entity.Category;

@S2Dao(bean=Category.class)
public interface CategoryDao {
	public List getAllCategory();
}
