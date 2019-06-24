package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stall {
    private List<String> type = Arrays.asList("STICK", "CONE", "CUP");

    private List<String> flavours = Arrays.asList("CHOCOLATE", "VANILLA", "STRAWBERRY");

    private List<Integer> price = Arrays.asList(25, 45, 15);

    private List<Integer> flavoursCost = Arrays.asList(20, 25, 35);

    private List<Integer> additionalCost = Arrays.asList(25, 20, 35);

    List<IceCream> createIceCream() {
        List<IceCream> iceCreamList = new ArrayList<>();
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

    private int checkFlavour(Scanner scan) {
        System.out.println("wanna add topping:");
        System.out.printf("%10s %10S", "FLAVOURS", "Cost");
        System.out.println();
        for (int i = 0; i < additionalCost.size(); i++) {
            System.out.printf("%10s %10s", flavours.get(i), additionalCost.get(i));
            System.out.println();
        }
        System.out.print("Choose your flavour : ");
        String flavour = scan.nextLine();
        int cost = costcalculation(flavour);
        System.out.println("additonal cost = " + cost);
        return cost;
    }

    private int costcalculation(String flavour) {
        return calculateAdditionalCost(flavour);
    }

    private int calculateAdditionalCost(String flavour) {
        int cost = 0;
        for (int i = 0; i < flavours.size(); i++) {
            String flav = flavours.get(i);
            if (flavour.equalsIgnoreCase(flav)) {
                cost = additionalCost.get(i);
            }
        }
        return cost;
    }


    public int calculateCost(String iceCream, List<IceCream> iceCreams, Scanner scan) {
        int cost = 0;
        for (IceCream ice : iceCreams) {
            if (iceCream.equalsIgnoreCase(ice.checkIcecream())) {
                if (iceCream.contains("chocolate")) {
                    cost += checkFlavour(scan);
                    cost += ice.getCost();
                } else {
                    cost = ice.getCost();
                }
                break;
            }
        }

        return cost;
    }
}
