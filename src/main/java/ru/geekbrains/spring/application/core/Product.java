package ru.geekbrains.spring.application.core;

public class Product {
    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }
}
