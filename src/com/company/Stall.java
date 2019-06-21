package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stall {
    private List<String> type = Arrays.asList("STICK", "CONE", "CUP");

    private List<String> flavours = Arrays.asList("CHOCOLATE", "VANILLA", "STRAWBERRY");

    private List<Integer> price = Arrays.asList(25, 45, 15);

    private List<Integer> flavoursCost = Arrays.asList(20, 25, 35);

    private List<IceCream> iceCreamList = new ArrayList<>();

    List<IceCream> createIceCream() {
        for (int i = 0; i < type.size(); i++) {
            String iceCreamType = type.get(i);
            for (int i1 = 0; i1 < flavours.size(); i1++) {
                String flavour = flavours.get(i1);
                int cost = price.get(i) + flavoursCost.get(i1);
                IceCream iceCream = new IceCream(iceCreamType, flavour, cost);
                iceCreamList.add(iceCream);
            }
        }
        return iceCreamList;
    }

    public int calculatecost(String userIceCream) {
        int cost = 0;
        for (IceCream ice : iceCreamList) {
            if (cost == 0) {
                cost = ice.checkIcecream(userIceCream);
            } else {
                return cost;
            }
        }
        return cost;
    }
}

