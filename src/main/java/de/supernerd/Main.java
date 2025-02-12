package de.supernerd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<100; i++) {
            list.add(i);
        }

        list.add(102);
        list.add(152);
        list.add(150);
        list.add(130);
        list.add(114);

        List<Integer> newList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> newList2 = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
        System.out.println(newList2);
        List<Integer> newList3 = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted().collect(Collectors.toList());
        System.out.println(newList3);
        int newList4 = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted().reduce(1, (a, b) -> a + b);
        System.out.println(newList4);

        list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted().forEach(n -> System.out.println(n));

       List<Integer> collect = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}