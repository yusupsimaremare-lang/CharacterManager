
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    public MainWindow(CharacterManager manager) {

        // Pengaturan jendela
        setTitle("Character Manager v0.3");
        setSize(850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // Judul daftar karakter
        JLabel titleLabel = new JLabel(
            "=== Daftar Karakter ===",
            SwingConstants.CENTER
        );

        titleLabel.setFont(
            new Font("Arial", Font.PLAIN, 16)
        );

        titleLabel.setBorder(
            BorderFactory.createEmptyBorder(20, 10, 20, 10)
        );

        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Panel daftar karakter
        JPanel listPanel = new JPanel();

        listPanel.setBackground(Color.WHITE);

        listPanel.setLayout(
            new BoxLayout(listPanel, BoxLayout.Y_AXIS)
        );

        // Mengambil data karakter secara dinamis
        List<Character> characters = manager.getAllCharacters();

        // Menampilkan setiap karakter menggunakan perulangan
        for (Character character : characters) {

            JLabel characterLabel = new JLabel(
                character.getName()
                + " | " + character.getType()
                + " | Level: " + character.getLevel()
                + " | HP: " + character.getHitPoints()
                + " | Attack: " + character.getAttackPower()
            );

            characterLabel.setFont(
                new Font("Arial", Font.PLAIN, 14)
            );

            characterLabel.setBorder(
                BorderFactory.createEmptyBorder(8, 25, 8, 10)
            );

            listPanel.add(characterLabel);
        }

        // Scroll jika daftar karakter panjang
        JScrollPane scrollPane = new JScrollPane(listPanel);

        scrollPane.setBorder(
            BorderFactory.createEmptyBorder()
        );

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Statistik rata-rata level
        JLabel statisticsLabel = new JLabel(
            String.format(
                "Rata-rata Level: %.2f",
                manager.getAverageLevel()
            ),
            SwingConstants.CENTER
        );

        statisticsLabel.setFont(
            new Font("Arial", Font.BOLD, 16)
        );

        statisticsLabel.setBorder(
            BorderFactory.createEmptyBorder(15, 10, 20, 10)
        );

        mainPanel.add(statisticsLabel, BorderLayout.SOUTH);

        // Menampilkan panel utama
        add(mainPanel);
    }
}
