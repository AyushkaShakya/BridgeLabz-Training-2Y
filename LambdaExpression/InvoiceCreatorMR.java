package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String id) {
        transactionId = id;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreatorMR {
    public static void main(String[] args) {

        List<String> transIds = Arrays.asList("T1001", "T1002", "T1003");

        // Constructor reference
        List<Invoice> invoices = transIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}