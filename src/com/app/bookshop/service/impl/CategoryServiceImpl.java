package com.app.bookshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.app.bookshop.dao.CategoryDao;
import com.app.bookshop.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	@Resource
	CategoryDao categoryDao;
	@Override
	public List<?> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategory();
	}

}
