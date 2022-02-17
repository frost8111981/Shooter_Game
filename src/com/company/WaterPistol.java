package com.company;

public class WaterPistol extends Weapon {

    public WaterPistol(String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println(" Огонь водичкой");
    }

    @Override
    public String toString() {
        return name + " Водяное";
    }
}
