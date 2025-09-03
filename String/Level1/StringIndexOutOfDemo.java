package string;

import java.util.Scanner;

public class StringIndexOutOfDemo {

    
    public static void generateException(String text) {
       
        System.out.println("Character at index 100: " + text.charAt(100));
    }

      public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(input); 
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(input); 

        sc.close();
    }
}
