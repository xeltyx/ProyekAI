/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.handler;

import ProyekAI.game.gfx.Gamecamera;
import ProyekAI.game.input.input;
import ProyekAI.game.world.world;

/**
 *
 * @author ASUS
 */
public class handler {

    private game game;
    private world world;
    
    public handler(game game) {
        this.game = game;
    }
    
    public Gamecamera getGamecamera()
    {
        return game.getGamecamera();
    }
    
    public input getinput()
    {
        return game.getinput();
    }
    
    public int getWidth()
    {
        return game.getWidth();
    }
    
    public int getHeight()
    {
        return game.getHeight();
    }

    public game getGame() {
        return game;
    }

    public void setGame(game game) {
        this.game = game;
    }

    public world getWorld() {
        return world;
    }

    public void setWorld(world world) {
        this.world = world;
    }    
    
}
