package ru.geekbrains.spring.application.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;


public class ProductRepository extends ArrayList<Product>{

    @Autowired
    public ProductRepository() {

        add(new Product(1, "Potato", 10));
        add(new Product(2, "Mushrooms", 50));
        add(new Product(3, "Porridge", 15));
        add(new Product(4, "Apple", 20));
        add(new Product(5, "Grape", 35));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product:this) {
            sb.append(product.toString());

        }
        return "ProductRepository{\n" +
                sb +
                '}';
    }
    public Optional<Product> findById(int id){
        return this.stream().filter(p -> p.getId() == id).findFirst();
    }
    public List<Product> findAll(){
        return this;
    }
}
