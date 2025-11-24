import java.util.*;

public class NthFromEnd {

    public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        int count = 0;
        while (fast.hasNext() && count < n) {
            fast.next();
            count++;
        }
        if (count < n) {
            return null;
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        int N = 2;

        String result = getNthFromEnd(list, N);

        System.out.println("Nth element from the end: " + result);
    }
}
