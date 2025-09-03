package string;

import java.util.Scanner;

public class WordsWithLength2D {

   
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

    
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(len);
        }
        return wordData;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

    
        String[] words = manualSplit(text);

        String[][] wordData = getWordsWithLengths(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordData.length; i++) {
            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]); 
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
