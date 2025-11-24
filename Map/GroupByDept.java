import java.util.*;
class Employee {
    String name; String dept;
    Employee(String n, String d){name=n;dept=d;}
    public String toString(){return name;}
}
public class GroupByDept {
    public static Map<String,List<Employee>> group(List<Employee> list){
        Map<String,List<Employee>> map = new HashMap<>();
        for (Employee e: list) map.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e);
        return map;
    }
    public static void main(String[] args){
        List<Employee> l = List.of(new Employee("Alice","HR"), new Employee("Bob","IT"), new Employee("Carol","HR"));
        System.out.println(group(l));
    }
}
