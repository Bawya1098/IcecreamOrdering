package com.company;

import java.util.List;

class menu {
    void showIceCream(List<IceCream> iceCreams) {
        System.out.printf("%45s", "MENU");
        System.out.println();
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%20s %30s", "s.no", "ICE CREAM");
        System.out.println();
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < iceCreams.size(); i++) {
            IceCream ice = iceCreams.get(i);
            System.out.printf("%20s %30s ", i + 1, ice.toString());
            System.out.println();
        }
    }
}

