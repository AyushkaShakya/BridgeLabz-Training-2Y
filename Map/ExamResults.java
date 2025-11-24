import java.util.*;
public class ExamResults {
    public static void main(String[] args){
        Map<String, Map<String,Integer>> data = new HashMap<>();
        // subject -> (student -> marks)
        data.put("Math", new HashMap<>()); data.put("Physics", new HashMap<>());
        data.get("Math").put("Alice", 85); data.get("Math").put("Bob", 92);
        data.get("Math").put("Carol", 76);
        data.get("Physics").put("Alice", 80); data.get("Physics").put("Bob", 88);
        data.get("Physics").put("Carol", 90);
        // top scorer per subject and average
        for (String subject: data.keySet()){
            Map<String,Integer> marks = data.get(subject);
            String top = marks.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("N/A");
            double avg = marks.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println(subject + " -> top: " + top + ", avg: " + avg);
        }
    }
}
