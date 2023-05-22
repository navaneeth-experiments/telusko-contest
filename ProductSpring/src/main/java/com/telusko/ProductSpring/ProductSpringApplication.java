package com.telusko.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

        ProductService service = context.getBean(ProductService.class);

//		adding products to database
//		service.addProduct(new Product( "Type C", "Cable", "Black Drawer", 2024));
//		service.addProduct(new Product( "Mac Studio", "Computer", "White Table", 2025));
//		service.addProduct(new Product( "Focusrite Mixer", "Audio System", "White Table", 2025));
//		service.addProduct(new Product( "Asus Vivobook", "Laptop", "Brown Drawer", 2021));
//		service.addProduct(new Product( "Asus Rog", "Laptop", "Black Table", 2021));
//		service.addProduct(new Product( "Macbook pro", "Laptop", "Brown Drawer", 2022));
//		service.addProduct(new Product( "Wacom Pad", "Writing Pad", "Black Drawer", 2020));
//		service.addProduct(new Product( "Apple Keyboard", "Keyboard", "White Table", 2022));
//		service.addProduct(new Product( "Logitech Keyboard", "Keyboard", "Black Table", 2024));
//		service.addProduct(new Product( "Hdmi cable", "Cable", "Black Drawer", 2024));
//		service.addProduct(new Product( "Java Black Book", "Cable", "Shelf", 2024));
//		service.addProduct(new Product( "Logi Mouse", "Mouse", "Black Table", 2022));
//		service.addProduct(new Product( "Apple Mouse", "Mouse", "White Table", 2022));
//		service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
//		service.addProduct(new Product( "BlackBeast", "Computer", "White Table", 2020));


        // printing all the products
        List<Product> products = service.getAllProducts();
        products.stream().forEach(product -> System.out.println(product));

        // getting a particualr product by it's id
        Product productById = service.getProductById(7);
        System.out.println(productById);

        // getting a particular product by it's name
        Product productByName = service.getProductByName("Mac Studio");
        System.out.println(productByName);

        // getting a particular product by place
        List<Product> productsByPlace = service.getProductsByPlace("White Table");
        productsByPlace.stream().forEach(product -> System.out.println(product));

        // getting all the products that are out of warranty
        List<Product> productsOutOfWarranty = service.getProductsOutOfWarranty(2021);
        productsOutOfWarranty.stream().forEach(product -> System.out.println(product));

        // getting a particular product if any of it's properties contains the given text
        List<Product> productsWithText = service.getProductsWithText("mac");
        productsWithText.stream().forEach(product -> System.out.println(product));
    }

}
