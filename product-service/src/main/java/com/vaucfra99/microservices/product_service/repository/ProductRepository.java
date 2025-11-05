package com.vaucfra99.microservices.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vaucfra99.microservices.product_service.model.Product;


public interface ProductRepository extends MongoRepository<Product, String>{

}