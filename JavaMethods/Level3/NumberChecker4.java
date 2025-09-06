package string;

public class NumberChecker4 {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNeon(int number) {
        if (number < 0) return false;
        
        int square = number * number;
        int digitSum = 0;
        
        while (square > 0) {
            digitSum += square % 10;
            square /= 10;
        }
        
        return digitSum == number;
    }
    
    public static boolean isSpy(int number) {
        if (number < 0) return false;
        if (number == 0) return false;
        
        int temp = number;
        int sum = 0;
        int product = 1;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        return sum == product;
    }
    
    public static boolean isAutomorphic(int number) {
        if (number < 0) return false;
        
        int square = number * number;
        
        int temp = number;
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        
        return true;
    }
    
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (Math.abs(number) % 10 == 7);
    }
    
    public static boolean isPerfect(int number) {
        if (number <= 0) return false;
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
    
    public static boolean isAbundant(int number) {
        if (number <= 0) return false;
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum > number;
    }
    
    public static boolean isDeficient(int number) {
        if (number <= 0) return false;
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum < number;
    }
    
    public static boolean isStrong(int number) {
        if (number < 0) return false;
        
        int temp = number;
        int sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        
        return sum == number;
    }
    
    private static int factorial(int n) {
        if (n <= 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    private static int getSumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("=== NumberChecker Utility Class Demo ===\n");
        
        int[] testNumbers = {1, 2, 5, 6, 7, 9, 12, 13, 17, 25, 28, 76, 123, 144, 145, 153, 496};
        
        System.out.println("=== PRIME NUMBERS ===");
        for (int num : testNumbers) {
            if (isPrime(num)) {
                System.out.println(num + " is Prime");
            }
        }
        System.out.println();
        
        System.out.println("=== NEON NUMBERS ===");
        for (int num : testNumbers) {
            if (isNeon(num)) {
                System.out.println(num + " is Neon (square: " + (num*num) + ")");
            }
        }
        System.out.println();
        
        System.out.println("=== SPY NUMBERS ===");
        for (int num : testNumbers) {
            if (isSpy(num)) {
                System.out.println(num + " is Spy");
            }
        }
        System.out.println();
        
        System.out.println("=== AUTOMORPHIC NUMBERS ===");
        for (int num : testNumbers) {
            if (isAutomorphic(num)) {
                System.out.println(num + " is Automorphic (square: " + (num*num) + ")");
            }
        }
        System.out.println();
        
        System.out.println("=== BUZZ NUMBERS ===");
        for (int num : testNumbers) {
            if (isBuzz(num)) {
                System.out.println(num + " is Buzz");
            }
        }
        System.out.println();
        
        System.out.println("=== PERFECT NUMBERS ===");
        for (int num : testNumbers) {
            if (isPerfect(num)) {
                System.out.println(num + " is Perfect (divisor sum: " + getSumOfProperDivisors(num) + ")");
            }
        }
        System.out.println();
        
        System.out.println("=== ABUNDANT NUMBERS ===");
        for (int num : testNumbers) {
            if (isAbundant(num)) {
                System.out.println(num + " is Abundant (divisor sum: " + getSumOfProperDivisors(num) + ")");
            }
        }
        System.out.println();
        
        System.out.println("=== DEFICIENT NUMBERS ===");
        for (int num : testNumbers) {
            if (isDeficient(num)) {
                System.out.println(num + " is Deficient (divisor sum: " + getSumOfProperDivisors(num) + ")");
            }
        }
        System.out.println();
        
        System.out.println("=== STRONG NUMBERS ===");
        for (int num : testNumbers) {
            if (isStrong(num)) {
                System.out.println(num + " is Strong");
            }
        }
    }
}