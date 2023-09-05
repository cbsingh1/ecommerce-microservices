package com.cbsingh.PaymentService.service;

import com.cbsingh.PaymentService.model.PaymentRequest;
import com.cbsingh.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
