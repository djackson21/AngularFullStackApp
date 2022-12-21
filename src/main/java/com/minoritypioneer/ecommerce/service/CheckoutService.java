package com.minoritypioneer.ecommerce.service;

import com.minoritypioneer.ecommerce.dto.Purchase;
import com.minoritypioneer.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
