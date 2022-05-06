package com.company.Factory;

import java.util.Objects;

public abstract class IceCream {

    private int weightOfIceCream;
    private int expirationYear;
    private String flavorName;
    private String lidToDate;
    private float price;
    private float shippingPricePerPound;

    public abstract String expiration();
    public abstract float totalShippingPrice();
    public abstract float priceOfInventory();

    public IceCream(int weightOfIceCream, int expirationYear, String flavorName, String lidToDate, float price, float shippingPricePerPound) {
        this.weightOfIceCream = weightOfIceCream;
        this.expirationYear = expirationYear;
        this.flavorName = flavorName;
        this.lidToDate = lidToDate;
        this.price = price;
        this.shippingPricePerPound = shippingPricePerPound;
    }

    public int getWeightOfIceCream() {
        return weightOfIceCream;
    }

    public void setWeightOfIceCream(int weightOfIceCream) {
        this.weightOfIceCream = weightOfIceCream;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getLidToDate() {
        return lidToDate;
    }

    public void setLidToDate(String lidToDate) {
        this.lidToDate = lidToDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getShippingPricePerPound() {
        return shippingPricePerPound;
    }

    public void setShippingPricePerPound(float shippingPricePerPound) {
        this.shippingPricePerPound = shippingPricePerPound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return weightOfIceCream == iceCream.weightOfIceCream && expirationYear == iceCream.expirationYear && Float.compare(iceCream.price, price) == 0 && Float.compare(iceCream.shippingPricePerPound, shippingPricePerPound) == 0 && Objects.equals(flavorName, iceCream.flavorName) && Objects.equals(lidToDate, iceCream.lidToDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightOfIceCream, expirationYear, flavorName, lidToDate, price, shippingPricePerPound);
    }
}
