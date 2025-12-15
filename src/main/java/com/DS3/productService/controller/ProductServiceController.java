package com.DS3.productService.controller;

import com.DS3.productService.model.ProductService;
import com.DS3.productService.repository.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/productService")
public class ProductServiceController {
    @Autowired
    private ProductServiceRepository productServiceRepository;

    @GetMapping
    public List<ProductService> getAll() {
        return productServiceRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProductService getById(@PathVariable Long id){
        return productServiceRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ProductService save(@RequestBody ProductService productService) {
        return productServiceRepository.save(productService);
    }

    @PutMapping("/{id}")
    public ProductService update(@PathVariable Long id, @RequestBody ProductService productService){
        productService.setId(id);
        return productServiceRepository.save(productService);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        productServiceRepository.deleteById(id);
    }
}
