import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args){
        Map<String,String> catalog = new TreeMap<>(); // sorted by ISBN
        catalog.put("978-1234567890","Java Basics");
        catalog.put("978-1111111111","Data Structures");
        catalog.put("978-2222222222","Algorithms in Practice");
        // search by ISBN
        searchByISBN(catalog,"978-1234567890");
        searchByISBN(catalog,"978-9999999999");
        // remove a book
        catalog.remove("978-1111111111");
        // print all
        System.out.println("Catalog:");
        catalog.forEach((isbn,title)->System.out.println(isbn + " -> " + title));
        // search by title (iterate)
        searchByTitle(catalog, "Algorithms");
    }

    static void searchByISBN(Map<String,String> c, String isbn){
        if (c.containsKey(isbn)) System.out.println(isbn + " -> " + c.get(isbn));
        else System.out.println("Book not found");
    }
    static void searchByTitle(Map<String,String> c, String query){
        System.out.println("Search title contains: " + query);
        c.forEach((isbn,title)->{ if (title.toLowerCase().contains(query.toLowerCase())) System.out.println(isbn + " -> " + title); });
    }
}
