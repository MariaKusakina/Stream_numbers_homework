package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNum = new ArrayList<>();
        intList.forEach(number -> {
            if(number > 0 && number % 2 == 0) {
                positiveNum.add(number);
            }
        });
        positiveNum.sort(Comparator.naturalOrder());
        positiveNum.forEach(numbers -> {
            System.out.println(numbers);
        });
    }
}
