package com.example.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.entity.Product;
import com.example.curso.repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}
}
