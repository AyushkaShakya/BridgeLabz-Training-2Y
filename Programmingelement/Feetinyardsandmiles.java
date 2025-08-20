package programmingelement;

import java.util.Scanner;

public class Feetinyardsandmiles {

	public class FeetToYardsMiles {
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the distance in feet: ");
	        double distanceInFeet = input.nextDouble();

	        double distanceInYards = distanceInFeet / 3.0;

	        double distanceInMiles = distanceInYards / 1760.0;

	        System.out.println("The distance in feet is " + distanceInFeet +
	                           " which is equal to " + distanceInYards + " yards and " +
	                           distanceInMiles + " miles.");
	    }
	}


}
