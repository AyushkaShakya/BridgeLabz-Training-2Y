
public class DigitSumOpt {
    public static int digitSumOpt(int n, String type) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (type.equals("even") && d % 2 == 0) sum += d;
            if (type.equals("odd") && d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }
}
