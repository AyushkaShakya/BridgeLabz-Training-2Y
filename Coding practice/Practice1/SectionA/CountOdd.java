import java.util.*; 
public class CountOdd
{ 
    public static void main(String[]args)
    { 
        Scanner sc=new Scanner(System.in); 
        int c=0; 
        for(int i=0;i<5;i++)
            { 
                int x=sc.nextInt();
                 if(x%2!=0)c++; 
            } 
        sc.close();
        System.out.println("Odd Count = "+c);
    }
}