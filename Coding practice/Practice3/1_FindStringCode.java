public class FindStringCode {
    public static int getStringCode(String s) {
        int sum = 0;
        for(char c : s.toCharArray()) sum += (int)c;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(getStringCode("ABC"));
    }
}
