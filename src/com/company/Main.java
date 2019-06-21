package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stall stall = new Stall();
        List<IceCream> iceCreams = stall.createIceCream();
        menu menu = new menu();
        menu.showIceCreamWithCost(iceCreams);
    }
}
