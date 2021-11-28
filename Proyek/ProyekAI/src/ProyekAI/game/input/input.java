/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author ASUS
 */
public class input implements KeyListener{
    
    public boolean []keys,pressed,cantpressed;
    public boolean up,down,left,right;

    public input()
    {
        keys = new boolean[256];
        pressed = new boolean[keys.length];
        cantpressed = new boolean[keys.length];
    }
    
    public void tick()
    {
        for (int i = 0; i < keys.length; i++) {
            if(cantpressed[i] && !keys[i])
            {
                cantpressed[i]=false;
            }else if(pressed[i])
            {
                cantpressed[i]=true;
                pressed[i]=false;
            }
            if(!cantpressed[i] && keys[i])
            {
                pressed[i]=true;
            }
        }
       
        
        up=keys[KeyEvent.VK_W];
        down=keys[KeyEvent.VK_S];
        left=keys[KeyEvent.VK_A];
        right=keys[KeyEvent.VK_D];
        
        
    }

    public boolean KeyJustPressed(int keycode)
    {
        if(keycode<0 || keycode>=keys.length)
            return false;
        return pressed[keycode];
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()<0 || e.getKeyCode()>=keys.length)
            return;
        
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()<0 || e.getKeyCode()>=keys.length)
            return;
        keys[e.getKeyCode()] = false;
    }
    
}
