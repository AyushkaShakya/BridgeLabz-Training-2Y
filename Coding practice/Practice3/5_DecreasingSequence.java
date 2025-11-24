public class DecreasingSequence {
    public static boolean isDecreasing(int[] arr){
        for(int i=1;i<arr.length;i++)
            if(arr[i]>=arr[i-1]) return false;
        return true;
    }
    public static void main(String[] args){
        int[] a={5,4,3};
        System.out.println(isDecreasing(a));
    }
}
