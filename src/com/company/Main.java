package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 15};
        System.out.println("четные числы");
        Arrays.stream(array).filter(x -> x % 2 != 1).
                forEach(x -> System.out.println(x + " "));
        List<Integer> integerList = Collections.singletonList(Arrays.stream(array)
                .filter(x -> x % 2 != 1).map(x -> x * x).max(Integer::compareTo)
                .get());
        System.out.println("Макс кв четныx чисел - " + integerList);

    }
}