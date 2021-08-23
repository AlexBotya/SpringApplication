import ru.geekbrains.spring.application.core.ProductRepository;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {

        ProductRepository productRepository= new ProductRepository();

        Scanner scanner = new Scanner(System.in);
        label:
        while (true){
            System.out.println("Choose an action...\n(for help input -h)");
            String input = scanner.next();
            switch (input) {
                case "-h":
                    System.out.println("-r - remove item\n -e - exit\n -a add new \n -p print cart");
                    break;
                case "-r":
                    System.out.println("Input product ID to remove from cart:");
                    int itemId = scanner.nextInt();
                    productRepository.removeProduct(itemId);
                    break;
                case "-e":
                    break label;
                case "-p":
                    System.out.println(productRepository);
                    break;
                case "-a":
                    productRepository.addProduct();
                    break;
                default:
                    System.out.println("Incorrect command. Try again..");
                    break;
            }
        }

    }
}
