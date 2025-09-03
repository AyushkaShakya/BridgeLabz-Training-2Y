package string;

import java.util.*;

public class CharFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        // Store characters and frequencies in 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // mark as processed
                index++;
            }
        }
        return result;
    }

    public static void display(String[][] freqArray) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("--------------------------");
        for (String[] row : freqArray) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqArray = findFrequency(text);
        display(freqArray);
    }
}
