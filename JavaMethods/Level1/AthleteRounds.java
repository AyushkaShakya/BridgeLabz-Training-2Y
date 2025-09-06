package javamethods;

import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        int distance = 5000; // meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangular park: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete needs to complete " + rounds + " rounds.");
    }
}
