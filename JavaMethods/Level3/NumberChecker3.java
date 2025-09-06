package string;

public class NumberChecker3 {
    
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
    
    public static void main(String[] args) {
        System.out.println("=== NumberChecker Utility Class Demo ===\n");
        
        int[] testNumbers = {1, 2, 5, 7, 9, 13, 17, 25, 76, 123, 144, 153};
        
        for (int num : testNumbers) {
            System.out.println("Testing number: " + num);
            System.out.println("  Prime: " + isPrime(num));
            System.out.println("  Neon: " + isNeon(num));
            System.out.println("  Spy: " + isSpy(num));
            System.out.println("  Automorphic: " + isAutomorphic(num));
            System.out.println("  Buzz: " + isBuzz(num));
            System.out.println();
        }
        
        System.out.println("=== Specific Examples ===");
        System.out.println("Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19");
        System.out.println("Neon numbers: 0, 1, 9");
        System.out.println("Spy numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 123");
        System.out.println("Automorphic numbers: 0, 1, 5, 6, 25, 76");
        System.out.println("Buzz numbers: 7, 14, 17, 21, 27, 28, 35, 37");
    }
}