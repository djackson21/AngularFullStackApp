package com.minoritypioneer.ecommerce.dto;

import com.minoritypioneer.ecommerce.entity.Address;
import com.minoritypioneer.ecommerce.entity.Customer;
import com.minoritypioneer.ecommerce.entity.Order;
import com.minoritypioneer.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
