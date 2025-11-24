import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String,Integer> freq = new HashMap<>();
        String normalized = text.toLowerCase();
        normalized = normalized.replaceAll("[^a-z0-9\\s]", " ");
        for (String w : normalized.split("\\s+")) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w,0)+1);
        }
        return freq;
    }

    public static void main(String[] args) throws Exception {
        String input;
        if (args.length>0) input = new String(Files.readAllBytes(Paths.get(args[0])));
        else input = "Hello world, hello Java!";
        System.out.println(countWords(input));
    }
}
