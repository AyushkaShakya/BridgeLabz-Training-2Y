package Wrapper;
public class BankTransaction {
    public static double getRemainingLimit(Double limit, double usedAmount) {
        if (limit == null) return 0.0;
        return limit - usedAmount;
    }

    public static void main(String[] args) {
        Double dailyLimit = 10000.0;
        double used = 2500.0;

        System.out.println("Remaining Limit: " + getRemainingLimit(dailyLimit, used));
        System.out.println("Old Account (null limit): " + getRemainingLimit(null, used));
    }
}
