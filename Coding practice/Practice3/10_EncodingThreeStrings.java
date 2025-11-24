public class EncodingThreeStrings {
    public static String encode(String a,String b,String c){
        return a.toUpperCase()+"-"+b.toLowerCase()+"-"+new StringBuilder(c).reverse();
    }
    public static void main(String[] args){
        System.out.println(encode("Hello","WORLD","java"));
    }
}
