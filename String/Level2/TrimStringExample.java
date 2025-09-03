package string;

import java.util.Scanner;

public class TrimStringExample {

  
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

    
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

 
        if (start > end) {
            return new int[]{0, -1};
        }

        return new int[]{start, end};
    }

  
    public static String customSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
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

  
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

    
        int[] indexes = findTrimIndexes(text);

        String customTrimmed = "";
        if (indexes[1] >= indexes[0]) {
            customTrimmed = customSubstring(text, indexes[0], indexes[1]);
        }

      
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

   
        System.out.println("\nCustom Trimmed String: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed String: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + isSame);

        sc.close();
    }
}
