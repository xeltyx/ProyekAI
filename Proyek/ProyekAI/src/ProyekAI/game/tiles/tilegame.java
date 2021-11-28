/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.tiles;

import ProyekAI.game.gfx.assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author ASUS
 */


//stage 3
class lava extends tilegame
{
    public lava(int id){
        super(assets.lava,id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
} 

class lavarock1 extends tilegame
{
    public lavarock1(int id){
        super(assets.lavarock1,id);
    }
}
class lavarock2 extends tilegame
{
    public lavarock2(int id){
        super(assets.lavarock2,id);
    }
}


//stage 2 class

class water extends tilegame{
    public water(int id)
    {
        super(assets.water,id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

class sidebeach extends tilegame{
    public sidebeach(int id)
    {
        super(assets.sidebeach,id);
    }
}

class sand extends tilegame{
    public sand(int id)
    {
        super(assets.sand,id);
    }
}

class sandrock extends tilegame{
    public sandrock(int id)
    {
        super(assets.sandrock,id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

//stage 1


class floorleft extends tilegame
{
    public floorleft(int id)
    {
        super(assets.dungeon_floor[4],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class watertopleft extends tilegame
{
    public watertopleft(int id)
    {
        super(assets.water1[0],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class waterleft extends tilegame
{
    public waterleft(int id)
    {
        super(assets.water1[7],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
class waterright extends tilegame
{
    public waterright(int id)
    {
        super(assets.water1[8],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class justwater extends tilegame
{
    public justwater(int id)
    {
        super(assets.water1[6],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class watertopright extends tilegame
{
    public watertopright(int id)
    {
        super(assets.water1[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class waterdownleft extends tilegame
{
    public waterdownleft(int id)
    {
        super(assets.water1[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class waterdownright extends tilegame
{
    public waterdownright(int id)
    {
        super(assets.water1[3],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class waterup extends tilegame
{
    public waterup(int id)
    {
        super(assets.water1[4],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class waterdown extends tilegame
{
    public waterdown(int id)
    {
        super(assets.water1[5],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class corner1 extends tilegame
{
    public corner1(int id)
    {
        super(assets.corner[0],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
class corner2 extends tilegame
{
    public corner2(int id)
    {
        super(assets.corner[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
class corner3 extends tilegame
{
    public corner3(int id)
    {
        super(assets.corner[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
class corner4 extends tilegame
{
    public corner4(int id)
    {
        super(assets.corner[3],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class floortop extends tilegame
{
    public floortop(int id)
    {
        super(assets.dungeon_floor[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class floorright extends tilegame
{
    public floorright(int id)
    {
        super(assets.dungeon_floor[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class floorbot extends tilegame
{
    public floorbot(int id)
    {
        super(assets.dungeon_floor[3],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class floor_dungeon extends tilegame
{
    public floor_dungeon (int id)
    {
        super(assets.dungeon_floor[0],id);
    }
}

class bridgever extends tilegame
{
    public bridgever (int id)
    {
        super(assets.bridgever,id);
    }
}

class bridgehor extends tilegame
{
    public bridgehor (int id)
    {
        super(assets.bridgehor,id);
    }
}

class blank extends tilegame
{
    public blank(int id)
    {
        super(assets.blank,id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

//home

class floor extends tilegame
{
    public floor(int id)
    {
        super(assets.floor,id);
    }
}

class dirt extends tilegame{
    public dirt(int id)
    {
        super(assets.dirt,id);
    }
}

class bushver extends tilegame
{
    public bushver(int id)
    {
        super(assets.bushver,id);
    }
    
    @Override
    public boolean isSolid() {
        return true;
    }
}


class bushor extends tilegame
{
    public bushor(int id)
    {
        super(assets.bushor,id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class sidefence extends tilegame
{
    public sidefence(int id)
    {
        super(assets.sidefence,id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class fence extends tilegame
{
    public fence(int id)
    {
        super(assets.fence[0],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class fenceLeft extends tilegame
{
    public fenceLeft(int id)
    {
        super(assets.fence[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class fenceRight extends tilegame
{
    public fenceRight(int id)
    {
        super(assets.fence[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class wall extends tilegame
{
    public wall(int id)
    {
        super(assets.wall[0],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class wall2 extends tilegame
{
    public wall2(int id)
    {
        super(assets.wall[4],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class walltop extends tilegame
{
    public walltop(int id)
    {
        super(assets.wall[3],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class wallLeft extends tilegame
{
    public wallLeft(int id)
    {
        super(assets.wall[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class wallRight extends tilegame
{
    public wallRight(int id)
    {
        super(assets.wall[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class cornertopleft extends tilegame
{
    public cornertopleft(int id)
    {
        super(assets.cornerhome[0],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class cornertopright extends tilegame
{
    public cornertopright(int id)
    {
        super(assets.cornerhome[1],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class cornerDownRight extends tilegame
{
    public cornerDownRight(int id)
    {
        super(assets.cornerhome[2],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

class cornerDownLeft extends tilegame
{
    public cornerDownLeft(int id)
    {
        super(assets.cornerhome[3],id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}


class bushorend extends tilegame
{
    public bushorend(int id)
    {
        super(assets.bushorend,id);
    }
    
    @Override
    public boolean isSolid() {
        return true;
    }
}

class floor2 extends tilegame
{
    public floor2(int id)
    {
        super(assets.floor2,id);
    }
}

class darkdirt extends tilegame
{
    public darkdirt(int id)
    {
        super(assets.darkdirt,id);
    }
}

class brick extends tilegame{
    public brick(int id)
    {
        super(assets.brick,id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

public class tilegame {
    
    public static final int tile_width=64 , tile_height=64;
    protected BufferedImage texture;
    protected final int id;
    //polymorph
    
    //home
    public static tilegame[] tile = new tilegame[256];
    
    public static tilegame dirt = new dirt(0);
    public static tilegame brick = new brick(1);
    public static tilegame floor = new floor(2);
    public static tilegame bushver = new bushver(3);
    public static tilegame floor2 = new floor2(4);
    public static tilegame darkdirt = new darkdirt(5);   
    public static tilegame bushor = new bushor(6);
    public static tilegame bushorend = new bushorend(7);
    
    public static tilegame sidefence = new sidefence(18);
    
    public static tilegame fence = new fence(8);

    public static tilegame topleft=new cornertopleft(11);
    public static tilegame topright=new cornertopright(12);
    public static tilegame cornerDownLeft=new cornerDownLeft(13);
    public static tilegame cornerDownRight=new cornerDownRight(14);
    
    public static tilegame walltop=new walltop(10);
    public static tilegame wall = new wall(15);
    public static tilegame wall2 = new wall2(18);
    public static tilegame wallLeft= new wallLeft(16);
    public static tilegame wallRight = new wallRight(17);
    
    
    //stage 1
    public static tilegame blank = new blank(50);
    public static tilegame dungeon_floor = new floor_dungeon(51);
    
    public static tilegame floortop = new floortop(52);
    public static tilegame floorbot = new floorbot(53);
    public static tilegame floorleft = new floorleft(54);
    public static tilegame floorright = new floorright(55);
    public static tilegame bridgever = new bridgever(56);
    
    //  |
    //__|
    public static tilegame corner1 = new corner1(57);
    
    //|
    //|__
    public static tilegame corner2 = new corner2(58);
    
    // ___
    //|
    //|
    public static tilegame corner3 = new corner3(59);
    
    //__
    //  |
    //  |
    public static tilegame corner4 = new corner4(60);
    
    public static tilegame bridgehor = new bridgehor(61);
    public static tilegame watertop = new waterup(62);
    public static tilegame waterdown = new waterdown(63);
    public static tilegame watertopleft = new watertopleft(64);
    public static tilegame watertopright = new watertopright(65);
    public static tilegame waterdownleft = new waterdownleft(66);
    public static tilegame waterdownright = new waterdownright(67);
    
    public static tilegame justwater = new justwater(68);
    public static tilegame waterleft = new waterleft(69);
    public static tilegame waterright = new waterright(70);
    //stage 2
    
    public static tilegame sand = new sand(19);
    public static tilegame sandrock = new sandrock(20);
    public static tilegame sidebeach = new sidebeach(21);
    public static tilegame water = new water(22);
    
    //stage 3
    public static tilegame lava = new lava(80);
    public static tilegame lavarock1 = new lavarock1(81);
    public static tilegame lavarock2 = new lavarock2(82);
    
    public tilegame(BufferedImage texture,int id)
    {
        this.texture=texture;
        this.id=id;
        tile[id]=this;
    }

    
    public void tick()
    {
        
    }
    public void render(Graphics g, int x ,int y)
    {
        g.drawImage(texture, x , y, tile_width,tile_height,null);
    }
    
    public boolean isSolid()
    {
        return false;
    }
    
    public int getId() {
        return id;
    }
    
    
}
