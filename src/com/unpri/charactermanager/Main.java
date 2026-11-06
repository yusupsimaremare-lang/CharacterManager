
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;

public class Main {

    public static void main(String[] args) {

        System.out.println(
            "=== Character Manager v0.2 — CRUD Test ==="
        );

        CharacterManager manager = new CharacterManager();

        // Membuat karakter
        Character c1 = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );

        Character c2 = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character c3 = new Character(
            "Athena", CharacterType.ARCHER, 1
        );

        // Menambahkan karakter
        System.out.println();

        manager.addCharacter(c1);
        manager.addCharacter(c2);
        manager.addCharacter(c3);

        // Menguji karakter duplikat
        System.out.println();

        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR)
        );

        System.out.println(
            "\nTotal karakter saat ini: " +
            manager.getTotalCharacters()
        );

        // Pencarian
        System.out.println("\n--- Pencarian ---");

        Character hasil = manager.findByName("Merlin");

        if (hasil != null) {
            System.out.println("Ditemukan: " + hasil);
        }

        Character zeus = manager.findByName("Zeus");

        if (zeus == null) {
            System.out.println(
                "Zeus tidak ditemukan (sesuai harapan)"
            );
        }

        // Penghapusan
        System.out.println("\n--- Penghapusan ---");

        manager.removeCharacter("Athena");

        System.out.println(
            "Total setelah hapus: " +
            manager.getTotalCharacters()
        );

        // Daftar karakter tersisa
        System.out.println("\n--- Daftar Karakter Tersisa ---");

        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }
    }
}
