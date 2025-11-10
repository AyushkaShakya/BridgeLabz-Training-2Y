package Wrapper;
public class Game {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 200, 150, null, 90};

        int notPlayed = 0;
        int total = 0;

        for (Integer s : scores) {
            if (s == null) {
                notPlayed++;
            } else {
                total += s; // auto-unboxing
            }
        }

        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total valid score: " + total);
    }
}
