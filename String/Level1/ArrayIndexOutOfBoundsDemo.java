package string;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {

        System.out.println("Accessing index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(names); 
        } catch (Exception e) {
            System.out.println("Program crashed with: " + e);
        }

        System.out.println("\n---- Handling Exception ----");
        handleException(names); 

        sc.close();
    }
}
