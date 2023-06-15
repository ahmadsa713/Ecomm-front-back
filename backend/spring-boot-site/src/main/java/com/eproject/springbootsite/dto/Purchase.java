package com.eproject.springbootsite.dto;


import com.eproject.springbootsite.entity.Address;
import com.eproject.springbootsite.entity.Customer;
import com.eproject.springbootsite.entity.Order;
import com.eproject.springbootsite.entity.OrderItem;
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
