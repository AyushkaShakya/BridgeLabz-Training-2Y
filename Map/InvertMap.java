import java.util.*;
public class InvertMap {
    public static <K,V> Map<V,List<K>> invert(Map<K,V> m){
        Map<V,List<K>> inv = new HashMap<>();
        for (Map.Entry<K,V> e: m.entrySet()){
            inv.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return inv;
    }
    public static void main(String[] args){
        Map<String,Integer> m = new HashMap<>();
        m.put("A",1); m.put("B",2); m.put("C",1);
        System.out.println(invert(m));
    }
}
