import java.util.*;
public class MergeMaps {
    public static Map<String,Integer> merge(Map<String,Integer> a, Map<String,Integer> b){
        Map<String,Integer> res = new HashMap<>(a);
        for (Map.Entry<String,Integer> e: b.entrySet()){
            res.merge(e.getKey(), e.getValue(), Integer::sum);
        }
        return res;
    }
    public static void main(String[] args){
        Map<String,Integer> m1 = Map.of("A",1,"B",2);
        Map<String,Integer> m2 = Map.of("B",3,"C",4);
        System.out.println(merge(m1,m2));
    }
}
