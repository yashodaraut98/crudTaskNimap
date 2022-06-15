package com.te.crudd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.crudd.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	// save();

}
