package com.telusko.ProductSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    Product findByName(String name);

    Product findById(int id);

    List<Product> findByWarrantyLessThan(int year);

    List<Product> findByPlaceIgnoreCase(String place);

    List<Product> findByNameContainsIgnoreCaseOrTypeContainsIgnoreCaseOrPlaceContainsIgnoreCase(String name, String type, String place);
}
