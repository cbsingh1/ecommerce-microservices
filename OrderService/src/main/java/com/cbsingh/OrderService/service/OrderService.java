package com.cbsingh.OrderService.service;

import com.cbsingh.OrderService.model.OrderRequest;
import com.cbsingh.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
