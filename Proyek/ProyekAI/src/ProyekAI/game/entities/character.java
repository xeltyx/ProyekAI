/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities;

import ProyekAI.game.handler.handler;
import ProyekAI.game.item.bahancraft;
import ProyekAI.game.item.item;
import ProyekAI.game.item.listcraft;
import ProyekAI.game.item.listshop;
import ProyekAI.game.stat.Stat;
import ProyekAI.game.tiles.tilegame;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class character extends Entity{
    
    //khusus player
    public static ArrayList<item> item = new ArrayList<item>();
    public static ArrayList<listcraft>listcraft = new ArrayList<>();
    public static ArrayList<bahancraft>bahan = new ArrayList<>();
    public static ArrayList<listshop>listshop = new ArrayList<>();
    public static String equip="";
    
    public static int level;
    public static int exp;
    public static int statpoint;
    public static int money=1000;

    
    //status
    public static int vit;
    public static int agility;
    public static int magical;
    public static int strength;
    public static int dexterity;
    public static int critical;
    
    //semua entity
    public static final int DEFAULT_SPEED=2;
    public static final int def_width=64 , def_height=64;
    protected float speed;
    protected float xm,ym;
    
    public character(handler handler,float x, float y,int width,int height) {
        super(handler ,x, y,width,height);
        speed=DEFAULT_SPEED;
        xm=0;
        ym=0;

        Stat.setWin(false);
        
        if(Stat.isTambah())
        {
            privateplayer();
            Stat.setTambah(false);
        }
    }

    private void privateplayer()
    {
        statpoint=0;
        level=1;
        exp=0;
        item.add(new item("rock",5,item.size(),false,false));
        item.add(new item("wood",4,item.size(),false,false));
        
        listcraft.add(new listcraft(0,"beginner sword",false,true));
        listcraft.add(new listcraft(1,"beginner staff",false,true));
        listcraft.add(new listcraft(2,"beginner shield",false,true));
        listcraft.add(new listcraft(3,"beginner gun",false,true));
        listcraft.add(new listcraft(4,"beginner dagger",false,true));
        
        bahan.add(new bahancraft(0,"rock",2));
        bahan.add(new bahancraft(0,"wood",2));
        bahan.add(new bahancraft(1,"rock",2));
        bahan.add(new bahancraft(1,"wood",2));
        bahan.add(new bahancraft(2,"rock",2));
        bahan.add(new bahancraft(3,"rock",2));
        bahan.add(new bahancraft(4,"rock",2));

        listshop.add(new listshop("Potion L",500,true,false));
        listshop.add(new listshop("Remedy L",400,true,false));
        listshop.add(new listshop("Elixir L",2000,true,false));
        listshop.add(new listshop("Elixir M",1000,true,false));
        listshop.add(new listshop("Potion M",300,true,false));
        listshop.add(new listshop("Remedy M",200,true,false));
        
        
    }
    
    public void move()
    {
        if(!Entitycoalition(xm,0f))
        {
            movex();
        }
        if(!Entitycoalition(0f,ym))
        {
            movey();
        }
    }
    
    public void movex()
    {
        if(xm>0)
        {
            int tx=(int)(x + xm + bounds.x + bounds.width)/tilegame.tile_width;
            if(!colitionwidthtile(tx,(int)(y + bounds.y)/tilegame.tile_height) && 
            !colitionwidthtile(tx,(int)(y+bounds.y+bounds.height)/tilegame.tile_height))
            {
                x+= xm;
            }
            else
            {
                x=tx*tilegame.tile_width - bounds.x - bounds.width-1;
            }
        }
        else if(xm<0){
            int tx=((int)(x + xm + bounds.x) /tilegame.tile_width);
            if(!colitionwidthtile(tx,(int)(y + bounds.y)/tilegame.tile_height) && 
            !colitionwidthtile(tx,(int)(y+bounds.y+bounds.height)/tilegame.tile_height))
            {
                x+= xm;
            }
            else
            {
                x=tx*tilegame.tile_width+tilegame.tile_width - bounds.x;
            }
        }
       
    }
    
    public void movey()
    {
        if(ym<0)
        {
            int ty=(int)(y+ym+bounds.y)/tilegame.tile_height;
            if(!colitionwidthtile((int)(x+bounds.x)/tilegame.tile_width,ty) && 
           !colitionwidthtile((int)(x+bounds.x + bounds.width)/tilegame.tile_width,ty) )
            {
                y+=ym;
            }
            else
            {
                y=ty*tilegame.tile_height+tilegame.tile_height-bounds.y;
            }
        }
        else if(ym>0)
        {
            int ty=(int)(y+ym+bounds.y + bounds.height)/tilegame.tile_height;
            if(!colitionwidthtile((int)(x+bounds.x)/tilegame.tile_width,ty) && 
           !colitionwidthtile((int)(x+bounds.x + bounds.width)/tilegame.tile_width,ty) )
            {
                y+=ym;
            }
            else
            {
                y=ty*tilegame.tile_height-bounds.y-bounds.height-1;
            }
        }
        
    }
    
    protected boolean colitionwidthtile(int x,int y)
    {
        return handler.getWorld().getTile(x, y).isSolid();
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
    
    
    public float getXm() {
        return xm;
    }

    public void setXm(float xm) {
        this.xm = xm;
    }

    public float getYm() {
        return ym;
    }

    public void setYm(float ym) {
        this.ym = ym;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
}
