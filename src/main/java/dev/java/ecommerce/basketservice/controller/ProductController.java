package dev.java.ecommerce.basketservice.controller;

import dev.java.ecommerce.basketservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ResponseEntity<Void> getAllProducts(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> getProductsById(@PathVariable Long id){


        return ResponseEntity.ok().build();
    }
}
