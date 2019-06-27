package com.Library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Library.model.Book;
import com.Library.model.OrderBook;
import com.Library.repository.BookRepository;
import com.Library.repository.OrderBookRepository;
@Component
public class Service {
    @Autowired
	BookRepository bookrep;
	@Autowired
	OrderBookRepository rep;
	
	
	public Book addDetail(Book C) {
		return bookrep.save(C);
	}
	

}
