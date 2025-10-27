import college.student.student;
import college.faculty.faculty;

public class main {
    public static void main(String[] args) {
        student s1 = new student("Ayushka", 2006);
        faculty f1 = new faculty("Dr. Sharma", "Computer Science");

        System.out.println("--- Student Details ---");
        s1.displayStudent();

        System.out.println("\n--- Faculty Details ---");
        f1.displayFaculty();
    }
}
