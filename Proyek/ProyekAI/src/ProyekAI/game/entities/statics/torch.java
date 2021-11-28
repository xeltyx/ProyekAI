/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities.statics;

import ProyekAI.game.gfx.assets;
import ProyekAI.game.handler.handler;
import ProyekAI.game.tiles.tilegame;
import java.awt.Graphics;

/**
 *
 * @author ASUS
 */
public class torch extends StaticEntity{
    public torch(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width+20, tilegame.tile_height+20);
       unhurtable=true;
       bounds.x=32;
       bounds.y=32;
       bounds.width=16;
       bounds.height=16;
    }


    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.torch,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }
}
