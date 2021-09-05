package ru.geekbrains.spring.application.core.orderRepository;

import ru.geekbrains.spring.application.core.Product;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private double cost;
    private List<Product> product;

    public Order(int id, LocalDate date, float cost, List<Product> product) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    public List<Product> getProduct() {
        return product;
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

}
