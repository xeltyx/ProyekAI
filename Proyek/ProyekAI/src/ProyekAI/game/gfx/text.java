/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.gfx;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author ASUS
 */
public class text {
    public static void drawString(Graphics g,String text,int posx,int posy,boolean center,Color c,Font font)
    {
        g.setColor(c);
        g.setFont(font);
        int x=posx;
        int y=posy;
        if(center){
            FontMetrics fm = g.getFontMetrics(font);
            x=posx - fm.stringWidth(text)/2;
            y=(posy-fm.getHeight()/2)+fm.getAscent();
        }
        
        g.drawString(text, x, y);
    }
}
