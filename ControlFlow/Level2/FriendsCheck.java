package ControlFlow;

import java.util.Scanner;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();


        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("The youngest friend is Amar with age " + ageAmar);
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("The youngest friend is Akbar with age " + ageAkbar);
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("The youngest friend is Anthony with age " + ageAnthony);
        } else {
            System.out.println("Two or more friends are of the same youngest age.");
        }


        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("The tallest friend is Amar with height " + heightAmar);
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("The tallest friend is Akbar with height " + heightAkbar);
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("The tallest friend is Anthony with height " + heightAnthony);
        } else {
            System.out.println("Two or more friends are of the same tallest height.");
        }
    }
}
