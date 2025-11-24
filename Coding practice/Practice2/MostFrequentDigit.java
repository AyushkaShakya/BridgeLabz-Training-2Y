import java.util.*;

public class MostFrequentDigit {
    public static char mostFrequent(int n) {
        String s = String.valueOf(n);
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        return map.entrySet()
                  .stream()
                  .max(Map.Entry.comparingByValue())
                  .get()
                  .getKey();
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(1133222)); // 2
    }
}
