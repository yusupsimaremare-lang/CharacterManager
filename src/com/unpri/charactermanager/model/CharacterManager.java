
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private List<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // Menambahkan karakter
    public void addCharacter(Character character) {

        if (character == null) {
            return;
        }

        if (findByName(character.getName()) != null) {
            System.out.println(
                "❌ Gagal: karakter dengan nama '" +
                character.getName() + "' sudah ada!"
            );
            return;
        }

        characters.add(character);

        System.out.println(
            "✅ Karakter '" + character.getName() +
            "' berhasil ditambahkan."
        );
    }

    // Mencari karakter
    public Character findByName(String name) {

        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }

        return null;
    }

    // Menghapus karakter
    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);

            System.out.println(
                "🗑️ Karakter '" + name +
                "' berhasil dihapus."
            );

            return true;
        }

        return false;
    }

    // Menghitung total karakter
    public int getTotalCharacters() {
        return characters.size();
    }

    // Mengembalikan salinan daftar karakter
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character character : characters) {
            total += character.getLevel();
        }

        return (double) total / characters.size();
    }
}
