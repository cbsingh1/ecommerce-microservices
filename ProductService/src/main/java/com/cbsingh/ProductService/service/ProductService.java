package com.cbsingh.ProductService.service;

import com.cbsingh.ProductService.model.ProductRequest;
import com.cbsingh.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
