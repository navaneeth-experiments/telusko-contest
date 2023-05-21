import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        try {
            Product product = products.stream()
                    .filter(p -> p.getName().equals(name))
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("product not found"));
            return product;
        } catch (Exception IllegalArgumentException) {
            return null;
        }
    }

    public Product getProductById(int id) {
        try {
            Product product = products.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst().orElseThrow(() -> new IllegalArgumentException("product not found"));
            return product;
        } catch (Exception IllegalArgumentException) {
            return null;
        }
    }

    public List<Product> getProductsWithText(String text) {
        String str = text.toLowerCase();
        List<Product> filteredProducts = new ArrayList<>();

        Predicate<Product> predi = (Product p) -> {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str))
                return true;
            return false;
        };

        filteredProducts = products.stream().filter(predi).collect(Collectors.toList());
        if (filteredProducts.isEmpty()) {
            return null;
        } else {
            return filteredProducts;
        }
    }

    public List<Product> getProductsByPlace(String place) {
        List<Product> filteredProducts = new ArrayList<>();

        Predicate<Product> predi = (Product p) -> {
            return p.getPlace().equalsIgnoreCase(place);
        };

        filteredProducts = products.stream().filter(predi).collect(Collectors.toList());
        if (filteredProducts.isEmpty()) {
            return null;
        } else {
            return filteredProducts;
        }
    }

    public List<Product> getProductsOutOfWarranty(int year) {
        List<Product> filteredProducts = new ArrayList<>();

        Predicate<Product> predi = (Product p) -> {
            return p.getWarranty() < year;
        };

        filteredProducts = products.stream().filter(predi).collect(Collectors.toList());
        if (filteredProducts.isEmpty()) {
            return null;
        } else {
            return filteredProducts;
        }
    }
}
