package com.multipolar.bootcamp.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> Products(){
        List<Product> productList = List.of(
                new Product(1, "Milo"),
                new Product(2, "Cimory"),
                new Product(3, "Frisian Flag"),
                new Product(4, "Hilo")
        );
        return ResponseEntity.ok(productList);
    }
}
