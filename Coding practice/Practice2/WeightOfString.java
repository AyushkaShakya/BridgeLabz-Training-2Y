public class WeightOfString {
    public static int weight(String s) {
        int sum = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                sum += c - 'a' + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(weight("abc")); // 6
    }
}
