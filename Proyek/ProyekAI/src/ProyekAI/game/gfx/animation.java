/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.gfx;

import java.awt.image.BufferedImage;

/**
 *
 * @author ASUS
 */
public class animation {
    private int speed,index;
    private long lastTime,timer;
    private BufferedImage[] frame;
    
    
    public animation(int speed,BufferedImage[] frame)
    {
        this.speed=speed;
        this.frame=frame;
        index=0;
        lastTime=System.currentTimeMillis();
    }
    
    public void tick()
    {
        timer+=System.currentTimeMillis()-lastTime;
        lastTime=System.currentTimeMillis();
        
        if(timer>speed)
        {
            index++;
            timer=0;
            if(index >= frame.length)
                index=0;
        }
    }
    
    
    public BufferedImage getCurrentFrame()
    {
        return frame[index];
    }

    
    public BufferedImage getCurrent()
    {
        return frame[0];
    }
}
