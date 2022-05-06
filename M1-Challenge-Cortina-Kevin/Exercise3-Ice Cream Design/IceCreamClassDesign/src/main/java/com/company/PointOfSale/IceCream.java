package com.company.PointOfSale;

import java.util.Objects;

public abstract class IceCream {

    private int amountOfFlavors;
    private int amountOfScoops;
    private String typeOfCone;
    private String flavorName;
    private boolean inACup;
    private boolean withSyrup;
    private float price;

    public abstract int doubleScoop();
    public abstract float customIceCreamTotalPrice();
    public abstract int tripleScoopPrice();

    public IceCream(int amountOfFlavors, int amountOfScoops, String typeOfCone, String flavorName, boolean inACup, boolean withSyrup, float price) {
        this.amountOfFlavors = amountOfFlavors;
        this.amountOfScoops = amountOfScoops;
        this.typeOfCone = typeOfCone;
        this.flavorName = flavorName;
        this.inACup = inACup;
        this.withSyrup = withSyrup;
        this.price = price;
    }

    public int getAmountOfFlavors() {
        return amountOfFlavors;
    }

    public void setAmountOfFlavors(int amountOfFlavors) {
        this.amountOfFlavors = amountOfFlavors;
    }

    public int getAmountOfScoops() {
        return amountOfScoops;
    }

    public void setAmountOfScoops(int amountOfScoops) {
        this.amountOfScoops = amountOfScoops;
    }

    public String getTypeOfCone() {
        return typeOfCone;
    }

    public void setTypeOfCone(String typeOfCone) {
        this.typeOfCone = typeOfCone;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public boolean isInACup() {
        return inACup;
    }

    public void setInACup(boolean inACup) {
        this.inACup = inACup;
    }

    public boolean isWithSyrup() {
        return withSyrup;
    }

    public void setWithSyrup(boolean withSyrup) {
        this.withSyrup = withSyrup;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return amountOfFlavors == iceCream.amountOfFlavors && amountOfScoops == iceCream.amountOfScoops && inACup == iceCream.inACup && withSyrup == iceCream.withSyrup && Float.compare(iceCream.price, price) == 0 && Objects.equals(typeOfCone, iceCream.typeOfCone) && Objects.equals(flavorName, iceCream.flavorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfFlavors, amountOfScoops, typeOfCone, flavorName, inACup, withSyrup, price);
    }
}
