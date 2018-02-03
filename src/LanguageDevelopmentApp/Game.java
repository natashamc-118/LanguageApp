package LanguageDevelopmentApp;

import Database.GameCard;

import javax.swing.*;
import java.io.IOException;

public class Game {
    private JPanel Game;
    private JTextField Saying;
    private JLabel Image;
    private JLabel ImageTitle;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Image = new JLabel(new ImageIcon("bed.png"));
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("app");
        frame.setContentPane(new Game().Game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        GameCard.importCard();
    }
}
