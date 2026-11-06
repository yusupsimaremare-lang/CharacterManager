
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        // Membuat pengelola karakter
        CharacterManager manager = new CharacterManager();

        // Menambahkan 6 karakter
        manager.addCharacter(
            new Character("Arthur", CharacterType.WARRIOR, 10)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 8)
        );

        manager.addCharacter(
            new Character("Robin", CharacterType.ARCHER, 6)
        );

        manager.addCharacter(
            new Character("Galahad", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Lancelot", CharacterType.WARRIOR, 12)
        );

        manager.addCharacter(
            new Character("Luna", CharacterType.MAGE, 9)
        );

        // Menjalankan GUI
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(manager);

            window.setVisible(true);

        });
    }
}
