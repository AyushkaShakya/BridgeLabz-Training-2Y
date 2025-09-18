package Sampleproblems;

class Employee {
    private static String companyName = "Infosys Pvt Ltd";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Designation: " + this.designation);
            System.out.println("----------------------------");
        }
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit", "Developer");
        Employee e2 = new Employee(2, "Neha", "Tester");
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
