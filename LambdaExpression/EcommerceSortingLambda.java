package LambdaExpression;
import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }

    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class EcommerceSortingLambda {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Shoes", 1500, 4.5, 15),
                new Product("Watch", 2500, 4.1, 10),
                new Product("Bag", 900, 4.8, 5)
        );

        System.out.println("\nSort by Price:");
        products.sort((a, b) -> Double.compare(a.price, b.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        products.forEach(System.out::println);
    }
}