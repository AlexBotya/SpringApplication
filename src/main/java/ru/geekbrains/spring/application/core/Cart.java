package ru.geekbrains.spring.application.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Cart extends ArrayList<Product> {
    private ProductRepository productRepository;

    @Autowired
    Cart(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : this) {
            sb.append(product.toString());
        }
        return "Cart{\n" +
                sb +
                '}';
    }

    public void removeProduct(int id) {
        this.remove(this.stream().filter(p->p.getId() == id).findFirst());
    }

    public void addProduct(int id) {
        productRepository.findById(id).ifPresent(p->this.add(p));
    }
}
