package string;

import java.util.Scanner;

public class LowerCaseComparison {

  
    public static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
               
                result += (char)(c + 32);
            } else {
                result += c; 
            }
        }
        return result;
    }

  
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String manualLower = toLowerCaseManual(text);

        String builtInLower = text.toLowerCase();

        boolean comparison = compareUsingCharAt(manualLower, builtInLower);

        System.out.println("\nManual Lowercase Conversion: " + manualLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + comparison);

        sc.close();
    }
}
