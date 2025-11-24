import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args){
        Map<String,Double> emp = new HashMap<>();
        emp.put("Alice", 50000.0);
        emp.put("Bob", 60000.0);
        emp.put("Carol", 75000.0);
        emp.put("David", 45000.0);
        emp.put("Eve", 90000.0);
        emp.put("Frank", 90000.0);
        // give raise to Carol 10%
        giveRaise(emp,"Carol",10);
        // average salary
        double avg = emp.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average salary: " + avg);
        // highest-paid employees
        double max = emp.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
        System.out.println("Top-paid employees:");
        emp.forEach((k,v)->{ if (v==max) System.out.println(k + " -> " + v); });
    }
    static void giveRaise(Map<String,Double> m, String name, double percent){
        if (!m.containsKey(name)){ System.out.println("Employee not found"); return; }
        m.put(name, m.get(name) * (1 + percent/100.0));
    }
}
