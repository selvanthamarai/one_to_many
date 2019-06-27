package com.Library.model;







import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class OrderBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
	@Column(name = "bookName")
	private String bookName;
	
	
	@ManyToOne
	 @JoinColumn(name="book_personId")
	public Book book;
	
	

	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public long getPersonId() {
		return Id;
	}


	public void setPersonId(long personId) {
		this.Id = personId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "OrderBook [personId=" + Id + ", bookName=" + bookName + ", book=" + book + "]";
	}

	


}
