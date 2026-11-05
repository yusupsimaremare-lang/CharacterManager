
package com.unpri.charactermanager.model;

public class Character {

    // Atribut karakter
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor pertama
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
        this.id = 0;
        this.mana = 0;
    }

    // Constructor kedua
    public Character(int id, String name, CharacterType type, int level) {
        this(name, type, level);
        this.id = id;
    }

    // Getter dan Setter ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter Type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter Level
    public int getLevel() {
        return level;
    }

    // Setter Level dengan perhitungan otomatis
    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level tidak boleh kurang dari 1"
            );
        }

        this.level = level;
        this.hitPoints = level * 100;
        this.attackPower = level * 10;
    }

    // Getter dan Setter HitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    // Getter dan Setter AttackPower
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Getter Mana
    public int getMana() {
        return mana;
    }

    // Setter Mana dengan validasi
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif!"
            );
        }

        this.mana = mana;
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}
