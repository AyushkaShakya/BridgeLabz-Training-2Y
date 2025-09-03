package string;

import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

   
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;            
            }
        } catch (StringIndexOutOfBoundsException e) {
      
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLength = findLength(text);

        int builtInLength = text.length();

        System.out.println("\nCalculated Length (manual): " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
