import java.util.*;
public class CourseRegistration {
    public static void main(String[] args){
        Map<String,Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 52);
        courses.put("MA101", 4);
        courses.put("HS201", 10);
        courses.put("CS201", 1);
        // add/drop
        changeRegistration(courses,"CS101",2); // add 2
        changeRegistration(courses,"MA101",-2); // drop 2
        changeRegistration(courses,"CS201",5); // add 5
        // print near full (>=50) and under-subscribed (<5)
        System.out.println("Near full:");
        courses.entrySet().stream().filter(e->e.getValue()>=50).forEach(System.out::println);
        System.out.println("Under-subscribed:");
        courses.entrySet().stream().filter(e->e.getValue()<5).forEach(System.out::println);
    }
    static void changeRegistration(Map<String,Integer> c, String code, int delta){
        int now = c.getOrDefault(code,0) + delta;
        if (now<0) now = 0;
        c.put(code, now);
    }
}
