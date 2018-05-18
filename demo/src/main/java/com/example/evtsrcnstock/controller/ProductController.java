package com.example.evtsrcnstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.evtsrcnstock.entity.Product;
import com.example.evtsrcnstock.entity.TheLogConverter;
import com.example.evtsrcnstock.service.ProductLogService;
import com.example.evtsrcnstock.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("categories/{id}/products")
public class ProductController {


    @Autowired
    public ProductService productService;
    @Autowired
    private ProductLogService productLogService;


    @RequestMapping("")
    public Iterable<Product> getAllProducts() {
        return productService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Product> searchProduct(@PathVariable int id) {
        return productService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProduct(@RequestBody Product product) {
        productService.insert(product);
        productLogService.insert(TheLogConverter.productLogConverter(product));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        productLogService.insert(TheLogConverter.productLogConverter(product));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
        productLogService.insert(TheLogConverter.productLogConverter(product));
    }


}