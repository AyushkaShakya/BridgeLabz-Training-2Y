public class FindStringCode {
    public static int code(String s) {
        int sum = 0;
        for (char c : s.toCharArray())
            sum += (int) c;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(code("ABC")); // 198
    }
}
