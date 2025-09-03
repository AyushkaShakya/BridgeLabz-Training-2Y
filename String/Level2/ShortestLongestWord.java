package string;

import java.util.Scanner;

public class ShortestLongestWord {

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


    public static int[] findShortestAndLongest(String[][] wordData) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int currentLen = Integer.parseInt(wordData[i][1]);
            int shortestLen = Integer.parseInt(wordData[shortestIndex][1]);
            int longestLen = Integer.parseInt(wordData[longestIndex][1]);

            if (currentLen < shortestLen) {
                shortestIndex = i;
            }
            if (currentLen > longestLen) {
                longestIndex = i;
            }
        }

   
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

       
        String[] words = manualSplit(text);

        String[][] wordData = getWordsWithLengths(words);

        int[] result = findShortestAndLongest(wordData);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + Integer.parseInt(wordData[i][1]));
        }

        System.out.println("\nShortest Word: " + wordData[result[0]][0] +
                " (Length: " + wordData[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordData[result[1]][0] +
                " (Length: " + wordData[result[1]][1] + ")");

        sc.close();
    }
}

