package com.company;

import java.util.Arrays;
import java.util.List;

class menu {

    private List<Integer> sno = Arrays.asList(1, 2, 3);

    private List<String> type = Arrays.asList("STICK", "CONE", "CUP");

    private List<String> flavours = Arrays.asList("CHOCOLATE", "VANILLA", "STRAWBERRY");

    void menuDisplay() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%10s %10s  %20s ", "SERIALNO", "ICECREAM_TYPE", "FLAVORS");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < sno.size(); i++) {
            System.out.printf("%5s %10s %25s  ", sno.get(i), type.get(i), flavours.get(i));
            System.out.println();
        }
    }
}

