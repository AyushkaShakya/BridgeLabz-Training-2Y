import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args){
        List<String> students = List.of("Alice","Bob","Carol","David","Eve");
        Map<String,Integer> days = new HashMap<>();
        for (String s: students) days.put(s,0);
        // simulate 15 days with random present lists
        List<List<String>> month = new ArrayList<>();
        Random r = new Random(1);
        for (int d=0; d<15; d++){
            List<String> present = new ArrayList<>();
            for (String s: students) if (r.nextBoolean()) present.add(s);
            month.add(present);
            for (String p: present) days.put(p, days.get(p)+1);
        }
        // threshold fewer than 10
        System.out.println("Attendance counts: " + days);
        System.out.println("Under-attending (<10 days):");
        days.forEach((k,v)->{ if (v<10) System.out.println(k + " -> " + v); });
    }
}
