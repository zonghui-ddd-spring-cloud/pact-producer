package kata.pact.provider;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Rating> getRatings(String id, String name) {
        // use id and name to get the ratings from the backend

        List<Rating> result = new ArrayList<Rating>();
        result.add(new Rating("345678", "ben", "1"));
        return result;
    }

    public List<Product> getProducts() {
        List<Product> result = new ArrayList<Product>();
        result.add(new Product(123333, "ben", 20));
        return result;
    }
}
