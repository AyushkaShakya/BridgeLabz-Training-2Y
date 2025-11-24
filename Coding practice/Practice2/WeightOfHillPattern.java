public class WeightOfHillPattern {
    public static int hillWeight(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        for (int i = n - 1; i >= 1; i--) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hillWeight(4)); // 16
    }
}
