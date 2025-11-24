import java.util.*;
public class BankingSystem {
    public static void main(String[] args){
        Map<String,Double> accounts = new HashMap<>();
        accounts.put("ACC1", 10000.0);
        accounts.put("ACC2", 50000.0);
        accounts.put("ACC3", 75000.0);
        accounts.put("ACC4", 25000.0);
        accounts.put("ACC5", 120000.0);
        // deposit and withdrawal
        deposit(accounts,"ACC1",2000);
        withdraw(accounts,"ACC2",60000); // should fail
        withdraw(accounts,"ACC3",5000);
        // print customers sorted by descending balance
        List<Map.Entry<String,Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a,b)->Double.compare(b.getValue(), a.getValue()));
        System.out.println("All customers by balance:");
        list.forEach(e->System.out.println(e.getKey() + " -> " + e.getValue()));
        System.out.println("Top 3:");
        for (int i=0;i<Math.min(3,list.size());i++) System.out.println(list.get(i));
    }

    static void deposit(Map<String,Double> m, String acc, double amt){ m.put(acc, m.getOrDefault(acc,0.0)+amt); }
    static void withdraw(Map<String,Double> m, String acc, double amt){
        double bal = m.getOrDefault(acc, -1.0);
        if (bal==-1.0){ System.out.println("Account not found"); return; }
        if (amt>bal){ System.out.println("Insufficient funds for " + acc); return; }
        m.put(acc, bal-amt);
    }
}
