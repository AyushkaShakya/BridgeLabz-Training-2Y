public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam")); // true
    }
}
