/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.handler;

import ProyekAI.game.stat.Stat;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class tampilan {
    
    Stat s = new Stat();
    public static JFrame frame;
    private Canvas canvas;
    private String title;
    private int width,height;

    public tampilan(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        display();
    }
    
    public void display()
    {
        frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        tamframe();
        canvas=new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);
        
        frame.add(canvas);
        frame.pack();
    }
    
    public Canvas getCanvas(){
        return canvas;
    }
    
    public JFrame getFrame()
    {
        return frame;
    }

    public void tamframe()
    {
        frame.setVisible(true);
    }
    
    public void exitframe()
    {
        frame.setVisible(false);
    }
    
    
}
