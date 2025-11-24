public class GetCodeThroughStrings {
    public static String transform(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) sb.append((char)(c+1));
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(transform("abc"));
    }
}
