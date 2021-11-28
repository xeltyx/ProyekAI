/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.states;
import ProyekAI.game.handler.handler;
import java.awt.Graphics;

/**
 *
 * @author ASUS
 */
public abstract class state {
    
    private static state currentstate=null;

    public static state getCurrentstate() {
        return currentstate;
    }

    public static void setCurrentstate(state currentstate) {
        state.currentstate = currentstate;
    }
    protected handler handler;
    
    public state(handler handler)
    {
        this.handler=handler;
    }
    
    public abstract void tick ();
    public abstract void render (Graphics g);
}
