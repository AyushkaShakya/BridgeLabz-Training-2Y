package Sampleproblems;

class Patient {
    private static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients in " + hospitalName + ": " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("----------------------------");
        }
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient(301, "Anita", 30, "Fever");
        Patient p2 = new Patient(302, "Ramesh", 45, "Diabetes");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
