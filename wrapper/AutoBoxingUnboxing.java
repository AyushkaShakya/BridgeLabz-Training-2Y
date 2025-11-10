import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Auto-boxing: primitive → wrapper
        for (int i = 10; i <= 50; i += 10) {
            numbers.add(i);
        }

        // Auto-unboxing: wrapper → primitive
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
