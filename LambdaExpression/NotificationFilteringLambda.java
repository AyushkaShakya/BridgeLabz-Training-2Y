package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String m, String t) {
        message = m; type = t;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilteringLambda {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate abnormal", "CRITICAL"),
            new Alert("Time for medicine", "MEDICINE"),
            new Alert("Doctor message", "DOCTOR"),
            new Alert("Normal checkup reminder", "NORMAL")
        );

        Predicate<Alert> onlyCritical = a -> a.type.equals("CRITICAL");

        alerts.stream()
              .filter(onlyCritical)
              .forEach(System.out::println);
    }
}