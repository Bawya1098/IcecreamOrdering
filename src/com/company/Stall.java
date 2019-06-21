package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stall {
    private List<String> type = Arrays.asList("STICK", "CONE", "CUP");

    private List<String> flavours = Arrays.asList("CHOCOLATE", "VANILLA", "STRAWBERRY");

    private List<IceCream> iceCreamList = new ArrayList<>();

    List<IceCream> createIceCream() {
        for (String iceCreamType : type) {
            for (String flavour : flavours) {
                IceCream iceCream = new IceCream(iceCreamType, flavour);
                iceCreamList.add(iceCream);
            }
        }
        return iceCreamList;
    }
}

