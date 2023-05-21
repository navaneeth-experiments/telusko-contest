import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();
        // hey service, add the products..

        service.addProduct(new Product(1, "Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product(2, "Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product(3, "Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product(4, "Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product(5, "Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product(6, "Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product(7, "Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product(8, "Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product(9, "Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product(10, "Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product(11, "Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product(12, "Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product(13, "Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product(14, "Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product(15, "BlackBeast", "Computer", "White Table", 2020));

        // printing all the products
        List<Product> products = service.getAllProducts();
        products.stream().forEach(product -> System.out.println(product));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // getting a particualr product by it's name
        Product product = service.getProduct("Logi Mouse");
        System.out.println(product);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // getting a particualr product by it's name
        Product productById = service.getProductById(7);
        System.out.println(productById);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // getting a particular product if any of it's properties contains the given
        // text
        List<Product> productsWithText = service.getProductsWithText("bldffack");
        try {
            productsWithText.stream().forEach(productWithText -> System.out.println(productWithText));
        } catch (Exception NullPointerException) {
            System.out.println("No products Available with text " + "bldffack");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // getting a particular product by place
        List<Product> productsByPlace = service.getProductsByPlace("white Table");
        try {
            productsByPlace.stream().forEach(productByPlace -> {
                System.out.println(productByPlace);
            });
        } catch (Exception NullPointerException) {
            System.out.println("No products Available with place " + "wite Table");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // getting all the products that are out of warranty
        List<Product> productsOutOfWarranty = service.getProductsOutOfWarranty(2019);
        try {
            productsOutOfWarranty.stream().forEach(productOutOfWarranty -> {
                System.out.println(productOutOfWarranty);
            });
        } catch (Exception NullPointerException) {
            System.out.println("No products are out of warranty for the year " + 2019);
        }
    }
}
