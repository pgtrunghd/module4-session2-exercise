package com.homework.module4session2.service;

import com.homework.module4session2.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String healthCheck() {
        return "Order Service is Up";
    }
}
