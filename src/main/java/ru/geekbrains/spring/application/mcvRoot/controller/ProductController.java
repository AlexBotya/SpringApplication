package ru.geekbrains.spring.application.mcvRoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.spring.application.core.Product;
import ru.geekbrains.spring.application.core.ProductRepository;

@Controller

public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(name = "/products", method = RequestMethod.GET)
    public String findAll(Model model){
        model.addAttribute("products", repository);
        return "products";

    }

    @RequestMapping(name = "/products/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){

    }
    @RequestMapping(name = "/products/", method = RequestMethod.POST)
    public void add(Product product){

    }

}
