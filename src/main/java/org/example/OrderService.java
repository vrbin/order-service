package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    private final OrderJpaRepository orderJpaRepository;
    @Autowired
    public OrderService(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    public void addOrder(Order order) {
        orderJpaRepository.save(order);
    }
    public List<Order> getOrders() {
        return orderJpaRepository.findAll();
    }
    public Order getOrderById(long id) {
        return orderJpaRepository.findById(id).orElseThrow(
                () -> new OrderNotFoundException("Objednavka s nenalezena.")
        );
    }

}