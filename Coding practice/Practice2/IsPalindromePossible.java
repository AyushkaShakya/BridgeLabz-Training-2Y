import java.util.*;

public class IsPalindromePossible {
    public static boolean canFormPalindrome(int n) {
        String s = String.valueOf(n);
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        int odd = 0;
        for (int v : freq.values())
            if (v % 2 != 0) odd++;

        return odd <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome(112)); // true
    }
}
