/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.handler;

import ProyekAI.game.gfx.Gamecamera;
import ProyekAI.game.gfx.ImageLoader;
import ProyekAI.game.gfx.assets;
import ProyekAI.game.gfx.spritesheet;
import ProyekAI.game.input.input;
import ProyekAI.game.stat.Stat;
import ProyekAI.game.states.Gamestate;
import ProyekAI.game.states.state;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class game implements Runnable{
    
    private tampilan tam;
    private int width,height;
    public String title;
    
    private boolean running = false;
    private Thread thread;
    
    private BufferedImage loadimg;
    private spritesheet sheet;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private state gamestate;
    private Stat s = new Stat();
    private input input;
    
    private Gamecamera camera;
    
    private handler handler;
    
    public game(String title, int width, int height) {
        this.title=title;
        this.width=width;
        this.height=height;
        input = new input();
        Stat.setMainmenu(false);
    }
  
    private void init(){
        tam = new tampilan(title,width,height);
        tam.getFrame().addKeyListener(input);
        loadimg = ImageLoader.loadimg("/Textures/dirt.png");
        sheet = new spritesheet(loadimg);
        assets.init();
        handler = new handler(this);
        camera=new Gamecamera(handler,0,0);
        gamestate = new Gamestate(handler);
        state.setCurrentstate(gamestate);
    }
    
    private void mainmenu()
    {
        try {
            MainMenu p = new MainMenu();
        } catch (IOException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tick()
    {
        if(Stat.isMainmenu())
        {
            tam.exitframe();
            mainmenu();
            Stat.setMainmenu(false);
        }
        
        input.tick();
        if(state.getCurrentstate()!=null)
        {
            state.getCurrentstate().tick();
        }
    }
    
    private void render()
    {
        bs = tam.getCanvas().getBufferStrategy();
        if(bs==null)
        {
            tam.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        
        //clear screen 
        
        //gambar
        
        if(state.getCurrentstate()!=null)
        {
            state.getCurrentstate().render(g);
        }
        //end gambar
        
        bs.show();
        g.dispose();
    }
    
    public void run(){
        init();
        
        int fps=60;
        double time=1000000000/fps;
        double delta=0;
        long now;
        long lastime =System.nanoTime();
        long timer=0;
        int tick=0;
        
        while(running)
        {
            now=System.nanoTime();
            delta+= (now-lastime)/time;
            timer += now-lastime;
            lastime=now;
            
            if(delta >= 1){
                tick();
                render();
                tick++;
                delta--;
            }
            
        }
        
        stop();
    }
    public input getinput()
    {
        return input;
    }
    
    public Gamecamera getGamecamera()
    {
        return camera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start()
    {
        if(running)
            return;
        running=true;
        thread = new Thread(this);
        
        thread.start();
    }
    
    public synchronized void stop()
    {
        if(!running)
            return;
        
        running=false;
        try{
            thread.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }
    

}
