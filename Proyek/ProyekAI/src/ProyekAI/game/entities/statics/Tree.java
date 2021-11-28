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


public class Tree extends StaticEntity{

    public Tree(handler handler,  float x, float y) {
       super(handler, x, y, tilegame.tile_width*4, tilegame.tile_height * 6);
       unhurtable=true;
       bounds.x=100;
       bounds.y=(int)(height/1.5f);
       bounds.width=width/4+10;
       bounds.height=(int)(height-height/1.5f)-40;
    }

    @Override
    public void tick() {
       
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(assets.tree,(int) (x - handler.getGamecamera().getX()),(int) (y - handler.getGamecamera().getY()), width,height,null);
    }


}
