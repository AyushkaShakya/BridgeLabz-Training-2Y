public class AdditionUsingStrings {
    public static String add(String a, String b){
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int x=i>=0?a.charAt(i--)-'0':0;
            int y=j>=0?b.charAt(j--)-'0':0;
            int s=x+y+carry;
            sb.append(s%10);
            carry=s/10;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(add("999","1"));
    }
}
