public class SecondWordUppercase {
    public static String getSecondWord(String s) {
        String[] arr = s.trim().split("\\s+");
        return (arr.length >= 2) ? arr[1].toUpperCase() : "";
    }

    public static void main(String[] args) {
        System.out.println(getSecondWord("hello world java")); // WORLD
    }
}

