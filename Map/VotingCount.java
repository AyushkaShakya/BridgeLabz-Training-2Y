import java.util.*;
public class VotingCount {
    public static void main(String[] args){
        Map<String,Integer> votes = new HashMap<>();
        String[] candidates = {"Alice","Bob","Carol"};
        // simulate 10 votes (randomly)
        String[] votesCast = {"Alice","Bob","Alice","Carol","Bob","Bob","Alice","Carol","Bob","Alice"};
        for (String v: votesCast){
            votes.put(v, votes.getOrDefault(v,0)+1);
        }
        System.out.println("Totals: " + votes);
        // find winner
        String winner = votes.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println("Winner: " + winner);
    }
}
