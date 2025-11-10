package Wrapper;
import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3};
        ArrayList<Integer> objectRatings = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int r : primitiveRatings)
            combined.add(r); // auto-boxing

        combined.addAll(objectRatings);

        // remove nulls
        List<Integer> valid = combined.stream()
                .filter(Objects::nonNull)
                .toList();

        double avg = valid.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("All Ratings: " + combined);
        System.out.println("Valid Ratings: " + valid);
        System.out.println("Average Rating: " + avg);
    }
}
