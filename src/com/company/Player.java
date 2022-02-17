package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{new BigGun("LeonGun"), new WaterPistol("WaterGun")};
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon() {

        try {
            int input = scanner.nextInt();
            if (input >= 0 && input <= weaponSlots.length) {
                System.out.println("ВЫбран слот " + weaponSlots[input]);
                Weapon weapon = weaponSlots[input];
                weapon.shot();
            } else {
                System.out.println(" Не верный диапазон");
            }
        } catch (Exception e) {
            System.out.println("Не допустимое значение");
        }
    }

//    @Override
//    public String toString() {
//        return "Player{" +
//                "weaponSlots=" + Arrays.toString(weaponSlots) +
//                '}';
//    }
}
