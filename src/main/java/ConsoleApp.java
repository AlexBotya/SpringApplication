import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.geekbrains.spring.application.core.AppProcessor;
import ru.geekbrains.spring.application.core.Cart;
import ru.geekbrains.spring.application.core.ProductRepository;

public class ConsoleApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context-annotation.xml");
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Cart cart = context.getBean(Cart.class);
        AppProcessor appProcessor = context.getBean(AppProcessor.class);
        appProcessor.appProceed(cart, productRepository);

    }

}
