package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public void addProduct(Product p) {
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProductById(int id) {
        return db.findById(id);
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }

    public List<Product> getProductsOutOfWarranty(int year) {
        return db.findByWarrantyLessThan(year);
    }

    public List<Product> getProductsByPlace(String place) {
        return db.findByPlaceIgnoreCase(place);
    }

    public List<Product> getProductsWithText(String text) {
        return db.findByNameContainsIgnoreCaseOrTypeContainsIgnoreCaseOrPlaceContainsIgnoreCase(text, text, text);
    }
}