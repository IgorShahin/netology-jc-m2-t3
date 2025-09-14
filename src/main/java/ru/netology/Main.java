package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("Исходный список: " + intList);
        System.out.println("Обработка без Stream API:");

        List<Integer> result = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0 && num % 2 == 0) {
                result.add(num);
            }
        }
        Collections.sort(result);

        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
