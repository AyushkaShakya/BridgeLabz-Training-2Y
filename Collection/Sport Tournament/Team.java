package scheduler;

	public class Team implements Comparable<Team> {
	    String name;
	    int points;

	    public Team(String name) {
	        this.name = name;
	        this.points = 0;
	    }

	    @Override
	    public int compareTo(Team other) {
	        int pointCompare = Integer.compare(other.points, this.points);
	        return pointCompare != 0 ? pointCompare : this.name.compareTo(other.name);
	    }

	    @Override
	    public String toString() {
	        return name + " (" + points + " pts)";
	    }
	}

