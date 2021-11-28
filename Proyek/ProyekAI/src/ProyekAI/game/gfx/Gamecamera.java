/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.gfx;

import ProyekAI.game.entities.Entity;
import ProyekAI.game.handler.handler;
import ProyekAI.game.tiles.tilegame;

/**
 *
 * @author ASUS
 */
public class Gamecamera {
    
    boolean camera;
    private float x,y;
    private handler handler;

    public Gamecamera(handler handler,float x, float y) {
        this.handler=handler;
        this.x = x;
        this.y = y;
    }
    
    public void checkBlankSpace(){
        if(x<0)
        {
            x=0;
        }
        else if(x > handler.getWorld().getwidth() * tilegame.tile_width - handler.getWidth())
        {
            x=handler.getWorld().getwidth() * tilegame.tile_width - handler.getWidth();
        }
        
        if(y<0)
        {
            y=0;
        }
        else if(y>handler.getWorld().getheight()*tilegame.tile_height - handler.getHeight())
        {
            y=handler.getWorld().getheight()*tilegame.tile_height - handler.getHeight();
        }
    }
    
    public void center(Entity e)
    {
        x=e.getX()-handler.getWidth()/2 + e.getWidth()/2;
        y=e.getY()-handler.getHeight()/2 + e.getHeight()/2;
        checkBlankSpace();
    }
    
    public void move(float xamt, float yamt)
    {
        x+=xamt;
        y+=yamt;
    }
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
}
