package string;

import java.util.Arrays;

public class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
