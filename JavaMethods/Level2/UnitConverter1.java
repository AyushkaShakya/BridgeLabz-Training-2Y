package string;

public class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        System.out.println("10 km in miles: " + convertKmToMiles(10));
        System.out.println("6.2 miles in km: " + convertMilesToKm(6.2));
        System.out.println("5 meters in feet: " + convertMetersToFeet(5));
        System.out.println("16 feet in meters: " + convertFeetToMeters(16));
        System.out.println("2 yards in feet: " + convertYardsToFeet(2));
        System.out.println("9 feet in yards: " + convertFeetToYards(9));
        System.out.println("1 meter in inches: " + convertMetersToInches(1));
        System.out.println("10 inches in meters: " + convertInchesToMeters(10));
        System.out.println("12 inches in cm: " + convertInchesToCentimeters(12));
    }
}
