package com.app.bookshop.entity;

import java.io.Serializable;

import org.seasar.dao.annotation.tiger.Bean;

@Bean(table="Category")
public class Category implements Serializable{
	private int id;
	private String code;
	private String name;
	private Integer status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
