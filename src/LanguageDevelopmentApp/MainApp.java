package LanguageDevelopmentApp;

import Database.GameCard;
import java.io.IOException;
import javax.swing.*;

public class MainApp {

    //private JPanel panelMain;

    public static void main(String[] args) throws IOException{
        //JFrame startUp = new JFrame("MainApp");
        //startUp.setContentPane(new MainApp().panelMain);
/*        startUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startUp.pack();
        startUp.setVisible(true);*/

        GameCard.importCard();

    }
}
