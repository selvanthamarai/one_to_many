package com.Library.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long personId;
	
	
	private String personName;
	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="book_personId")
	private List<OrderBook> orderBook;
	
	
	
	public List<OrderBook> getOrderBook() {
		return orderBook;
	}
	public void setOrderBook(List<OrderBook> orderBook) {
		this.orderBook = orderBook;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Book [personId=" + personId + ", personName=" + personName + ", orderBook=" + orderBook + "]";
	}
	
	
}
