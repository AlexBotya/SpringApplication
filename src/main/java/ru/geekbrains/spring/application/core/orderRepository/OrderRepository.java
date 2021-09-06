package ru.geekbrains.spring.application.core.orderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import ru.geekbrains.spring.application.core.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OrderRepository {
    private ArrayList<Order> orders;
    public OrderRepository() {
        this.orders = new ArrayList<>(
                List.of(
                        new Order(1, LocalDate.now(), 100,  new ArrayList<>(
                                List.of(
                                        new Product(1, "Item1.1", 123),
                                        new Product(2, "Item1.2", 123),
                                        new Product(3, "Item1.3", 123),
                                        new Product(4, "Item1.4", 123),
                                        new Product(5, "Item1.5", 123)
                                )
                        )),
                                new Order(2, LocalDate.now(), 300, new ArrayList<>(
                                        List.of(
                                                new Product(6, "Item2.1", 123),
                                                new Product(7, "Item2.2", 123),
                                                new Product(8, "Item2.3", 123),
                                                new Product(9, "Item2.4", 123),
                                                new Product(10, "Item2.5", 123)
                                        )
                                )
                        )));
    }

    public Optional<Order> findById(int id) {
        return orders.stream().filter(o->o.getId() == id).findFirst();
    }


    public List<Order> findAll() {
        return orders;
    }
    public void add(Order order){
        orders.add(order);
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "products=" + orders +
                '}';
    }
}

