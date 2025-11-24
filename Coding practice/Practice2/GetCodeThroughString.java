public class GetCodeThroughString {
    public static String getCode(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(((int)c) % 10);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getCode("ABC")); // 567
    }
}
