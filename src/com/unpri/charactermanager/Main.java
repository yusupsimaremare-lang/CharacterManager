
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Character Manager v0.1 ===");

        // Membuat 3 karakter awal
        Character hero = new Character(
            1, "Arjuna", CharacterType.WARRIOR, 5
        );

        Character wizard = new Character(
            2, "Merlin", CharacterType.MAGE, 3
        );

        Character scout = new Character(
            3, "Athena", CharacterType.ARCHER, 4
        );

        // Menampilkan 3 karakter
        System.out.println("\n=== Daftar Karakter ===");
        System.out.println(hero);
        System.out.println(wizard);
        System.out.println(scout);

        // Demo Level Up
        System.out.println("\n=== Level Up ===");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("Arjuna setelah naik level:");
        System.out.println(hero);

        // Membuat karakter baru untuk Mini-Challenge
        System.out.println("\n=== Mini Challenge ===");

        Character healer = new Character(
            4, "Luna", CharacterType.HEALER, 6
        );

        // Mengatur mana
        healer.setMana(100);

        // Menampilkan karakter baru
        System.out.println(healer);

        // Memeriksa status hidup
        System.out.println(
            "Apakah Luna masih hidup? " + healer.isAlive()
        );

        // Menguji validasi mana
        System.out.println("\n=== Pengujian Validasi Mana ===");

        try {
            healer.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Menguji karakter yang tidak hidup
        System.out.println("\n=== Pengujian isAlive ===");

        healer.setHitPoints(0);

        System.out.println(
            "Apakah Luna masih hidup? " + healer.isAlive()
        );

        System.out.println("\n=== Program Selesai ===");
    }
}
