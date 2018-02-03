package LanguageDevelopmentApp;

import Database.GameCard;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class GameScreen {
    private JPanel gameScreen;
    private JTextField Saying;
    private JLabel Image;
    private JButton photo1Button;
    private JButton photo2Button;
    private JButton photo3Button;
    private JButton photo4Button;
    private JPanel BUTTONS;
    private JLabel photo4;
    private JLabel photo3;
    private JLabel photo1;
    private JLabel photo2;
    private JLabel ImageTitle;



    public GameScreen() {
        photo1Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP){
                JOptionPane.showMessageDialog(null, "button 1");}
                else{}
            }
        });
        photo2Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                JOptionPane.showMessageDialog(null, "button 2");}
                else{}
            }
        });
        photo3Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                JOptionPane.showMessageDialog(null, "button 3");}
                else{}
            }
        });
        photo4Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                JOptionPane.showMessageDialog(null, "button 4");}
                else{}
            }
        });

        /*photo1Button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (e.getKeyCode() == FocusEvent.VK_RIGHT){
                    JOptionPane.showMessageDialog(null, "button 4");}
                else{}


            }
        });
        photo2Button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);


            }
        });
        photo3Button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);


            }
        });
        photo4Button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);


            }
        }); */
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        Image = new JLabel(new ImageIcon("bed.png"));
        photo1Button = new JButton(new ImageIcon("cat.png"));
        photo2Button = new JButton(new ImageIcon("red.png"));
        photo3Button = new JButton(new ImageIcon("star.png"));
        photo4Button = new JButton(new ImageIcon("dog.png"));
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("app");
        frame.setContentPane(new GameScreen().gameScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        GameCard.importCard();
    }
}
