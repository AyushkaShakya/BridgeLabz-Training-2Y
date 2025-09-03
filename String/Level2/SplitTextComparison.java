package string;

import java.util.Scanner;

public class SplitTextComparison {

  
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


    public static String[] manualSplit(String text) {
        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord += c;
            } else {
                words[wordIndex] = currentWord;
                wordIndex++;
                currentWord = "";
            }
        }
  
        words[wordIndex] = currentWord;

        return words;
    }

   
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);

       
        String[] builtInWords = text.split(" ");

   
        boolean areEqual = compareArrays(manualWords, builtInWords);

        System.out.println("\nManual Split:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both splits equal? " + areEqual);

        sc.close();
    }
}
