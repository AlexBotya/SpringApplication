package ru.geekbrains.spring.application.core.orderRepository;

import ru.geekbrains.spring.application.core.Product;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private double cost;
    private Product product;

    public Order(int id, Product product) {
        this.id = id;
        this.date = new Date();
        this.cost = product.getCost();
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", product=" + product +
                '}';
    }

    public int getProductId() {
        return product.getId();
    }
}
