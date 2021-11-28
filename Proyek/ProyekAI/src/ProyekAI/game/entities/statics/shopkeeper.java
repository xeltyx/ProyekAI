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


public class shopkeeper extends StaticEntity{

    public shopkeeper(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width+20, tilegame.tile_height*2+30);
       unhurtable=true;
    }

    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.shopkeeper,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }


}
