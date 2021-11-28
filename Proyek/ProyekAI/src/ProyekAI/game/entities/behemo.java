/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities;

import ProyekAI.game.gfx.animation;
import ProyekAI.game.gfx.assets;
import ProyekAI.game.handler.handler;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class behemo extends character{
    player p;
    
    //attack animation index
    int index=0;
    int timeratt=0;
    boolean attanimation=false;
    
    //getting hurt index animation
    int hurtindex=0;
    int timerhurt=0;
    boolean gettinghurt=false;
    
    //dieanimation
    int dieindex=0;
    int dietimer=0;
    boolean die=false;
    
    private long lastattacktimer,attackcooldown=2000,attacktimer=attackcooldown;
    
    
    boolean up,down,left,right;
    boolean moveup,movedown,moveleft,moveright;
    boolean dead=false;
    
    private animation anidown,aniup,anileft,aniright;
    
    Random rand;
    int move;
    int time=0;
    public behemo(handler handler, float x, float y) {
        
        super(handler,x, y,character.def_width+20,character.def_height+20);
        unhurtable=false;
        
        self=false;
        
        rand = new Random();
        bounds.x=32;
        bounds.y=32;
        bounds.width=32;
        bounds.height=35;

        health=100;
        mp=100;
        defense=20;
        damage=10;
        magicdmg=70;
        criticalrate=0;
        criticaldmg=20;
        
        anidown = new animation(200,assets.behemo_down);
        aniup = new animation(200,assets.behemo_up);
        anileft = new animation(200,assets.behemo_left);
        aniright = new animation(200,assets.behemo_right);        
        
    }

    private void timeratt()
    {
        timeratt++;
        if(timeratt==7)
            timeratt=0;
        if(!attanimation)
            index=0;
        if(index>=3)
        {
            index=0;
            attanimation=false;
        }
        if(timeratt==1 && attanimation)
            index++;
        
    }
    
    private void timerhurt()
    {
        timerhurt++;
        if(timerhurt==20)
        {
            timerhurt=0;
            hurtindex++;
        }
        
        if(hurtindex>3)
        {
            hurtindex=0;
            gettinghurt=false;
        }
    }
    
    private void dietick()
    {
        if(die)
        {
            dietimer++;
            if(dietimer==20)
            {
                dietimer=0;
                dieindex++;
            }

            if(dieindex>3)
            {
                dieindex=0;
                die=false;
                active=false;
            }
        }
    }
    
    @Override
    public void tick() {
        dietick();
        timerhurt();
        timeratt();
        anidown.tick();
        aniup.tick();
        anileft.tick();
        aniright.tick();
        getinput();
        move();
        attack();
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimation(),(int) (x - handler.getGamecamera().getX()),(int)(y-handler.getGamecamera().getY()), width,height,null);
    }

    
    
    private BufferedImage getCurrentAnimation(){
        if(moveup)
        {
            up=true;
            down=false;
            left=false;
            right=false;
            return aniup.getCurrentFrame();
        }
        else if(moveleft)
        {            
            up=false;
            down=false;
            left=true;
            right=false;
            return anileft.getCurrentFrame();
        }
        else if(moveright)
        {
            up=false;
            down=false;
            left=false;
            right=true;
            return aniright.getCurrentFrame();
        }
        else if(movedown)
        {
            up=false;
            left=false;
            right=false;
            down=true;
            return anidown.getCurrentFrame();
        }
        else
        {
            if(up)
               return aniup.getCurrent();
            if(down)
               return anidown.getCurrent();
            if(left)
               return anileft.getCurrent();
            if(right)
               return aniright.getCurrent();
        }
        return anidown.getCurrent();
    }

    
    @Override
    public void die() {
        die=true;
    }
    
    
    private void attack()
    {
        attacktimer+=System.currentTimeMillis()-lastattacktimer;
        lastattacktimer=System.currentTimeMillis();
        
        if(attacktimer<attackcooldown)
            return;
        
        Rectangle cb = getCollisionBounds(0,0);
        Rectangle ar = new Rectangle();
        int arsize=40;
        ar.width=arsize;
        ar.height=arsize;

        if(up)
        {
            ar.x = cb.x + cb.width/2 - arsize+20;
            ar.y = cb.y -arsize;
        }
        else if(down)
        {
            ar.x = cb.x + cb.width/2 - arsize+25;
            ar.y = cb.y + cb.height+30;
        }
        else if(left)
        {
            ar.x = cb.x - arsize;
            ar.y = cb.y + cb.height/2 - arsize/2+25;
        }
        else if(right)
        {
            ar.x = cb.x + cb.width;
            ar.y = cb.y + cb.height/2 - arsize/2+25;
        }

        attacktimer=0;
        
        for (Entity e : handler.getWorld().getEntitymanager().getEntities()) {

            if(e.equals(this))
                continue;

            if(e.getCollisionBounds(0, 0).intersects(ar) && e.self)
            {
                time=0;           

                e.hurtplayer(damage);
                attanimation=true;
                return;
            }
        }
    }
   
    
    private void getinput()
    {

        
        if(time==70)
        {
            move=rand.nextInt(5)+1;
            time=0;
        }
        if(die)
            move=5;
        if(move==1)
        {
            moveup=true;
            movedown=false;
            moveleft=false;
            moveright=false;
        }
        else if(move==2)
        {
            moveup=false;
            movedown=true;
            moveleft=false;
            moveright=false;
        }
        else if(move==3)
        {
            moveup=false;
            movedown=false;
            moveleft=true;
            moveright=false;
        }
        else if(move==4)
        {
            moveup=false;
            movedown=false;
            moveleft=false;
            moveright=true;
        }
        else
        {
            moveup=false;
            movedown=false;
            moveleft=false;
            moveright=false;
        }
        time++;

        xm=0;
        ym=0;
        
        
        if(moveup)
            ym= -speed;
        if(movedown)
            ym= speed;
        if(moveleft)
            xm= -speed;
        if(moveright)
            xm= speed;
    } 

    @Override
    public void gettinghurt() {
       gettinghurt=true;
    }
}
