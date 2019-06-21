package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stall stall = new Stall();
        List<IceCream> iceCreams = stall.createIceCream();
        menu menu = new menu();
        menu.showIceCreamWithCost(iceCreams);
        System.out.println("Enter what you wanna Try out: ");
        String userIceCream = scan.nextLine();
        System.out.println("Enter Quantity: ");
        int quantity = scan.nextInt();
        int cost = stall.calculatecost(userIceCream);
        int totalCost = cost * quantity;
        System.out.println(totalCost);
    }
}
