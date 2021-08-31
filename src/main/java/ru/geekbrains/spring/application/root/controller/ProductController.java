package ru.geekbrains.spring.application.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ProductController {
    @RequestMapping(name = "/products", method = RequestMethod.GET)
    public void findAll(){

    }

    @RequestMapping(name = "/products/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){

    }
    @RequestMapping(name = "/products/", method = RequestMethod.POST)
    public void add(){

    }

}
