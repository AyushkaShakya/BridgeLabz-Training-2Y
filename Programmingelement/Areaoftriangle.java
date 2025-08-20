package programmingelement;

import java.util.Scanner;
public class Areaoftriangle {
	

	
	    public static void main(String[] args) {
	       
	        Scanner input = new Scanner(System.in);

	                System.out.print("Enter the base of the triangle in inches: ");
	                double base = input.nextDouble();

	                System.out.print("Enter the height of the triangle in inches: ");
	                double height = input.nextDouble();

	                double areaInInches = 0.5 * base * height;

	                double areaInCm = areaInInches * Math.pow(2.54, 2);

	                System.out.println("The area of the triangle with base " + base + " inches and height " + height + " inches is:");
	                System.out.println(areaInInches + " square inches");
	                System.out.println(areaInCm + " square centimeters");
	            }
	        }


	

