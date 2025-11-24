package scheduler;

public class Match {
    Team home;
    Team away;

    public Match(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    @Override
    public String toString() {
        return home.name + " vs " + away.name;
    }
}

