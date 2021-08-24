package ru.geekbrains.spring.application.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class AppProcessor {
    @Autowired
    public void appProceed(Cart cart, ProductRepository productRepository){
        Scanner scanner = new Scanner(System.in);
        label:
        while (true){
            System.out.println("Choose an action...\n(for help input -h)");
            String input = scanner.next();
            switch (input) {
                case "-h":
                    System.out.println("-r - remove item\n -e - exit\n -a add new \n -pr print product repository \n - pid print product by id" +
                            "\n -pc print cart");
                    break;
                case "-r":
                    cart.removeProduct();
                    break;
                case "-e":
                    break label;
                case "-pr":
                    System.out.println(productRepository);
                    break;
                case "-a":
                    cart.addProduct(productRepository);
                    break;
                case "-pc":
                    System.out.println(cart);
                    break;
                case "-pid":
                    productRepository.showProductById();
                    break;
                default:
                    System.out.println("Incorrect command. Try again..");
                    break;
            }
        }
    }
}
