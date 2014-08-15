package com.app.bookshop.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartDto implements Serializable{
	private ArrayList<BookDto> books;
	
	private Integer itemTotal;
	private Integer moneyTotal;
	
	public ArrayList<BookDto> getBooks() {
		return books;
	}
	public void add(BookDto book){
		if(books == null){
			books= new ArrayList<BookDto>();
		}
		for(int i=0;i<books.size();i++){
			if(book.getId().equals(books.get(i).getId())){
				book.setAmount(book.getAmount()+books.get(i).getAmount());
				books.set(i, book);
				return;
			}
		}
		books.add(book);
		this.itemTotal = this.getItemTotal();
		this.moneyTotal=this.getMoneyTotal();
	}
	public Integer getItemTotal(){
		Integer total=0;
		for(int i=0;i<books.size();i++){
			total += books.get(i).getAmount();
		}
		return total;
	}
	public Integer getMoneyTotal(){
		Integer total=0;
		for(int i=0;i<books.size();i++){
			total += books.get(i).getAmount()*books.get(i).getPrice();
		}
		return total;
	}
}
