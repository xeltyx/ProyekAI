/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities;

import ProyekAI.game.Logic;
import ProyekAI.game.handler.handler;
import ProyekAI.game.stat.Stat;
import static ProyekAI.game.world.world.tile;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Entitymanager {
    int time=0;
    int enemytime=0;
    int enemyctr=0;
    private handler handler;
    public static player player;
    private ArrayList<Entity> entities = new ArrayList<>();
    private Comparator<Entity> renderSort = new Comparator<Entity>() {
        @Override
        public int compare(Entity a, Entity b) {
            if(a.getY()+a.getHeight()<b.getY()+b.getHeight())
            {
                return -1;
            }
            else 
            {
                return 1;
            }
        }
    };
    
    public Entitymanager(handler handler, player player) {
        this.handler=handler;
        this.player=player;
        addEntity(player);
    }
    
    int jumlahmusuh;
    public void tick()
    {       
        if(Logic.enemystage1)
        {
            if(enemytime>700 && enemyctr<20)
            {
                enemyctr++;
                enemytime=0;
                addEntity(new skeleton(handler,2140,230));
            }
            enemytime++;
            
            AStar as = new AStar(tile, 4, 20, true);
            List<AStar.Node> pathh = as.findPathTo(7, 7);
            if (pathh != null) {
                pathh.forEach((n) -> {
                    tile[n.y][n.x] = -1;
                });

                for (int[] tile_row : tile) {
                    for (int maze_entry : tile_row) {
                        switch (maze_entry) {
                            case 51:
                                System.out.print(" ");
                                break;
                            case 52:
                                System.out.print(" ");
                                break;
                            case 53:
                                System.out.print(" ");
                                break;
                            case 55:
                                System.out.print(" ");
                                break;
                            case 54:
                                System.out.print(" ");
                                break;
                            case 56:
                                System.out.print(" ");
                                break;
                            case 61:
                                System.out.print(" ");
                                break;
                            case -1:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print("#");
                        }
                    }
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            e.tick();
            if(!e.isActive())
            {
                if(player.getLevel()<100)
                {
                    player.setExp(player.getExp()+100/player.getLevel());
                    if(player.getExp()>=100)
                    {
                        player.setLevel(player.getLevel()+1);
                        player.setExp(0);
                        player.setStatpoint(player.getStatpoint()+4);
                    }
                }
                entities.remove(e);
                Stat.setJumlahmusuh(Stat.getJumlahmusuh()-1);
            }
        }
        entities.sort(renderSort);
        
        if(Stat.getJumlahmusuh()<=0 && !Stat.isIngame())
        {
            Stat.setJumlahmusuh(99);
            Stat.setWin(true);
        }
        
    }
    
    public void render(Graphics g)
    {
        for (Entity e : entities) {
            e.render(g);
        }
        player.postRender(g);
    }
    
    public void addEntity(Entity e)
    {
        entities.add(e);
    }

    
    //getter setter
    
    
    public handler getHandler() {
        return handler;
    }

    public void setHandler(handler handler) {
        this.handler = handler;
    }

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    
    
    
}
