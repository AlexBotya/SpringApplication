package ru.geekbrains.spring.application.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ProductRepository extends ArrayList<Product>{
    private Product productForRemove;

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
                sb.toString() +
                '}';
    }
    public void removeProduct(int idForRemove){

        Stream<Product> stream = this.stream();

        stream.forEach(n->{
            if (n.getId() == idForRemove){
                productForRemove = n;
                System.out.println(productForRemove.toString());
            }
        });
        this.remove(productForRemove);
    }

    public void addProduct(){

        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        int cost;
        System.out.println("Input ID..");
        id = scanner.nextInt();
        System.out.println("Input name..");
        name = scanner.next();
        System.out.println("Input cost..");
        cost = scanner.nextInt();
        this.add(new Product(id, name, cost));

    }
}
