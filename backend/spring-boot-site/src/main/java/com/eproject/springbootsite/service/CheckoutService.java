package com.eproject.springbootsite.service;

import com.eproject.springbootsite.dto.Purchase;
import com.eproject.springbootsite.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
