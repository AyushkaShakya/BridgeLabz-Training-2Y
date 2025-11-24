package scheduler;

import java.util.*;

public class TournamentScheduler {

    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();
        Team t1 = new Team("Lions");
        Team t2 = new Team("Tigers");
        Team t3 = new Team("Bears");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);

        Queue<Match> schedule = new LinkedList<>();
        schedule.add(new Match(t1, t2));
        schedule.add(new Match(t2, t3));
        schedule.add(new Match(t1, t3));

        List<Result> results = new ArrayList<>();
        Random rand = new Random();

        while (!schedule.isEmpty()) {
            Match currentMatch = schedule.poll();

            int homeScore = rand.nextInt(5);
            int awayScore = rand.nextInt(5);

            Result result = new Result(currentMatch, homeScore, awayScore);
            results.add(result);

            if (homeScore > awayScore) {
                currentMatch.home.points += 3;
            } else if (awayScore > homeScore) {
                currentMatch.away.points += 3;
            } else {
                currentMatch.home.points += 1;
                currentMatch.away.points += 1;
            }
        }

        System.out.println("=== MATCH RESULTS ===");
        results.forEach(System.out::println);

        TreeSet<Team> leaderboard = new TreeSet<>(teams);

        System.out.println("\n=== LEADERBOARD ===");
        leaderboard.forEach(System.out::println);
    }
}

