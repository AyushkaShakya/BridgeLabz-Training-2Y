public class MostFrequentDigit {
    public static int mostFreq(int[] arr){
        int[] freq=new int[10];
        for(int x:arr){
            while(x>0){
                freq[x%10]++;
                x/=10;
            }
        }
        int max=0,idx=0;
        for(int i=0;i<10;i++) if(freq[i]>max){max=freq[i];idx=i;}
        return idx;
    }
    public static void main(String[] args){
        int[] a={121,345,111};
        System.out.println(mostFreq(a));
    }
}
