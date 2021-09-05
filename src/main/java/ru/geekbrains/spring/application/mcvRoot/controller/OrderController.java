package ru.geekbrains.spring.application.mcvRoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.spring.application.core.Product;
import ru.geekbrains.spring.application.core.orderRepository.Order;
import ru.geekbrains.spring.application.core.orderRepository.OrderRepository;

@Controller
public class OrderController {
    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @RequestMapping (value = "/orders/add", method = RequestMethod.GET)
    public String add() {
        return "orders-add";
    }

    @RequestMapping (value = "/orders/add", method = RequestMethod.POST)
    public String add (Order order){
        repository.add(order);
        return "orders";
    }
}
