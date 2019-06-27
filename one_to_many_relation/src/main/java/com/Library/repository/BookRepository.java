package com.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
