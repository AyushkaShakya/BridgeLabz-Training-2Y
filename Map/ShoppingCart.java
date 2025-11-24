import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        LinkedHashMap<String,Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 45000.0);
        cart.put("Headphones", 1500.0);
        cart.put("Mouse", 800.0);
        // display in insertion order
        System.out.println("Cart contents:");
        cart.forEach((k,v)->System.out.println(k + " -> " + v));
        // total
        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total: " + total);
        if (total > 5000) total *= 0.9; // 10% discount
        System.out.println("After discount (if any): " + total);
        // simulate remove item
        cart.remove("Mouse");
        System.out.println("After removal: " + cart);
    }
}
