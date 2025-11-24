public class CreatePin {
    public static String createPIN(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        return "" + min + sum + max;
    }

    public static void main(String[] args) {
        System.out.println(createPIN(4, 7, 2)); // 213
    }
}
