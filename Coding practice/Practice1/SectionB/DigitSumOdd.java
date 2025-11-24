
public class DigitSumOdd {
    public static int digitSumOdd(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }
}
