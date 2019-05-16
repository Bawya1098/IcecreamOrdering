package com.company;

import java.util.ArrayList;

class menu {

    private ArrayList<Integer> sno = new ArrayList<>() {{
        add(1);
        add(2);
        add(3);
    }};
    private ArrayList<String> type = new ArrayList<>() {{
        add("STICK");
        add("CONE");
        add("CUP");
    }};
    private ArrayList<Integer> price = new ArrayList<>() {{
        add(25);
        add(45);
        add(15);
    }};
    private ArrayList<String> flavours = new ArrayList<>() {{
        add("CHOCOLATE");
        add("VANILLA");
        add("STRAWBERRY");
    }};
    private ArrayList<Integer> flavours_cost = new ArrayList<>() {{
        add(20);
        add(25);
        add(35);
    }};
    private ArrayList<String> topping = new ArrayList<>() {{
        add("CHOCOLATE");
        add("STRAWBERRY");
        add("VANILLA");
    }};
    private ArrayList<Integer> additional_cost = new ArrayList<>() {{
        add(25);
        add(20);
        add(35);
    }};

    void menuDisplay() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %20s %20s %20s %20S", "SERIALNO", "ICECREAM_TYPE", "TYPE_COST", "FLAVORS", "FLAVOURS_COST", "TOPPING", "ADDITIONALCOST");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < sno.size(); i++) {
            System.out.printf("%10s %10s %10s %20s %20s %20S %20s", sno.get(i), type.get(i), price.get(i), flavours.get(i), flavours_cost.get(i), topping.get(i), additional_cost.get(i));
            System.out.println();
        }
    }

}

