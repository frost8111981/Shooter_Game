package com.company;

public class BigGun extends Weapon {
    public BigGun(String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println(" Огонь мясорубка");
    }

    @Override
    public String toString() {
        return name + " Мясорубка";
    }
}