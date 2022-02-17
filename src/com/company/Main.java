package com.company;

public class Main {

    public static void main(String[] args) {
        Player pl = new Player();
        while (true) {
            System.out.println("Выберите слот:  0 - Water");
            System.out.println("Выберите слот:  1 - Leon");
            pl.shotWithWeapon();
            System.out.println();
            System.out.println();
        }
    }
}
