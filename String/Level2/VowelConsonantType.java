package string;

import java.util.Scanner;

public class VowelConsonantType {

   
    public static String checkCharType(char c) {
 
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32); 
        }

       
        if (c >= 'a' && c <= 'z') {
           
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }

        return result;
    }


    public static void displayResult(String[][] result) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String text = sc.nextLine();


        String[][] result = analyzeString(text);

        displayResult(result);

        sc.close();
    }
}
