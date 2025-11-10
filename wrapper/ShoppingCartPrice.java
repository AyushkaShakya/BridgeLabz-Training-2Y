package Wrapper;
public class ShoppingCartPrice {
    public static void main(String[] args) {
        // Prices given as String values
        String[] prices = {"250", "499", "abc", "99", "150"};
        int total = 0;

        // Loop through each price and convert to integer
        for (String price : prices) {
            try {
                int value = Integer.parseInt(price);  // String → int using wrapper class
                total += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + price);
            }
        }

        System.out.println("Total Price: ₹" + total);
    }
}
