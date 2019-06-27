package com.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Library.model.Book;
import com.Library.model.OrderBook;
import com.Library.service.Service;

@RestController
@RequestMapping("book")
public class BookController {
@Autowired
	Service service;
	
	
	@PostMapping("add")
	private Book add(@RequestBody Book A) {
		return service.addDetail(A);
	}

}
