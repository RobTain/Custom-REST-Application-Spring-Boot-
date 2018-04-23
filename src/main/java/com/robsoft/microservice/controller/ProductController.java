package com.robsoft.microservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robsoft.microservice.model.Product;
import com.robsoft.microservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Product>> findAll() {
		return new ResponseEntity<Iterable<Product>>(productService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Product>> findById(@PathVariable("id") int id) {
		return new ResponseEntity<Optional<Product>>(productService.findById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/products/search/{value}", method = RequestMethod.GET) 
		public ResponseEntity<List<Product>> findKeyword(@PathVariable("value") String string) {
			return new ResponseEntity<List<Product>>(productService.search(string), HttpStatus.OK);
		}
	
}
