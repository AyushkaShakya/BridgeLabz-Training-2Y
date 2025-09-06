package javamethods;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sine = Math.sin(rad);
        double cosine = Math.cos(rad);
        double tangent = Math.tan(rad);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + result[0] + ", Cosine = " + result[1] + ", Tangent = " + result[2]);
    }
}
