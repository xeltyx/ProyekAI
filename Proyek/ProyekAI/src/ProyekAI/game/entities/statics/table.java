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
public class table extends StaticEntity{
    public table(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width*3, tilegame.tile_height*3);
       unhurtable=true;
       bounds.x=20;
       bounds.y=(int)(height/3);
       bounds.width=width-50;
       bounds.height=height/2;
    }


    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.table,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }

}
