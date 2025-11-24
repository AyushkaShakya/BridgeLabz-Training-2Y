import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args){
        Map<String,String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("India","New Delhi");
        map.put("United States","Washington, D.C.");
        map.put("Japan","Tokyo");
        map.put("Germany","Berlin");
        map.put("France","Paris");
        map.put("Brazil","Brasilia");
        map.put("Australia","Canberra");
        map.put("Canada","Ottawa");
        // lookup example
        lookup(map,"Japan");
        lookup(map,"Spain");
        // print alphabetical
        System.out.println("All countries:");
        map.forEach((c,cap)->System.out.println(c + " -> " + cap));
    }
    static void lookup(Map<String,String> m, String country){
        String cap = m.get(country);
        if (cap==null) System.out.println("Unknown country");
        else System.out.println(country + " -> " + cap);
    }
}
