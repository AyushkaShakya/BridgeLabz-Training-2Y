package string;

import java.util.Arrays;

public class NumberChecker1 {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 1729;
        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }
    }
}
