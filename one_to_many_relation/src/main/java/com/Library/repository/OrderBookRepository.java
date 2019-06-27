package com.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Library.model.OrderBook;

public interface OrderBookRepository extends JpaRepository<OrderBook, Long> {

}
