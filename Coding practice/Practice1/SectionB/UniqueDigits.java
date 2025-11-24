
public class UniqueDigits {
    public static int countUniqueDigits(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int count = 0;
        for (int f : freq) if (f == 1) count++;
        return count;
    }
}
