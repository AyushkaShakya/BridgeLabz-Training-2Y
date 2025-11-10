package Wrapper;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object m : marks) {
            try {
                if (m == null || m.equals("null")) continue;

                if (m instanceof String)
                    validMarks.add(Integer.parseInt((String) m));
                else if (m instanceof Integer)
                    validMarks.add((Integer) m);
            } catch (Exception e) {
                // skip invalid
            }
        }

        double avg = validMarks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + avg);
    }
}
