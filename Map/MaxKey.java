import java.util.*;
public class MaxKey {
    public static String maxKey(Map<String,Integer> m){
        return m.entrySet().stream().max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey).orElse(null);
    }
    public static void main(String[] args){
        Map<String,Integer> m = Map.of("A",10,"B",20,"C",15);
        System.out.println("Max key: " + maxKey(m));
    }
}
