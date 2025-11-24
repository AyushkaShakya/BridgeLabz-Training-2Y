import java.util.*;
public class WebsiteVisitTracker {
    public static void main(String[] args){
        Map<String,Integer> visits = new HashMap<>();
        String[] seq = {"home","about","products","home","products","contact","home","products","home"};
        for (String p: seq) visits.put(p, visits.getOrDefault(p,0)+1);
        // sorted by descending count
        List<Map.Entry<String,Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        System.out.println("Visits sorted:");
        list.forEach(e->System.out.println(e.getKey() + " -> " + e.getValue()));
        System.out.println("Most visited: " + list.get(0).getKey());
    }
}
