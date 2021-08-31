package ru.geekbrains.spring.application.core.orderRepository;

import java.util.ArrayList;


public class OrderRepository extends ArrayList<Order> {

    public void addOrder(Order order){
        this.add(order);
    }

    public ArrayList<Order> getListOfOrderByProductId(int productId){
        ArrayList<Order> arrayList = new ArrayList<>();

        this.stream().forEach(o -> {
            if (o.getProductId() == productId){
                arrayList.add(o);
            }
        });
        return arrayList;
    }
}
