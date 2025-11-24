import java.util.*;
public class InventoryManagement {
    public static void main(String[] args){
        Map<String,Integer> stock = new HashMap<>();
        // 1. add products
        stock.put("Soap", 10);
        stock.put("Shampoo", 5);
        stock.put("Toothpaste", 0);
        // customer buys Shampoo x2
        purchase(stock, "Shampoo", 2);
        // purchase Soap x10 -> Stock goes to 0 -> remove or set 0
        purchase(stock, "Soap", 10);
        // new shipment
        restock(stock, "Toothpaste", 20);
        // query
        query(stock, "Soap");
        query(stock, "Brush");
        // print out of stock products
        System.out.println("Out of stock:");
        stock.entrySet().stream().filter(e->e.getValue()==0).forEach(e->System.out.println(e.getKey()));
    }

    static void purchase(Map<String,Integer> s, String product, int qty){
        int cur = s.getOrDefault(product, -1);
        if (cur==-1){ System.out.println(product + " not stocked."); return; }
        int left = cur - qty;
        if (left<=0){ s.put(product, 0); System.out.println(product + " is now out of stock."); }
        else s.put(product, left);
    }
    static void restock(Map<String,Integer> s, String product, int qty){
        s.put(product, s.getOrDefault(product,0)+qty);
    }
    static void query(Map<String,Integer> s, String product){
        if (s.containsKey(product)) System.out.println(product + " -> " + s.get(product));
        else System.out.println(product + " not stocked.");
    }
}
