package com.company;

import java.util.Objects;

public class Farmer extends Base{

    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, false, false);
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.plowing = false;
        this.harvesting = false;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }
}
