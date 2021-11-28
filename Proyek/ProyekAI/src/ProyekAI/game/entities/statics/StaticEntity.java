/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities.statics;

import ProyekAI.game.entities.Entity;
import ProyekAI.game.handler.handler;


/**
 *
 * @author ASUS
 */

public abstract class StaticEntity extends Entity {
    public StaticEntity(handler handler, float x, float y, int width, int height) {
       super(handler,x,y,width,height);
    }
}
