package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCaseMR {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("avni", "rahul", "karan");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
