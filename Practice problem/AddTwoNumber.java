package bridgelabz;

import java.util.Scanner;

public class AddTwoNumber {	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      long n = sc.nextLong();
      long sum = n * (n + 1) / 2;
      System.out.println("Sum of series from 1 to " + n + " is: " + sum);
      sc.close();
	}
}



