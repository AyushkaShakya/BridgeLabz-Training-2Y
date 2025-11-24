public class SimpleEncodedArray {
    public static int[] encode(int[] arr){
        int[] out=new int[arr.length];
        for(int i=0;i<arr.length;i++) out[i]=arr[i]*2;
        return out;
    }
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] r=encode(a);
        for(int x:r) System.out.print(x+" ");
    }
}
