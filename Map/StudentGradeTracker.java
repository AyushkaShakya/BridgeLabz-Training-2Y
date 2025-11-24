import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        TreeMap<String,Double> grades = new TreeMap<>(); // sorted by name
        // 1. add students
        grades.put("Alice", 78.5);
        grades.put("Bob", 82.0);
        grades.put("Carol", 69.0);
        grades.put("David", 90.0);
        // 2. update grade (retake)
        grades.put("Carol", 75.0);
        // 3. remove student who dropped out
        grades.remove("Bob");
        // 4. print sorted by name
        grades.forEach((name, g) -> System.out.println(name + ": " + g));
    }
}
