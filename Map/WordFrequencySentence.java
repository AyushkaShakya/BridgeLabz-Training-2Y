import java.util.*;
public class WordFrequencySentence {
    public static void main(String[] args){
        String s = "Java is fun and Java is powerful";
        Map<String,Integer> freq = new HashMap<>();
        String[] words = s.toLowerCase().replaceAll("[^a-z0-9\\s]"," ").split("\\s+");
        for (String w: words) if (!w.isEmpty()) freq.put(w, freq.getOrDefault(w,0)+1);
        freq.forEach((k,v)->System.out.println(k + ": " + v));
    }
}
