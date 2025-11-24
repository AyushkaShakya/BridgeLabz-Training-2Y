import java.util.*;
 public class IsOdd
 { 
    public static void main(String[]args)
    {
         Scanner sc=new Scanner(System.in); 
         int n=sc.nextInt(); 
         System.out.println(n%2!=0?"Odd":"Even");
         sc.close();
         
    }
}