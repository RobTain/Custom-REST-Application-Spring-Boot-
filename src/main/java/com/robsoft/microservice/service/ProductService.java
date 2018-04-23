package com.robsoft.microservice.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.robsoft.microservice.model.Product;

public interface ProductService extends CrudRepository<Product, Integer> {
	
	// Search 
//@Query("FROM PRODUCT WHERE NAME LIKE %:keyword%")
//	public List<Product> search(@Param("keyword") String keyword);

}
