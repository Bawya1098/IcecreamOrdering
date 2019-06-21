package com.company;

public class IceCream {
    private String type;
    private String flavour;

    public IceCream(String type, String flavour) {
        this.type = type;
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return type + " " + flavour;
    }
}
