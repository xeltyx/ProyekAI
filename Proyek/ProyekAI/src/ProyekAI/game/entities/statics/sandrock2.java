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
public class sandrock2 extends StaticEntity {
    public sandrock2(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width*2, tilegame.tile_height * 1);
       unhurtable=true;
       bounds.x=10;
       bounds.y=(int)(height/1.5f)-5;
       bounds.width=width;
       bounds.height=(int)(height-height/1.5f)-10;
    }

    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.sandrock2,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }
}