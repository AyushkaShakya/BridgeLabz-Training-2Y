
public class NthPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int nthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }
}
