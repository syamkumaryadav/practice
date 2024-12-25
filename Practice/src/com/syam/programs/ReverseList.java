package com.syam.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list: " + list);

        List<Integer> reversedList = reverseList(list);

        System.out.println("Reversed list: " + reversedList);
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }
}