package com.basics.method_references;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MethodRefsExps {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Sharad");
        al.add("Steve");
        al.add("Bill");
        al.add("Larry");

        // printing on same line separated by space
        AtomicInteger i= new AtomicInteger();
        al.forEach(print -> System.out.print(al.get(i.getAndIncrement())+" "));

        // printing all in new lines
        al.forEach(System.out::println);
    }
}
