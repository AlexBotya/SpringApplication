package ru.geekbrains.spring.application.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class AppProcessor {
    private Cart cart;
    private ProductRepository productRepository;

@Autowired
    public AppProcessor(Cart cart, ProductRepository productRepository) {
        this.cart = cart;
        this.productRepository = productRepository;
    }

    public void appProceed(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Choose an action...\n(for help input -h)");
            String input = scanner.next();
            switch (input) {
                case "-h":
                    System.out.println("-r - remove item\n -e - exit\n -a add new \n -pr print product repository \n - pid print product by id" +
                            "\n -pc print cart");
                    break;
                case "-cr":
                    System.out.println("Input ID for remove");
                    cart.removeProduct(scanner.nextInt());
                    break;
                case "-e":
                    break;
                case "-pr":
                    System.out.println(productRepository.findAll());
                    break;
                case "-ca":
                    System.out.println("Input product ID for add..");
                    cart.addProduct(scanner.nextInt());
                    break;
                case "-cp":
                    System.out.println(cart);
                    break;
                case "-rpid":
                    System.out.println("Input ID to show");
                    System.out.println(productRepository.findById(scanner.nextInt()));
                    break;
                default:
                    System.out.println("Incorrect command. Please, try again..");
                    break;
            }
        }
    }
}
