package scheduler;

public class Result {
    Match match;
    int homeScore;
    int awayScore;

    public Result(Match match, int homeScore, int awayScore) {
        this.match = match;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    @Override
    public String toString() {
        return match + " → " + homeScore + " : " + awayScore;
    }
}
