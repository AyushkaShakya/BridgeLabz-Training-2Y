package string;

import java.util.Arrays;

public class NumberChecker2 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {  
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12021;
        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversed));

        System.out.println("Is Palindrome? " + isPalindrome(number));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
