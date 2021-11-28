/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.handler;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JohnCS
 */
public class Continue extends JFrame {

    public Continue() {
        Image scaler;
        Image imageModified;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon menuBack2;
        JLabel menuB2;
        JFrame Continue = new JFrame();
        menuBack2 = new ImageIcon("src/res/menuBack.png");
        scaler = menuBack2.getImage();
        Continue.setLayout(null);
        Continue.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Continue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Continue.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        imageModified = scaler.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
        menuBack2 = new ImageIcon(imageModified);
        menuB2 = new JLabel("", menuBack2, JLabel.CENTER);
        Continue.setBounds((int) (screenSize.getWidth() / 2.85), (int) (screenSize.getHeight() / 2.5), 400, 400);
        Continue.setVisible(false);
        Continue.add(menuB2);
        Continue.setVisible(true);
    }

}
