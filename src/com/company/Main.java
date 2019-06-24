package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stall stall = new Stall();
        menu menu = new menu();
        List<IceCream> iceCreams = stall.createIceCream();
        menu.addIcecream(iceCreams);
        menu.showIceCreamWithCost();
        System.out.println("Enter what you wanna Try out: ");
        String userIceCream = scan.nextLine();
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(scan.nextLine());
        int cost = stall.calculateCost(userIceCream, iceCreams, scan);
        int totalCost = cost * quantity;
        System.out.println("cost : " + totalCost);
    }
}
