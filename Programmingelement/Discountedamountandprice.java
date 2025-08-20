package programmingelement;

public class Discountedamountandprice {
	    public static void main(String[] args) {
	        // Step a: Create a variable for fee
	        double fee = 125000;

	        // Step b: Create a variable for discount percentage
	        double discountPercent = 10;

	        // Step c: Compute the discount amount
	        double discount = (fee * discountPercent) / 100;

	        // Step d: Compute the final discounted price
	        double finalFee = fee - discount;

	        // Output
	        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	    }
}

