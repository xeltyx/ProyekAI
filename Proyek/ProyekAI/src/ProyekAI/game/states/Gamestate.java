/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.states;
import ProyekAI.game.handler.handler;
import ProyekAI.game.stat.Stat;
import ProyekAI.game.world.world;
import java.awt.Graphics;

/**
 *
 * @author ASUS
// */
public class Gamestate extends state{
    private world world;
    Stat s = new Stat();
    boolean battle=false;
    boolean home=true;
    
    public Gamestate(handler handler) {
        super(handler);
    }
    
    private void home()
    {
        world=new world(handler,"res/world/home.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    private void shop()
    {
        world=new world(handler,"res/world/shop.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    private void ingame()
    {
        
        world=new world(handler,"res/world/world1.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    private void stage1()
    {
        world=new world(handler,"res/world/stage1.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    private void stage2()
    {
        world=new world(handler,"res/world/stage2.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    private void stage3()
    {
        world=new world(handler,"res/world/stage3.txt");
        handler.getGamecamera().move(0,0);
        handler.setWorld(world);
    }
    
    @Override
    public void tick() {
        if(Stat.isIngame())
            ingame();
        else if(Stat.isHome())
            home();
        else if(Stat.isShop())
            shop();
        else if(Stat.isStage1())
            stage1();
        else if(Stat.isStage2())
            stage2();
        else if(Stat.isStage3())
            stage3();
        
        world.tick();
        handler.getGamecamera().move(1, 1);
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }
    
}
