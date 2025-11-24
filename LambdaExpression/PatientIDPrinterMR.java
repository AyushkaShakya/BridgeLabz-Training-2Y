package LambdaExpression;

import java.util.*;

public class PatientIDPrinterMR {

    public static void printID(String id) {
        System.out.println("Patient ID: " + id);
    }

    public static void main(String[] args) {

        List<String> ids = Arrays.asList("P101", "P102", "P103");

        ids.forEach(PatientIDPrinterMR::printID);
    }
}
