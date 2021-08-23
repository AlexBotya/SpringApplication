import ru.geekbrains.spring.application.core.Cart;
import ru.geekbrains.spring.application.core.ProductRepository;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {

        ProductRepository productRepository= new ProductRepository();
        Cart cart = new Cart();

        Scanner scanner = new Scanner(System.in);
        label:
        while (true){
            System.out.println("Choose an action...\n(for help input -h)");
            String input = scanner.next();
            switch (input) {
                case "-h":
                    System.out.println("-r - remove item\n -e - exit\n -a add new \n -pr print product repository" +
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
                default:
                    System.out.println("Incorrect command. Try again..");
                    break;
            }
        }

    }
}
