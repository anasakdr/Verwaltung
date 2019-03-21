/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Die Klasse Main enthält die Methode main und dient als Einstiegspunkt
 * für das Programm
 * @author anas
 * @version 0.1
 */
public class Main {

    public static CardLayout cl;
    public static JPanel cardPanel;
    public static Connection conn;
    public static int userId;
    public Main() {
        cl = new CardLayout();
        cardPanel = new JPanel(cl);
        cardPanel.add(new Login(), "Login");
        cardPanel.add(new Registerierung(), "Regestrierung");
        cardPanel.add(new UserMenue(), "UserMenue");
        cardPanel.add(new Generator(), "Generator");
        cardPanel.add(new PasswortListe(),"PasswortListe");
        cardPanel.add(new Gruppe(),"Gruppe");
        JFrame frame = new JFrame("CardLayout-Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.setTitle("Passwort Verwaltung");
        frame.pack();
        frame.setSize(cardPanel.getWidth(), cardPanel.getHeight());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

}
