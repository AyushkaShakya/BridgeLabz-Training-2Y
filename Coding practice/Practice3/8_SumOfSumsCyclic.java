public class SumOfSumsCyclic {
    public static int cyclicSum(int n){
        String s=Integer.toString(n);
        int total=0;
        for(int i=0;i<s.length();i++){
            int sum=0;
            for(char c:s.toCharArray()) sum+=c-'0';
            total+=sum;
            s=s.substring(1)+s.charAt(0);
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println(cyclicSum(123));
    }
}
