public class AdditionUsingStrings {
    public static String add(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(add("999", "1")); // 1000
    }
}
