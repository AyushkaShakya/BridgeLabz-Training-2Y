public class SumOfPowersOfDigits {
    public static int sumPow(int n, int p){
        int s=0;
        while(n>0){
            int d=n%10;
            n/=10;
            s+=Math.pow(d,p);
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println(sumPow(123,2));
    }
}
