package Wrapper;
public class SensorData {
    // accepts both primitive and wrapper
    public static void logTemperature(Double temp) {
        System.out.println("Logged Temperature: " + temp);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double objectTemp = 37.2;
        logTemperature(primitiveTemp);
        logTemperature(objectTemp);
        double avg = (primitiveTemp + objectTemp) / 2;
        System.out.println("Average Temperature: " + avg);
    }
}
