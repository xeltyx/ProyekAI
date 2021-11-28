/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities;

import ProyekAI.game.handler.handler;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author ASUS
 */
public abstract class Entity {

    public boolean unhurtable;
    public boolean self;
    public boolean alive;
    
    public int health;
    public int mp;
    public int damage;
    public int defense;
    public int magicdmg;
    public int criticaldmg;
    public int criticalrate;
    
    protected handler handler;
    protected float x , y; 
    protected int width,height;
    
    protected boolean active=true;
    protected Rectangle bounds;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSelf() {
        return self;
    }

    public void setSelf(boolean self) {
        this.self = self;
    }
    public Entity(handler handler,float x, float y,int width, int height) {
        this.handler=handler;
        this.unhurtable=unhurtable;
        this.self=self;
        this.health=health;
        this.mp=mp;
        this.damage=damage;
        this.magicdmg=magicdmg;
        this.defense=defense;
        this.criticaldmg=criticaldmg;
        this.criticalrate=criticalrate;
        
        
        this.height=height;
        this.width=width;
        this.x = x;
        this.y = y;
        
        bounds = new Rectangle(0,0,width,height);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public abstract void tick();
    public abstract void render (Graphics g);
    
    public void die(){
        
    }
    
    public void gettinghurt()
    {
        
    }
    
    public void exp_plus()
    {
        
    }
    
    public void hurtenemies(int amt)
    {
        if(!unhurtable)
        {
            health -=amt;
            gettinghurt();
            if(health<=0)
            {
                die();
                exp_plus();
            }
        }
    }
    
    public void hurtplayer(int amt)
    {
        if(self)
        {
            health -=amt;
            gettinghurt();
            if(health<=0)
            {
                die();
            }
        }
    }
    
    public boolean Entitycoalition(float xoffset,float yoffset)
    {
        for (Entity e: handler.getWorld().getEntitymanager().getEntities()) {
            if(e.equals(this))
            {
                continue;
            }
            if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xoffset,yoffset)))
            {
                return true;
            }
        }
        return false;
    }
    
    
    
    public Rectangle getCollisionBounds(float xoffset,float yoffset)
    {
        return new Rectangle((int)(x + bounds.x + xoffset),(int)(y + bounds.y + yoffset),bounds.width,bounds.height);
    }
}
