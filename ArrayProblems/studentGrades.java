package ArrayProblems;

import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of student " + (i + 1) + " (out of 100):");

            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
                if (physics[i] < 0) {
                    System.out.println("❌ Enter a positive value!");
                }
            } while (physics[i] < 0);

            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
                if (chemistry[i] < 0) {
                    System.out.println("❌ Enter a positive value!");
                }
            } while (chemistry[i] < 0);

            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextInt();
                if (maths[i] < 0) {
                    System.out.println("❌ Enter a positive value!");
                }
            } while (maths[i] < 0);

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-8s\n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Student");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-12c %-8d\n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i], (i + 1));
        }

        sc.close();
    }
}
