package college.student;

public class student {

	    private String name;
	    private int rollNo;

	    public student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    public void displayStudent() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNo);
	    }
	}


