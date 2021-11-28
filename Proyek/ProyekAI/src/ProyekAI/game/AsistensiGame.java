/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game;
import ProyekAI.game.handler.MainMenu;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class AsistensiGame extends JFrame{
    JFrame continueMenu = new JFrame();
    JFrame newgameMenu = new JFrame();
    ImageIcon clickedCon;
    JLabel cCon;
    ImageIcon titleImage;
    ImageIcon continueImage;
    Image imageModified;
    JLabel title;
    JLabel con;
    Image scaler;
    ImageIcon menuBack;
    JLabel menuB;
    ImageIcon clickedNew;
    JLabel background;
    ImageIcon newImage;
    JLabel newg;
    JFrame menuContainer = new JFrame();
    
    //x + makin ke kanan
    public static void main(String[] args)throws MalformedURLException, IOException, FileNotFoundException, UnsupportedAudioFileException, LineUnavailableException {
        MainMenu p = new MainMenu(); 
    }
    
}
