package Sampleproblems;

class Student {
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + this.rollNumber);
            System.out.println("Name: " + this.name);
            System.out.println("Grade: " + this.grade);
            System.out.println("----------------------------");
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rohit", "A");
        Student s2 = new Student(102, "Sneha", "B");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
