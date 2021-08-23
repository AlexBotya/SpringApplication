package ru.geekbrains.spring.application.core;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Cart extends ArrayList<Product> {
    private Product productForRemove;
    private final Scanner scanner = new Scanner(System.in);
    public Cart() {

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : this) {
            sb.append(product.toString());

        }
        return "ProductRepository{\n" +
                sb +
                '}';
    }

    public void removeProduct() {
        int idForRemove;
        System.out.println("Input product ID for remove..");
        idForRemove = scanner.nextInt();
        Stream<Product> stream = this.stream();

        stream.forEach(n -> {
            if (n.getId() == idForRemove) {
                productForRemove = n;
            }
        });
        this.remove(productForRemove);
    }

    public void addProduct(ProductRepository productRepository) {

        int id;
        System.out.println("Input ID to add..");
        id = scanner.nextInt();
        Stream<Product> stream = productRepository.stream();
        stream.forEach(n -> {
            if (n.getId() == id)
                this.add(n);
           });
    }
}
