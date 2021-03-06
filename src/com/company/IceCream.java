package com.company;

public class IceCream {
    private String type;
    private String flavour;
    private int cost;

    public IceCream(String type, String flavour, int cost) {
        this.type = type;
        this.flavour = flavour;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return type + " " + flavour + " " + cost;
    }

    public String checkIcecream() {
        return type + " " + flavour;
    }

    public int getCost() {
        return cost;
    }

}
