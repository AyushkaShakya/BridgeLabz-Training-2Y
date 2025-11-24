import java.util.*;
public class EmployeeDeptMapping {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"HR"); map.put(102,"IT"); map.put(103,"IT");
        map.put(104,"Finance"); map.put(105,"HR");
        // change dept for 103
        map.put(103,"Finance");
        // reverse lookup: find employees in IT
        String target = "IT";
        List<Integer> ids = new ArrayList<>();
        for (Map.Entry<Integer,String> e: map.entrySet()) if (e.getValue().equals(target)) ids.add(e.getKey());
        System.out.println(target + " employees: " + ids);
        // total per department
        Map<String,Long> counts = new HashMap<>();
        for (String d: map.values()) counts.put(d, counts.getOrDefault(d,0L)+1);
        System.out.println("Counts: " + counts);
    }
}
