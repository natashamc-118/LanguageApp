package LanguageDevelopmentApp;

import Database.GameCard;

import javax.swing.*;
import java.io.IOException;

public class MainApp {

    private JPanel panelMain;
    private JTextArea languageDevelopmentApplicationTextArea;

    public static void main(String[] args) throws IOException{
        JFrame startUp = new JFrame("MainApp");
        startUp.setContentPane(new MainApp().panelMain);
        startUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startUp.pack();
        startUp.setVisible(true);

        GameCard.importCard();

    }
}
