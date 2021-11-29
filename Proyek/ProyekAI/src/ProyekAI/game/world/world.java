/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.world;

import ProyekAI.game.Logic;
import ProyekAI.game.entities.Entitymanager;
import ProyekAI.game.entities.bahamut;
import ProyekAI.game.entities.behemo;
import ProyekAI.game.entities.ghost;
import ProyekAI.game.entities.kadal;
import ProyekAI.game.entities.minotaur;
import ProyekAI.game.entities.pixie;
import ProyekAI.game.entities.player;
import ProyekAI.game.entities.sabertooth;
import ProyekAI.game.entities.skeleton;
import ProyekAI.game.entities.statics.portal;
import ProyekAI.game.entities.statics.Tree;
import ProyekAI.game.entities.statics.bananatree;
import ProyekAI.game.entities.statics.barrel;
import ProyekAI.game.entities.statics.barrel3;
import ProyekAI.game.entities.statics.bed;
import ProyekAI.game.entities.statics.box;
import ProyekAI.game.entities.statics.box3;
import ProyekAI.game.entities.statics.chest;
import ProyekAI.game.entities.statics.craft;
import ProyekAI.game.entities.statics.rock;
import ProyekAI.game.entities.statics.shop;
import ProyekAI.game.entities.statics.table;
import ProyekAI.game.entities.statics.cactus;
import ProyekAI.game.entities.statics.chest1;
import ProyekAI.game.entities.statics.house;
import ProyekAI.game.entities.statics.sandrock2;
import ProyekAI.game.entities.statics.shopkeeper;
import ProyekAI.game.entities.statics.sidetree;
import ProyekAI.game.entities.statics.tableshop;
import ProyekAI.game.entities.statics.torch;
import ProyekAI.game.entities.statics.volcarock;
import ProyekAI.game.entities.statics.volcarock2;
import ProyekAI.game.entities.worm;
import ProyekAI.game.entities.zombiemage;
import ProyekAI.game.entities.zombiewarrior;
import static ProyekAI.game.gfx.assets.sandrock2;
import ProyekAI.game.handler.handler;
import ProyekAI.game.stat.Stat;
import ProyekAI.game.tiles.tilegame;
import ProyekAI.game.utils.utils;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class world {
    public static boolean inhouse=false;
    public static boolean inshop=false;
    private handler handler;
    private int width,height;
    private int[][] tile;
    private int spx,spy;
    private Entitymanager entitymanager;

    Stat s = new Stat();
    
    public Entitymanager getEntitymanager() {
        return entitymanager;
    }

    public void setEntitymanager(Entitymanager entitymanager) {
        this.entitymanager = entitymanager;
    }
    
    Random rand = new Random();
    
    public world(handler handler,String path){
        this.handler=handler;
        loadworld(path);
        entitymanager = new Entitymanager(handler,new player(handler,100,100));
        entitymanager.getPlayer().setX(spx);
        entitymanager.getPlayer().setY(spy);
    }
   
    private void ingameentity()
    {
        int ctr=-18;
        for (int i = 0; i < 12; i++) {
            entitymanager.addEntity(new sidetree(handler,-80,ctr));
            ctr+=100;
        }
        
        ctr=60;
        for (int i = 0; i < 11; i++) {
            entitymanager.addEntity(new sidetree(handler,ctr,-100));
            ctr+=100;
        }
        
        ctr=-10;
        for (int i = 0; i < 12; i++) {
            entitymanager.addEntity(new sidetree(handler,1150,ctr));
            ctr+=100;
        }
        
       ctr=0;
        for (int i = 0; i < 11; i++) {
            entitymanager.addEntity(new sidetree(handler,ctr,1100));
            ctr+=120;
        }
        
        
        entitymanager.addEntity(new Tree(handler,500,400));
        entitymanager.addEntity(new house(handler,180,-30));
        entitymanager.addEntity(new Tree(handler,100,400));
        entitymanager.addEntity(new rock(handler,370,600));
        entitymanager.addEntity(new shop(handler,785,20));
        entitymanager.addEntity(new portal(handler,1080,950));
        Stat.setJumlahmusuh(99);
    }
    
    private void shopentity()
    {
        entitymanager.addEntity(new tableshop(handler,155,300));
        entitymanager.addEntity(new shopkeeper(handler,243,250));
        Stat.setJumlahmusuh(99);
    }
    
    private void homeentity()
    {
        entitymanager.addEntity(new craft(handler,190,355));
        entitymanager.addEntity(new chest(handler,940,166));
        entitymanager.addEntity(new bed(handler,520,190));
        entitymanager.addEntity(new bed(handler,580,190));
        entitymanager.addEntity(new table(handler,334,492));
        Stat.setJumlahmusuh(99);
    }
    
    int x;
    int y;
    private void stage1entity()
    {
        entitymanager.addEntity(new torch(handler,400,400));
        Logic.enemystage1=true;
//        //enemy
//        for (int i = 0; i < 2; i++) {
//            x=rand.nextInt(155)+230;
//            y=rand.nextInt(430)+170;
//            entitymanager.addEntity(new skeleton(handler,x,y));
//        }
//        
//        for (int i = 0; i < 4; i++) {
//            x=rand.nextInt(1210)+490;
//            y=rand.nextInt(268)+930;
//            entitymanager.addEntity(new zombiewarrior(handler,x,y));
//        }
//        
//        for (int i = 0; i < 4; i++) {
//            x=rand.nextInt(613)+97;
//            y=rand.nextInt(201)+1510;
//            entitymanager.addEntity(new zombiemage(handler,x,y));
//        }
//        
//        for (int i = 0; i < 2; i++) {
//            x=rand.nextInt(530)+1650;
//            y=rand.nextInt(399)+96;
//            entitymanager.addEntity(new skeleton(handler,x,y));
//        }
//        
//        entitymanager.addEntity(new ghost(handler,1931,265));
        
        Stat.setJumlahmusuh(13);
    }
    
    private void stage2entity() {
        entitymanager.addEntity(new cactus(handler,250,200));
        entitymanager.addEntity(new cactus(handler,1000,300));
        entitymanager.addEntity(new cactus(handler,2000,450));
        entitymanager.addEntity(new cactus(handler,1650,230));
        entitymanager.addEntity(new cactus(handler,1500,400));
        entitymanager.addEntity(new cactus(handler,180,885));
        entitymanager.addEntity(new cactus(handler,1200,450));
        entitymanager.addEntity(new cactus(handler,765,1000));
        
        entitymanager.addEntity(new sandrock2(handler,1900,300));
        entitymanager.addEntity(new sandrock2(handler,2300,200));
        entitymanager.addEntity(new sandrock2(handler,1350,140));
        entitymanager.addEntity(new sandrock2(handler,400,350));
        
        entitymanager.addEntity(new bananatree(handler,150,1850));
        entitymanager.addEntity(new bananatree(handler,300,1960));
        entitymanager.addEntity(new bananatree(handler,500,2190));
        entitymanager.addEntity(new bananatree(handler,600,1700));
        entitymanager.addEntity(new bananatree(handler,480,1890));
        
        //musuh
        
        entitymanager.addEntity(new kadal(handler,300,200));
        entitymanager.addEntity(new kadal(handler,300,300));
        
        entitymanager.addEntity(new minotaur(handler,1800,300));
        entitymanager.addEntity(new minotaur(handler,1900,200));
        
        entitymanager.addEntity(new sabertooth(handler,2400,200));
        entitymanager.addEntity(new sabertooth(handler,1300,140));
        
        entitymanager.addEntity(new worm(handler,150,1800));
        entitymanager.addEntity(new worm(handler,320,1900));
    }
    
    private void stage3entity()
    {
        entitymanager.addEntity(new volcarock(handler,500,300));
        entitymanager.addEntity(new volcarock(handler,570,850));
        entitymanager.addEntity(new volcarock(handler,574,1970));
        entitymanager.addEntity(new volcarock(handler,170,2320));
        entitymanager.addEntity(new volcarock(handler,1950,1960));
        entitymanager.addEntity(new volcarock(handler,1845,1630));
        entitymanager.addEntity(new volcarock(handler,1710,540));
        entitymanager.addEntity(new volcarock(handler,1460,340));
        entitymanager.addEntity(new volcarock(handler,1270,1880));
        
        entitymanager.addEntity(new volcarock2 (handler,180,730));
        entitymanager.addEntity(new volcarock2(handler,184,1720));
        entitymanager.addEntity(new volcarock2(handler,2305,2270));
        entitymanager.addEntity(new volcarock2(handler,2240,1820));
        entitymanager.addEntity(new volcarock(handler,2100,222));
        entitymanager.addEntity(new volcarock2(handler,1270,200));
        entitymanager.addEntity(new volcarock(handler,1012,1818));
        
        //enemy
        entitymanager.addEntity(new behemo(handler,600,400));
        entitymanager.addEntity(new minotaur(handler,180,700));
    }
    
    public void tick()
    {
        if(Stat.isDie())
        {
            entitymanager = new Entitymanager(handler,new player(handler,100,100));
            Stat.setDie(false);
        }
        if(Stat.isIngame())
        {
            ingameentity();
            Stat.setIngame(false);
        }
        else if(Stat.isShop())
        {
            shopentity();
            Stat.setShop(false);
        }
        else if(Stat.isHome())
        {
            homeentity();
            Stat.setHome(false);
        }
        else if(Stat.isStage1())
        {
            stage1entity();
            Stat.setStage1(false);
        }
        
        else if(Stat.isStage2())
        {
            stage2entity();
            Stat.setStage2(false);
        }
        else if(Stat.isStage3())
        {
            stage3entity();
            Stat.setStage3(false);
        }
        entitymanager.tick();
    }
    
    public void render(Graphics g){
        int xstart=(int) Math.max(0,handler.getGamecamera().getX() / tilegame.tile_width);
        int xend=(int)Math.min(width,(handler.getGamecamera().getX() + handler.getWidth())/tilegame.tile_width + 1);
        int ystart=(int) Math.max(0,handler.getGamecamera().getY() / tilegame.tile_height);
        int yend=(int)Math.min(height,(handler.getGamecamera().getY() + handler.getHeight())/tilegame.tile_height + 1);
        
        for (int y = ystart; y < yend; y++) {
            for (int x = xstart; x < xend; x++) {
                getTile(x,y).render(g,(int) 
                (x * tilegame.tile_width - handler.getGamecamera().getX()),
                (int) (y * tilegame.tile_height-handler.getGamecamera().getY()));
            }
        }
        entitymanager.render(g);
    }
    
    public tilegame getTile(int x,int y)
    {
        if(x<0 || y<0 || x>=width || y>=height)
        {
            return tilegame.dirt;
        }
        tilegame t =tilegame.tile[tile[x][y]];
        if(t==null)
        {
            return tilegame.dirt;
        }
        else
        {
            return t;
        }
    }
    
    private void loadworld(String path)
    {
        String file=utils.loadfile(path);
        String [] tokens = file.split("\\s+");
        width=utils.parseInt(tokens[0]);
        height=utils.parseInt(tokens[1]);
        spx=utils.parseInt(tokens[2]);
        spy=utils.parseInt(tokens[3]);
        
        tile=new int[width][height];
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                tile[x][y]=utils.parseInt(tokens[(x+y * width) + 4]);
            }
        }
    }

    public int getwidth()
    {
        return width;
    }
    
    public int getheight()
    {
        return height;
    }

    
}
