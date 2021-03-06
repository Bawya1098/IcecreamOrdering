package com.company;

import java.util.ArrayList;
import java.util.List;

class menu {
    private List<IceCream> iceCreamList = new ArrayList<>();

    void addIcecream(List<IceCream> iceCreams) {
        iceCreamList.addAll(iceCreams);
    }

    void showIceCreamWithCost() {
        System.out.printf("%45s", "MENU");
        System.out.println();
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%20s %30s %10s", "s.no", "ICE CREAM", "Cost");
        System.out.println();
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < iceCreamList.size(); i++) {
            IceCream ice = iceCreamList.get(i);
            System.out.printf("%20s %30s ", i + 1, ice.toString());
            System.out.println();
        }
    }
}
