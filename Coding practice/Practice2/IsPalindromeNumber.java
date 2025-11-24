public class IsPalindromeNumber {
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
    }
}
