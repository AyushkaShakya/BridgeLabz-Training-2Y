package college.faculty;

public class faculty {

	    private String name;
	    private String subject;

	    public faculty(String name, String subject) {
	        this.name = name;
	        this.subject = subject;
	    }

	    public void displayFaculty() {
	        System.out.println("Faculty Name: " + name);
	        System.out.println("Subject: " + subject);
	    }
	}

