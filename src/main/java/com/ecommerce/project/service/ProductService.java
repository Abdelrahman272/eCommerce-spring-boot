package com.ecommerce.project.service;

import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;

@Service
public interface ProductService {

    ProductDTO addProduct(Long categoryId, Product product);

}
