import java.util.*;

public class RotateList {

    public static <T> void rotate(List<T> list, int k) {

        int n = list.size();
        k = k % n;  
        List<T> rotated = new ArrayList<>();
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < n; i++) {
            list.set(i, rotated.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int k = 2; 

        rotate(list, k);

        System.out.println("Rotated List: " + list);
    }
}
