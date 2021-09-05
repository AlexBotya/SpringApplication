package ru.geekbrains.spring.application.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.spring.application.core.orderRepository.OrderRepository;

@Configuration
public class ConsoleAppConfiguration {
    @Bean
    public ProductRepository productRepository(){
        return new ProductRepository();
    }

    @Bean
    public Cart cart(ProductRepository productRepository){
        return new Cart(productRepository);
    }
    @Bean

    public AppProcessor AppProcessor(Cart cart, ProductRepository productRepository){
        return new AppProcessor(cart, productRepository);
    }
    @Bean
    public OrderRepository orderRepository(){
        return new OrderRepository();
    }

}
