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
public class box extends StaticEntity{
    public box(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width*2, tilegame.tile_height*2);
       unhurtable=true;
       bounds.x=32;
       bounds.y=38;
       bounds.width=52;
       bounds.height=48;
    }


    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.box,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }
}
