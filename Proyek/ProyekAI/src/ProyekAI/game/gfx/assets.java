/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.gfx;

import ProyekAI.game.stat.Stat;
import java.awt.Font;
import java.awt.image.BufferedImage;

/**
 *
 * @author ASUS
 */
public class assets {
    public static final int width = 32, height = 32;
    public static final int p_width=45,p_height=45;
    Stat s = new Stat();
    public static Font font28,font29;
    
    //stage 1
    public static BufferedImage[] dungeon_floor,corner,water1;
    
    public static BufferedImage blank,bridgever,bridgehor,chest1,box,box3,torch,barrel,barrel3;
    
    
    //home
    public static BufferedImage dirt ,darkdirt ,grass , rock , tree ,brick , floor , pohon,sidefence,sidetree,
    bushver,bushor,bushorend,craft,bed,shop,chest,portal,floor2,table,house,shoplist,dialog,craftlist;
    public static BufferedImage inventory,pause,statistic,stage,wincondition;
    public static BufferedImage[] cornerhome,fence,wall;
    public static BufferedImage[] player_down,player_up,player_left,player_right,hpbar,mpbar,expbar;
    public static BufferedImage player_atkup,player_atkdown,player_atkleft,player_atkright;
    
    //shop
    public static BufferedImage tableshop,shopkeeper;
        
    //enemy
    
    public static BufferedImage[] skeleton_down,skeleton_up,skeleton_left,skeleton_right;
    public static BufferedImage[] skeleton_attdown,skeleton_attup,skeleton_attleft,skeleton_attright;
    public static BufferedImage[] skeleton_diedown,skeleton_dieup,skeleton_dieleft,skeleton_dieright;
    
    public static BufferedImage[] zombiemage_down,zombiemage_up,zombiemage_left,zombiemage_right;
    public static BufferedImage[] zombiemage_attdown,zombiemage_attup,zombiemage_attleft,zombiemage_attright;
    public static BufferedImage[] zombiemage_diedown,zombiemage_dieup,zombiemage_dieleft,zombiemage_dieright;
    
    public static BufferedImage[] zombiewarrior_down,zombiewarrior_up,zombiewarrior_left,zombiewarrior_right;
    public static BufferedImage[] zombiewarrior_attdown,zombiewarrior_attup,zombiewarrior_attleft,zombiewarrior_attright;
    public static BufferedImage[] zombiewarrior_diedown,zombiewarrior_dieup,zombiewarrior_dieleft,zombiewarrior_dieright;
    
    public static BufferedImage[] ghost_down,ghost_up,ghost_left,ghost_right;
    public static BufferedImage[] ghost_attdown,ghost_attup,ghost_attleft,ghost_attright;
    public static BufferedImage[] ghost_diedown,ghost_dieup,ghost_dieleft,ghost_dieright;
    
    public static BufferedImage[] kadal_down,kadal_up,kadal_left,kadal_right;
    public static BufferedImage[] kadal_attdown,kadal_attup,kadal_attleft,kadal_attright;
    public static BufferedImage[] kadal_diedown,kadal_dieup,kadal_dieleft,kadal_dieright;
    
    public static BufferedImage[] bahamut_down,bahamut_up,bahamut_left,bahamut_right;
    
    public static BufferedImage[] behemo_down,behemo_up,behemo_left,behemo_right;
    public static BufferedImage[] minotaur_down,minotaur_up,minotaur_left,minotaur_right;
    
    public static BufferedImage[] pixie_down,pixie_up,pixie_left,pixie_right;
    
    public static BufferedImage[] worm_down,worm_up,worm_left,worm_right;
    
    public static BufferedImage[] sabertooth_down,sabertooth_up,sabertooth_left,sabertooth_right;
    public static BufferedImage[] sabertooth_attdown,sabertooth_attup,sabertooth_attleft,sabertooth_attright;
    
    //stage2
    public static BufferedImage sand,sandrock,cactus;
    public static BufferedImage sandrock2,sidebeach,water,bananatree;
    
    //stage 3
    public static BufferedImage lava,lavarock1,lavarock2,redrock,blackrock;
    public static void init()
    {
        font28 = font.loadfont("res/fonts/OpenSans-Bold.ttf",28);
        font29 = font.loadfont("res/fonts/OpenSans-ExtraBoldItalic.ttf",28);
        player_down= new BufferedImage[4];
        player_up= new BufferedImage[4];
        player_left= new BufferedImage[4];
        player_right= new BufferedImage[4];
        
        
        
        hpbar=new BufferedImage[6];
        mpbar=new BufferedImage[6];
        expbar=new BufferedImage[6];
        
        dungeon_floor=new BufferedImage[5];
        water1=new BufferedImage[9];
        corner=new BufferedImage[4];

        cornerhome=new BufferedImage[4];
        fence=new BufferedImage[3];
        wall=new BufferedImage[5];
        
        //enemy
        
        skeleton_down= new BufferedImage[4];
        skeleton_up= new BufferedImage[4];
        skeleton_left= new BufferedImage[4];
        skeleton_right= new BufferedImage[4];
        
        skeleton_attdown= new BufferedImage[4];
        skeleton_attup= new BufferedImage[4];
        skeleton_attleft= new BufferedImage[4];
        skeleton_attright= new BufferedImage[4];
        
        skeleton_diedown= new BufferedImage[4];
        skeleton_dieup= new BufferedImage[4];
        skeleton_dieleft= new BufferedImage[4];
        skeleton_dieright= new BufferedImage[4];
        
        
        
        zombiemage_down= new BufferedImage[4];
        zombiemage_up= new BufferedImage[4];
        zombiemage_left= new BufferedImage[4];
        zombiemage_right= new BufferedImage[4];
        
        zombiemage_attdown= new BufferedImage[4];
        zombiemage_attup= new BufferedImage[4];
        zombiemage_attleft= new BufferedImage[4];
        zombiemage_attright= new BufferedImage[4];
        
        zombiemage_diedown= new BufferedImage[4];
        zombiemage_dieup= new BufferedImage[4];
        zombiemage_dieleft= new BufferedImage[4];
        zombiemage_dieright= new BufferedImage[4];
        
        
        zombiewarrior_down= new BufferedImage[4];
        zombiewarrior_up= new BufferedImage[4];
        zombiewarrior_left= new BufferedImage[4];
        zombiewarrior_right= new BufferedImage[4];
        
        zombiewarrior_attdown= new BufferedImage[4];
        zombiewarrior_attup= new BufferedImage[4];
        zombiewarrior_attleft= new BufferedImage[4];
        zombiewarrior_attright= new BufferedImage[4];
        
        zombiewarrior_diedown= new BufferedImage[4];
        zombiewarrior_dieup= new BufferedImage[4];
        zombiewarrior_dieleft= new BufferedImage[4];
        zombiewarrior_dieright= new BufferedImage[4];
        
        ghost_down= new BufferedImage[4];
        ghost_up= new BufferedImage[4];
        ghost_left= new BufferedImage[4];
        ghost_right= new BufferedImage[4];
        
        ghost_attdown= new BufferedImage[4];
        ghost_attup= new BufferedImage[4];
        ghost_attleft= new BufferedImage[4];
        ghost_attright= new BufferedImage[4];
        
        ghost_diedown= new BufferedImage[4];
        ghost_dieup= new BufferedImage[4];
        ghost_dieleft= new BufferedImage[4];
        ghost_dieright= new BufferedImage[4];
        
        kadal_down= new BufferedImage[6];
        kadal_up= new BufferedImage[6];
        kadal_left= new BufferedImage[6];
        kadal_right= new BufferedImage[6];
        
        kadal_attdown= new BufferedImage[5];
        kadal_attup= new BufferedImage[5];
        kadal_attleft= new BufferedImage[5];
        kadal_attright= new BufferedImage[5];
        
        kadal_diedown= new BufferedImage[4];
        kadal_dieup= new BufferedImage[4];
        kadal_dieleft= new BufferedImage[4];
        kadal_dieright= new BufferedImage[4];
        
        bahamut_down= new BufferedImage[4];
        bahamut_up= new BufferedImage[4];
        bahamut_left= new BufferedImage[4];
        bahamut_right= new BufferedImage[4];
        
        behemo_down= new BufferedImage[3];
        behemo_up= new BufferedImage[3];
        behemo_left= new BufferedImage[3];
        behemo_right= new BufferedImage[3];
        
        minotaur_down= new BufferedImage[3];
        minotaur_up= new BufferedImage[3];
        minotaur_left= new BufferedImage[3];
        minotaur_right= new BufferedImage[3];
        
        pixie_down= new BufferedImage[3];
        pixie_up= new BufferedImage[3];
        pixie_left= new BufferedImage[3];
        pixie_right= new BufferedImage[3];
        
        worm_down= new BufferedImage[3];
        worm_up= new BufferedImage[3];
        worm_left= new BufferedImage[3];
        worm_right= new BufferedImage[3];
        
        sabertooth_down= new BufferedImage[3];
        sabertooth_up= new BufferedImage[3];
        sabertooth_left= new BufferedImage[3];
        sabertooth_right= new BufferedImage[3];
        
        sabertooth_attdown= new BufferedImage[3];
        sabertooth_attup= new BufferedImage[3];
        sabertooth_attleft= new BufferedImage[3];
        sabertooth_attright= new BufferedImage[3];
        
        spritesheet sheet;
        
        if(Stat.isAssassin()){
           sheet = new spritesheet(ImageLoader.loadimg("/character/assassin.png"));
            player_atkright=sheet.crop(p_width*16,0,p_width,p_height);
            player_atkleft=sheet.crop(p_width*17,0,p_width,p_height);
            player_atkup=sheet.crop(p_width*18,0,p_width,p_height);
            player_atkdown=sheet.crop(p_width*19,0,p_width,p_height);
        }
        else if(Stat.isGunner())
        {
            sheet = new spritesheet(ImageLoader.loadimg("/character/gunner.png"));
            player_atkleft=sheet.crop(p_width*16,0,p_width,p_height);
            player_atkright=sheet.crop(p_width*17,0,p_width,p_height);
            player_atkdown=sheet.crop(p_width*18,0,p_width,p_height);
            player_atkup=sheet.crop(p_width*19,0,p_width,p_height);
        }
        else if(Stat.isSwordman())
        {
            sheet = new spritesheet(ImageLoader.loadimg("/character/swordman.png"));
            player_atkright=sheet.crop(p_width*16,0,p_width,p_height);
            player_atkleft=sheet.crop(p_width*17,0,p_width,p_height);
            player_atkdown=sheet.crop(p_width*18,0,p_width,p_height);
            player_atkup=sheet.crop(p_width*19,0,p_width,p_height);
        }
        else if(Stat.isPaladin()){
            sheet = new spritesheet(ImageLoader.loadimg("/character/paladin.png"));
            player_atkright=sheet.crop(p_width*16,0,p_width,p_height);
            player_atkleft=sheet.crop(p_width*17,0,p_width,p_height);
            player_atkdown=sheet.crop(p_width*18,0,p_width,p_height);
            player_atkup=sheet.crop(p_width*19,0,p_width,p_height);
        }
        else if(Stat.isWarlock()){
            
            sheet = new spritesheet(ImageLoader.loadimg("/character/warlock.png"));
            player_atkleft=sheet.crop(p_width*16,0,p_width,p_height);
            player_atkright=sheet.crop(p_width*17,0,p_width,p_height);
            player_atkup=sheet.crop(p_width*18,0,p_width,p_height);
            player_atkdown=sheet.crop(p_width*19,0,p_width,p_height);
        }
        else{
            sheet = new spritesheet(ImageLoader.loadimg("/character/character.png"));
        }
        
        
        player_down[0]=sheet.crop(0,0,p_width,p_height);
        player_down[1]=sheet.crop(p_width,0,p_width,p_height);
        player_down[2]=sheet.crop(p_width*2,0,p_width,p_height);
        player_down[3]=sheet.crop(p_width*3,0,p_width,p_height);
        
        player_up[0]=sheet.crop(p_width*4,0,p_width,p_height);
        player_up[1]=sheet.crop(p_width*5,0,p_width,p_height);
        player_up[2]=sheet.crop(p_width*6,0,p_width,p_height);
        player_up[3]=sheet.crop(p_width*7,0,p_width,p_height);
        
        player_left[0]=sheet.crop(p_width*8,0,p_width,p_height);
        player_left[1]=sheet.crop(p_width*9,0,p_width,p_height);
        player_left[2]=sheet.crop(p_width*10,0,p_width,p_height);
        player_left[3]=sheet.crop(p_width*11,0,p_width,p_height);
        
        player_right[0]=sheet.crop(p_width*12,0,p_width,p_height);
        player_right[1]=sheet.crop(p_width*13,0,p_width,p_height);
        player_right[2]=sheet.crop(p_width*14,0,p_width,p_height);
        player_right[3]=sheet.crop(p_width*15,0,p_width,p_height);
        
        
        
        //enemy
        sheet = new spritesheet(ImageLoader.loadimg("/character/skeleton.png"));
        skeleton_down[0]=sheet.crop(0,0,65,73);
        skeleton_down[1]=sheet.crop(65,0,65,73);
        skeleton_down[2]=sheet.crop(65*2,0,65,73);
        skeleton_down[3]=sheet.crop(65*3,0,65,73);

        skeleton_left[0]=sheet.crop(0,77,65,70);
        skeleton_left[1]=sheet.crop(65,77,65,70);
        skeleton_left[2]=sheet.crop(65*2,77,65,70);
        skeleton_left[3]=sheet.crop(65*3,77,65,70);
        
        skeleton_right[0]=sheet.crop(0,70*2,65,70);
        skeleton_right[1]=sheet.crop(65,70*2,65,70);
        skeleton_right[2]=sheet.crop(65*2,70*2,65,70);
        skeleton_right[3]=sheet.crop(65*3,70*2,65,70);
        
        skeleton_up[0]=sheet.crop(0,70*3,65,70);
        skeleton_up[1]=sheet.crop(65,70*3,65,70);
        skeleton_up[2]=sheet.crop(65*2,70*3,65,70);
        skeleton_up[3]=sheet.crop(65*3,70*3,65,70);
        
        skeleton_attdown[0]=sheet.crop(65*4+3,0,65,70);
        skeleton_attdown[1]=sheet.crop(65*5+3,0,65,70);
        skeleton_attdown[2]=sheet.crop(65*6+3,0,65,70);
        skeleton_attdown[3]=sheet.crop(65*7+3,0,65,70);
        
        skeleton_attleft[0]=sheet.crop(65*4,77,65,70);
        skeleton_attleft[1]=sheet.crop(65*5,77,65,70);
        skeleton_attleft[2]=sheet.crop(65*6,77,65,70);
        skeleton_attleft[3]=sheet.crop(65*7,77,65,70);
        
        skeleton_attright[0]=sheet.crop(66*4,70*2,65,70);
        skeleton_attright[1]=sheet.crop(66*5,70*2,65,70);
        skeleton_attright[2]=sheet.crop(66*6,70*2,65,70);
        skeleton_attright[3]=sheet.crop(66*7,70*2,65,70);
        
        skeleton_attup[0]=sheet.crop(65*4,70*3,65,70);
        skeleton_attup[1]=sheet.crop(65*5,70*3,65,70);
        skeleton_attup[2]=sheet.crop(65*6,70*3,65,70);
        skeleton_attup[3]=sheet.crop(65*7,70*3,65,70);
        
        skeleton_diedown[0]=sheet.crop(65*8,0,65,70);
        skeleton_diedown[1]=sheet.crop(65*9,0,65,70);
        skeleton_diedown[2]=sheet.crop(65*10,0,65,70);
        skeleton_diedown[3]=sheet.crop(65*11,0,65,70);
        
        skeleton_dieleft[0]=sheet.crop(65*8,77,65,70);
        skeleton_dieleft[1]=sheet.crop(65*9,77,65,70);
        skeleton_dieleft[2]=sheet.crop(65*10,77,65,70);
        skeleton_dieleft[3]=sheet.crop(65*11,77,65,70);
        
        skeleton_dieright[0]=sheet.crop(65*8,70*2,65,70);
        skeleton_dieright[1]=sheet.crop(65*9,70*2,65,70);
        skeleton_dieright[2]=sheet.crop(65*10,70*2,65,70);
        skeleton_dieright[3]=sheet.crop(65*11,70*2,65,70);
        
        skeleton_dieup[0]=sheet.crop(65*8,70*3,65,70);
        skeleton_dieup[1]=sheet.crop(65*9,70*3,65,70);
        skeleton_dieup[2]=sheet.crop(65*10,70*3,65,70);
        skeleton_dieup[3]=sheet.crop(65*11,70*3,65,70);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/zombiemage.png"));
        
        zombiemage_down[0]=sheet.crop(0,5,65,66);
        zombiemage_down[1]=sheet.crop(65,5,65,66);
        zombiemage_down[2]=sheet.crop(65*2,5,65,66);
        zombiemage_down[3]=sheet.crop(65*3,5,65,66);
        
        zombiemage_left[0]=sheet.crop(0,70,65,65);
        zombiemage_left[1]=sheet.crop(65,70,65,65);
        zombiemage_left[2]=sheet.crop(65*2,70,65,65);
        zombiemage_left[3]=sheet.crop(65*3,70,65,65);
        
        zombiemage_right[0]=sheet.crop(0,67*2,65,65);
        zombiemage_right[1]=sheet.crop(65,67*2,65,65);
        zombiemage_right[2]=sheet.crop(65*2,67*2,65,65);
        zombiemage_right[3]=sheet.crop(65*3,67*2,65,65);
        
        zombiemage_up[0]=sheet.crop(0,66*3,65,66);
        zombiemage_up[1]=sheet.crop(65,66*3,65,66);
        zombiemage_up[2]=sheet.crop(65*2,66*3,65,66);
        zombiemage_up[3]=sheet.crop(65*3,66*3,65,66);
        
        zombiemage_attdown[0]=sheet.crop(65*4,5,65,66);
        zombiemage_attdown[1]=sheet.crop(65,5,65,66);
        zombiemage_attdown[2]=sheet.crop(65*6,5,65,66);
        zombiemage_attdown[3]=sheet.crop(65*7,5,65,66);
        
        zombiemage_attleft[0]=sheet.crop(65*4,70,65,65);
        zombiemage_attleft[1]=sheet.crop(65*5,70,65,65);
        zombiemage_attleft[2]=sheet.crop(65*6,70,65,65);
        zombiemage_attleft[3]=sheet.crop(65*7,70,65,65);
        
        zombiemage_attright[0]=sheet.crop(65*4,67*2,65,65);
        zombiemage_attright[1]=sheet.crop(65*5,67*2,65,65);
        zombiemage_attright[2]=sheet.crop(65*6,67*2,65,65);
        zombiemage_attright[3]=sheet.crop(65*7,67*2,65,65);
        
        zombiemage_dieup[0]=sheet.crop(65*8,66*3,65,66);
        zombiemage_dieup[1]=sheet.crop(65*9,66*3,65,66);
        zombiemage_dieup[2]=sheet.crop(65*10,66*3,65,66);
        zombiemage_dieup[3]=sheet.crop(65*11,66*3,65,66);
        
        zombiemage_diedown[0]=sheet.crop(65*8,5,65,66);
        zombiemage_diedown[1]=sheet.crop(65,9,65,66);
        zombiemage_diedown[2]=sheet.crop(65*10,5,65,66);
        zombiemage_diedown[3]=sheet.crop(65*11,5,65,66);
        
        zombiemage_dieleft[0]=sheet.crop(65*8,70,65,65);
        zombiemage_dieleft[1]=sheet.crop(65*9,70,65,65);
        zombiemage_dieleft[2]=sheet.crop(65*10,70,65,65);
        zombiemage_dieleft[3]=sheet.crop(65*11,70,65,65);
        
        zombiemage_dieright[0]=sheet.crop(65*8,67*2,65,65);
        zombiemage_dieright[1]=sheet.crop(65*9,67*2,65,65);
        zombiemage_dieright[2]=sheet.crop(65*10,67*2,65,65);
        zombiemage_dieright[3]=sheet.crop(65*11,67*2,65,65);
        
        zombiemage_attup[0]=sheet.crop(65*8,66*3,65,66);
        zombiemage_attup[1]=sheet.crop(65*9,66*3,65,66);
        zombiemage_attup[2]=sheet.crop(65*10,66*3,65,66);
        zombiemage_attup[3]=sheet.crop(65*11,66*3,65,66);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/zombiewarrior.png"));
        
        zombiewarrior_down[0]=sheet.crop(0,5,65,66);
        zombiewarrior_down[1]=sheet.crop(65,5,65,66);
        zombiewarrior_down[2]=sheet.crop(65*2,5,65,66);
        zombiewarrior_down[3]=sheet.crop(65*3,5,65,66);
        
        zombiewarrior_left[0]=sheet.crop(0,75,65,65);
        zombiewarrior_left[1]=sheet.crop(65,75,65,65);
        zombiewarrior_left[2]=sheet.crop(65*2,75,65,65);
        zombiewarrior_left[3]=sheet.crop(65*3,75,65,65);
        
        zombiewarrior_right[0]=sheet.crop(0,67*2,65,65);
        zombiewarrior_right[1]=sheet.crop(65,67*2,65,65);
        zombiewarrior_right[2]=sheet.crop(65*2,67*2,65,65);
        zombiewarrior_right[3]=sheet.crop(65*3,67*2,65,65);
        
        zombiewarrior_up[0]=sheet.crop(0,66*3,65,66);
        zombiewarrior_up[1]=sheet.crop(65,66*3,65,66);
        zombiewarrior_up[2]=sheet.crop(65*2,66*3,65,66);
        zombiewarrior_up[3]=sheet.crop(65*3,66*3,65,66);
        
        zombiewarrior_attdown[0]=sheet.crop(65*4,5,65,66);
        zombiewarrior_attdown[1]=sheet.crop(65,5,65,66);
        zombiewarrior_attdown[2]=sheet.crop(65*6,5,65,66);
        zombiewarrior_attdown[3]=sheet.crop(65*7,5,65,66);
        
        zombiewarrior_attleft[0]=sheet.crop(65*4,75,65,65);
        zombiewarrior_attleft[1]=sheet.crop(65*5,75,65,65);
        zombiewarrior_attleft[2]=sheet.crop(65*6,75,65,65);
        zombiewarrior_attleft[3]=sheet.crop(65*7,75,65,65);
        
        zombiewarrior_attright[0]=sheet.crop(65*4,67*2,65,65);
        zombiewarrior_attright[1]=sheet.crop(65*5,67*2,65,65);
        zombiewarrior_attright[2]=sheet.crop(65*6,67*2,65,65);
        zombiewarrior_attright[3]=sheet.crop(65*7,67*2,65,65);
        
        zombiewarrior_attup[0]=sheet.crop(65*4,66*3,65,66);
        zombiewarrior_attup[1]=sheet.crop(65*5,66*3,65,66);
        zombiewarrior_attup[2]=sheet.crop(65*6,66*3,65,66);
        zombiewarrior_attup[3]=sheet.crop(65*7,66*3,65,66);
        
        zombiewarrior_diedown[0]=sheet.crop(65*8,5,65,66);
        zombiewarrior_diedown[1]=sheet.crop(65,9,65,66);
        zombiewarrior_diedown[2]=sheet.crop(65*10,5,65,66);
        zombiewarrior_diedown[3]=sheet.crop(65*11,5,65,66);
        
        zombiewarrior_dieleft[0]=sheet.crop(65*8,70,65,65);
        zombiewarrior_dieleft[1]=sheet.crop(65*9,70,65,65);
        zombiewarrior_dieleft[2]=sheet.crop(65*10,70,65,65);
        zombiewarrior_dieleft[3]=sheet.crop(65*11,70,65,65);
        
        zombiewarrior_dieright[0]=sheet.crop(65*8,67*2,65,65);
        zombiewarrior_dieright[1]=sheet.crop(65*9,67*2,65,65);
        zombiewarrior_dieright[2]=sheet.crop(65*10,67*2,65,65);
        zombiewarrior_dieright[3]=sheet.crop(65*11,67*2,65,65);
        
        zombiewarrior_dieup[0]=sheet.crop(65*8,66*3,65,66);
        zombiewarrior_dieup[1]=sheet.crop(65*9,66*3,65,66);
        zombiewarrior_dieup[2]=sheet.crop(65*10,66*3,65,66);
        zombiewarrior_dieup[3]=sheet.crop(65*11,66*3,65,66);
        
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/ghost.png"));
        
        ghost_down[0]=sheet.crop(0,5,65,66);
        ghost_down[1]=sheet.crop(65,5,65,66);
        ghost_down[2]=sheet.crop(65*2,5,65,66);
        ghost_down[3]=sheet.crop(65*3,5,65,66);
        
        ghost_left[0]=sheet.crop(0,75,65,65);
        ghost_left[1]=sheet.crop(65,75,65,65);
        ghost_left[2]=sheet.crop(65*2,75,65,65);
        ghost_left[3]=sheet.crop(65*3,75,65,65);
        
        ghost_right[0]=sheet.crop(0,70*2,65,65);
        ghost_right[1]=sheet.crop(65,70*2,65,65);
        ghost_right[2]=sheet.crop(65*2,70*2,65,65);
        ghost_right[3]=sheet.crop(65*3,70*2,65,65);
        
        ghost_up[0]=sheet.crop(0,70*3,65,66);
        ghost_up[1]=sheet.crop(65,70*3,65,66);
        ghost_up[2]=sheet.crop(65*2,70*3,65,66);
        ghost_up[3]=sheet.crop(65*3,70*3,65,66);
        
        ghost_attdown[0]=sheet.crop(65*4,5,65,66);
        ghost_attdown[1]=sheet.crop(65,5,65,66);
        ghost_attdown[2]=sheet.crop(65*6,5,65,66);
        ghost_attdown[3]=sheet.crop(65*7,5,65,66);
        
        ghost_attleft[0]=sheet.crop(65*4,75,65,65);
        ghost_attleft[1]=sheet.crop(65*5,75,65,65);
        ghost_attleft[2]=sheet.crop(65*6,75,65,65);
        ghost_attleft[3]=sheet.crop(65*7,75,65,65);
        
        ghost_attright[0]=sheet.crop(65*4,70*2,65,65);
        ghost_attright[1]=sheet.crop(65*5,70*2,65,65);
        ghost_attright[2]=sheet.crop(65*6,70*2,65,65);
        ghost_attright[3]=sheet.crop(65*7,70*2,65,65);
        
        ghost_attup[0]=sheet.crop(65*4,70*3,65,66);
        ghost_attup[1]=sheet.crop(65*5,70*3,65,66);
        ghost_attup[2]=sheet.crop(65*6,70*3,65,66);
        ghost_attup[3]=sheet.crop(65*7,70*3,65,66);
        
        ghost_diedown[0]=sheet.crop(65*8,5,65,66);
        ghost_diedown[1]=sheet.crop(65,9,65,66);
        ghost_diedown[2]=sheet.crop(65*10,5,65,66);
        ghost_diedown[3]=sheet.crop(65*11,5,65,66);
        
        ghost_dieleft[0]=sheet.crop(65*8,70,65,65);
        ghost_dieleft[1]=sheet.crop(65*9,70,65,65);
        ghost_dieleft[2]=sheet.crop(65*10,70,65,65);
        ghost_dieleft[3]=sheet.crop(65*11,70,65,65);
        
        ghost_dieright[0]=sheet.crop(65*8,70*2,65,65);
        ghost_dieright[1]=sheet.crop(65*9,70*2,65,65);
        ghost_dieright[2]=sheet.crop(65*10,70*2,65,65);
        ghost_dieright[3]=sheet.crop(65*11,70*2,65,65);
        
        ghost_dieup[0]=sheet.crop(65*8,70*3,65,66);
        ghost_dieup[1]=sheet.crop(65*9,70*3,65,66);
        ghost_dieup[2]=sheet.crop(65*10,70*3,65,66);
        ghost_dieup[3]=sheet.crop(65*11,70*3,65,66);
        
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/kadal.png"));
        //width=80
        //height=56
        //player_right[3]=sheet.crop(p_width*15,0,p_width,p_height);
        
        kadal_right[0]=sheet.crop(0,0,80,56);
        kadal_right[1]=sheet.crop(80,0,80,56);
        kadal_right[2]=sheet.crop(80*2,0,80,56);
        kadal_right[3]=sheet.crop(80*3,0,80,56);
        kadal_right[4]=sheet.crop(80*4,0,80,56);
        kadal_right[5]=sheet.crop(80*5,0,80,56);
        
        kadal_attright[0]=sheet.crop(0,56,80,56);
        kadal_attright[1]=sheet.crop(80,56,80,56);
        kadal_attright[2]=sheet.crop(80*2,56,80,56);
        kadal_attright[3]=sheet.crop(80*3,56,80,56);
        kadal_attright[4]=sheet.crop(80*4,56,80,56);
        
        kadal_left[0]=sheet.crop(0,56*2,80,56);
        kadal_left[1]=sheet.crop(80,56*2,80,56);
        kadal_left[2]=sheet.crop(80*2,56*2,80,56);
        kadal_left[3]=sheet.crop(80*3,56*2,80,56);
        kadal_left[4]=sheet.crop(80*4,56*2,80,56);
        kadal_left[5]=sheet.crop(80*5,56*2,80,56);
        
        kadal_attleft[0]=sheet.crop(0,56*3,80,56);
        kadal_attleft[1]=sheet.crop(80*2,56*3,80,56);
        kadal_attleft[2]=sheet.crop(80*3,56*3,80,56);
        kadal_attleft[3]=sheet.crop(80*4,56*3,80,56);
        kadal_attleft[4]=sheet.crop(80*5,56*3,80,56);
        
        kadal_down[0]=sheet.crop(0,56*4,80,56);
        kadal_down[1]=sheet.crop(80,56*4,80,56);
        kadal_down[2]=sheet.crop(80*2,56*4,80,56);
        kadal_down[3]=sheet.crop(80*3,56*4,80,56);
        kadal_down[4]=sheet.crop(80*4,56*4,80,56);
        kadal_down[5]=sheet.crop(80*5,56*4,80,56);
        
        kadal_attdown[0]=sheet.crop(80,56*5,80,56);
        kadal_attdown[1]=sheet.crop(80*2,56*5,80,56);
        kadal_attdown[2]=sheet.crop(80*3,56*5,80,56);
        kadal_attdown[3]=sheet.crop(80*4,56*5,80,56);
        kadal_attdown[4]=sheet.crop(80*5,56*5,80,56);

        kadal_up[0]=sheet.crop(0,56*6,80,56);
        kadal_up[1]=sheet.crop(80,56*6,80,56);
        kadal_up[2]=sheet.crop(80*2,56*6,80,56);
        kadal_up[3]=sheet.crop(80*3,56*6,80,56);
        kadal_up[4]=sheet.crop(80*4,56*6,80,56);
        kadal_up[5]=sheet.crop(80*5,56*6,80,56);
        
        kadal_attup[0]=sheet.crop(0,56*7,80,56);
        kadal_attup[1]=sheet.crop(80,56*7,80,56);
        kadal_attup[2]=sheet.crop(80*2,56*7,80,56);
        kadal_attup[3]=sheet.crop(80*3,56*7,80,56);
        kadal_attup[4]=sheet.crop(80*4,56*7,80,56);

        kadal_dieright[0]=sheet.crop(80*5,56,80,56);
        kadal_dieright[1]=sheet.crop(80*5,56*3,80,56);
        kadal_dieright[2]=sheet.crop(80*5,56*5,80,56);
        kadal_dieright[3]=sheet.crop(80*5,56*7,80,56);
        
        kadal_dieleft[0]=sheet.crop(80*5,56,80,56);
        kadal_dieleft[1]=sheet.crop(80*5,56*3,80,56);
        kadal_dieleft[2]=sheet.crop(80*5,56*5,80,56);
        kadal_dieleft[3]=sheet.crop(80*5,56*7,80,56);
        
        kadal_dieup[0]=sheet.crop(80*5,56,80,56);
        kadal_dieup[1]=sheet.crop(80*5,56*3,80,56);
        kadal_dieup[2]=sheet.crop(80*5,56*5,80,56);
        kadal_dieup[3]=sheet.crop(80*5,56*7,80,56);
        
        kadal_diedown[0]=sheet.crop(80*5,56,80,56);
        kadal_diedown[1]=sheet.crop(80*5,56*3,80,56);
        kadal_diedown[2]=sheet.crop(80*5,56*5,80,56);
        kadal_diedown[3]=sheet.crop(80*5,56*7,80,56);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/bahamut.png"));
        
        bahamut_down[0]=sheet.crop(0,0,96,96);
        bahamut_down[1]=sheet.crop(96,0,96,96);
        bahamut_down[2]=sheet.crop(96*2,0,96,96);
        
        bahamut_left[0]=sheet.crop(0,96,96,96);
        bahamut_left[1]=sheet.crop(96,96,96,96);
        bahamut_left[2]=sheet.crop(96*2,96,96,96);
        
        bahamut_right[0]=sheet.crop(0,96*2,96,96);
        bahamut_right[1]=sheet.crop(96,96*2,96,96);
        bahamut_right[2]=sheet.crop(96*2,96*2,96,96);
        
        bahamut_up[0]=sheet.crop(0,96*3,96,96);
        bahamut_up[1]=sheet.crop(96,96*3,96,96);
        bahamut_up[2]=sheet.crop(96*2,96*3,96,96);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/behemo.png"));
        
        behemo_down[0]=sheet.crop(0,0,96,96);
        behemo_down[1]=sheet.crop(96,0,96,96);
        behemo_down[2]=sheet.crop(96*2,0,96,96);
        
        behemo_left[0]=sheet.crop(0,96,96,96);
        behemo_left[1]=sheet.crop(96,96,96,96);
        behemo_left[2]=sheet.crop(96*2,96,96,96);
        
        behemo_right[0]=sheet.crop(0,96*2,96,96);
        behemo_right[1]=sheet.crop(96,96*2,96,96);
        behemo_right[2]=sheet.crop(96*2,96*2,96,96);
        
        behemo_up[0]=sheet.crop(0,96*3,96,96);
        behemo_up[1]=sheet.crop(96,96*3,96,96);
        behemo_up[2]=sheet.crop(96*2,96*3,96,96);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/minotaur.png"));
        
        minotaur_down[0]=sheet.crop(0,0,76,79);
        minotaur_down[1]=sheet.crop(76,0,76,79);
        minotaur_down[2]=sheet.crop(76*2,0,76,79);
        
        minotaur_left[0]=sheet.crop(0,79,76,79);
        minotaur_left[1]=sheet.crop(76,79,76,79);
        minotaur_left[2]=sheet.crop(76*2,79,76,79);
        
        minotaur_right[0]=sheet.crop(0,79*2,76,79);
        minotaur_right[1]=sheet.crop(76,79*2,76,79);
        minotaur_right[2]=sheet.crop(76*2,79*2,76,79);
        
        minotaur_up[0]=sheet.crop(0,79*3,76,79);
        minotaur_up[1]=sheet.crop(76,79*3,76,79);
        minotaur_up[2]=sheet.crop(76*2,79*3,76,79);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/pixie.png"));
        //width=96
        //height=48
        
        pixie_down[0]=sheet.crop(0,0,96,48);
        pixie_down[1]=sheet.crop(96,0,96,48);
        pixie_down[2]=sheet.crop(96*2,0,96,48);
        
        pixie_left[0]=sheet.crop(0,48,96,48);
        pixie_left[1]=sheet.crop(96,48,96,48);
        pixie_left[2]=sheet.crop(96*2,48,96,48);
        
        pixie_right[0]=sheet.crop(0,48*2,96,48);
        pixie_right[1]=sheet.crop(96,48*2,96,48);
        pixie_right[2]=sheet.crop(96*2,48*2,96,48);
        
        pixie_up[0]=sheet.crop(0,48*3,96,48);
        pixie_up[1]=sheet.crop(96,48*3,96,48);
        pixie_up[2]=sheet.crop(96*2,48*3,96,48);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/worm.png"));
        //width=64
        //height=48
        
        worm_down[0]=sheet.crop(0,0,64,48);
        worm_down[1]=sheet.crop(64,0,64,48);
        worm_down[2]=sheet.crop(64*2,0,64,48);
        
        worm_left[0]=sheet.crop(0,48,64,48);
        worm_left[1]=sheet.crop(64,48,64,48);
        worm_left[2]=sheet.crop(64*2,48,64,48);
        
        worm_right[0]=sheet.crop(0,48*2,64,48);
        worm_right[1]=sheet.crop(64,48*2,64,48);
        worm_right[2]=sheet.crop(64*2,48*2,64,48);
        
        worm_up[0]=sheet.crop(0,48*3,64,48);
        worm_up[1]=sheet.crop(64,48*3,64,48);
        worm_up[2]=sheet.crop(64*2,48*3,64,48);
        
        sheet = new spritesheet(ImageLoader.loadimg("/character/sabertooth.png"));
//        player_right[3]=sheet.crop(p_width*15,0,p_width,p_height);

        sabertooth_down[0]=sheet.crop(59*6,58,58,58);
        sabertooth_down[1]=sheet.crop(59*7,58,58,58);
        sabertooth_down[2]=sheet.crop(59*6,58,58,58);
        
        sabertooth_right[0]=sheet.crop(0,58,57,58);
        sabertooth_right[1]=sheet.crop(58,58,57,58);
        sabertooth_right[2]=sheet.crop(58*2,58,57,58);
        
        sabertooth_left[0]=sheet.crop(58*3,58,57,58);
        sabertooth_left[1]=sheet.crop(58*4,58,57,58);
        sabertooth_left[2]=sheet.crop(58*5,58,57,58);
        
        sabertooth_up[0]=sheet.crop(58*8,58,58,58);
        sabertooth_up[1]=sheet.crop(58*9,58,58,58);
        sabertooth_up[2]=sheet.crop(58*8,58,58,58);
       
        sabertooth_attdown[0]=sheet.crop(59*6,0,58,58);
        sabertooth_attdown[1]=sheet.crop(59*7,0,58,58);
        sabertooth_attdown[2]=sheet.crop(59*6,0,58,58);
        
        sabertooth_attright[0]=sheet.crop(0,0,57,58);
        sabertooth_attright[1]=sheet.crop(58,0,57,58);
        sabertooth_attright[2]=sheet.crop(58*2,0,57,58);
        
        sabertooth_attleft[0]=sheet.crop(58*3,0,57,58);
        sabertooth_attleft[1]=sheet.crop(58*4,0,57,58);
        sabertooth_attleft[2]=sheet.crop(58*5,0,57,58);
        
        sabertooth_attup[0]=sheet.crop(58*8,0,58,58);
        sabertooth_attup[1]=sheet.crop(58*9,0,58,58);
        sabertooth_attup[2]=sheet.crop(58*8,0,58,58);

        //hp bar
        sheet = new spritesheet(ImageLoader.loadimg("/Textures/hpbar.png"));
        hpbar[0]=sheet.crop(0,0,238,38);
        hpbar[1]=sheet.crop(0,38,238,38);
        hpbar[2]=sheet.crop(0,38*2,238,38);
        hpbar[3]=sheet.crop(0,38*3,238,38);
        hpbar[4]=sheet.crop(0,38*4,238,38);
        hpbar[5]=sheet.crop(0,38*5,238,38);
        
        sheet = new spritesheet(ImageLoader.loadimg("/Textures/mpbar.png"));
        mpbar[0]=sheet.crop(0,0,238,38);
        mpbar[1]=sheet.crop(0,38,238,38);
        mpbar[2]=sheet.crop(0,38*2,238,38);
        mpbar[3]=sheet.crop(0,38*3,238,38);
        mpbar[4]=sheet.crop(0,38*4,238,38);
        mpbar[5]=sheet.crop(0,38*5,238,38);
       
        sheet = new spritesheet(ImageLoader.loadimg("/Textures/expbar.png"));
        expbar[0]=sheet.crop(0,0,238,38);
        expbar[1]=sheet.crop(0,38,238,38);
        expbar[2]=sheet.crop(0,38*2,238,38);
        expbar[3]=sheet.crop(0,38*3,238,38);
        expbar[4]=sheet.crop(0,38*4,238,38);
        expbar[5]=sheet.crop(0,38*5,238,38);
        
        
        //shop
        tableshop=ImageLoader.loadimg("/Textures/tableshop.png");
        shopkeeper=ImageLoader.loadimg("/character/shopkeeper.png");
        
        //home
        inventory = ImageLoader.loadimg("/Textures/inventory.png");
        dirt = ImageLoader.loadimg("/Textures/dirt.png");
        darkdirt = ImageLoader.loadimg("/Textures/darkdirt.jpg");
        brick = ImageLoader.loadimg("/Textures/brick.jpg");
        tree = ImageLoader.loadimg("/Textures/tree.png");
        floor=ImageLoader.loadimg("/Textures/floor.jpg");
        bushver=ImageLoader.loadimg("/Textures/bushver.png");
        floor2=ImageLoader.loadimg("/Textures/floor2.jpg");
        rock=ImageLoader.loadimg("/Textures/rock.png");
        craft=ImageLoader.loadimg("/Textures/craft.png");
        bed=ImageLoader.loadimg("/Textures/bed.png");
        shop=ImageLoader.loadimg("/Textures/shophouse.png");
        shoplist=ImageLoader.loadimg("/Textures/shoplist.png");
        craftlist=ImageLoader.loadimg("/Textures/craftlist.png");
        chest=ImageLoader.loadimg("/Textures/chest.png");
        portal=ImageLoader.loadimg("/Textures/portal.png");
        bushor=ImageLoader.loadimg("/Textures/bushor.png");
        bushorend=ImageLoader.loadimg("/Textures/bushorend.png");
        table=ImageLoader.loadimg("/Textures/table.png");
        dialog=ImageLoader.loadimg("/Textures/dialog.png");
        pause=ImageLoader.loadimg("/Textures/menu.png");
        statistic=ImageLoader.loadimg("/Textures/statistic.png");
        stage=ImageLoader.loadimg("/Textures/stage.png");
        wincondition=ImageLoader.loadimg("/Textures/wincondition.png");
        house=ImageLoader.loadimg("/Textures/house.png");
        sidetree=ImageLoader.loadimg("/Textures/sidetree.png");
        
        
        fence[0]=ImageLoader.loadimg("/Textures/fence.png");
        fence[1]=ImageLoader.loadimg("/Textures/fence1.png");
        fence[2]=ImageLoader.loadimg("/Textures/fence2.png");
        
        sidefence=ImageLoader.loadimg("/Textures/sidefence.png");

        wall[0]=ImageLoader.loadimg("/Textures/wall.png");
        wall[4]=ImageLoader.loadimg("/Textures/wall1.png");
        wall[1]=ImageLoader.loadimg("/Textures/sidewall.png");
        wall[2]=ImageLoader.loadimg("/Textures/sidewall2.png");
        wall[3]=ImageLoader.loadimg("/Textures/wallbot.png");
        
        cornerhome[0]=ImageLoader.loadimg("/Textures/homecorner1.png");
        cornerhome[1]=ImageLoader.loadimg("/Textures/homecorner2.png");
        cornerhome[2]=ImageLoader.loadimg("/Textures/homecorner3.png");
        cornerhome[3]=ImageLoader.loadimg("/Textures/homecorner4.png");
       
        //stage 1
        dungeon_floor[0]=ImageLoader.loadimg("/tilesdungeon/floor.png");
        dungeon_floor[1]=ImageLoader.loadimg("/tilesdungeon/floortop.png");
        dungeon_floor[2]=ImageLoader.loadimg("/tilesdungeon/floorright.png");
        dungeon_floor[3]=ImageLoader.loadimg("/tilesdungeon/floorbot.png");
        dungeon_floor[4]=ImageLoader.loadimg("/tilesdungeon/floorleft.png");

        sheet = new spritesheet(ImageLoader.loadimg("/tilesdungeon/spritesheet.png"));
        chest1=sheet.crop(0,0,32,32);
        box3=sheet.crop(32,0,32,32);
        torch=sheet.crop(32*2,0,32,32);
        barrel3=sheet.crop(32*3,0,32,32);
        box=sheet.crop(0,32,32,32);
        barrel=sheet.crop(32,32,32,32);
        
        blank=ImageLoader.loadimg("/tilesdungeon/blank.png");
        bridgever=ImageLoader.loadimg("/tilesdungeon/bridgever.png");
        bridgehor=ImageLoader.loadimg("/tilesdungeon/bridgehor.png");
        
        corner[0]=ImageLoader.loadimg("/tilesdungeon/corner1.png");
        corner[1]=ImageLoader.loadimg("/tilesdungeon/corner2.png");
        corner[2]=ImageLoader.loadimg("/tilesdungeon/corner3.png");
        corner[3]=ImageLoader.loadimg("/tilesdungeon/corner4.png");
        
        sheet = new spritesheet(ImageLoader.loadimg("/tilesdungeon/water.png"));
        water1[0]=sheet.crop(0,0,16,16);
        water1[1]=sheet.crop(16,0,16,16);
        water1[2]=sheet.crop(16*2,0,16,16);
        water1[3]=sheet.crop(16*3,0,16,16);
        water1[4]=sheet.crop(16*4,0,16,16);
        water1[5]=sheet.crop(16*5,0,16,16);
        water1[6]=sheet.crop(0,16,16,16);
        water1[7]=sheet.crop(16,16,16,16);
        water1[8]=sheet.crop(16*2,16,16,16);
        
        //stage 2
        sand=ImageLoader.loadimg("/desert/sand.jpg");
        sandrock=ImageLoader.loadimg("/desert/sandrock.jpg");
        cactus=ImageLoader.loadimg("/desert/cactus.png");
        sandrock2=ImageLoader.loadimg("/desert/srock.png");
        bananatree=ImageLoader.loadimg("/desert/bananatree.png");
        sidebeach=ImageLoader.loadimg("/desert/sidebeach.png");
        water=ImageLoader.loadimg("/desert/water.png");
        
        //stage 3
        lava=ImageLoader.loadimg("/volcanic/lava.png");
        lavarock1=ImageLoader.loadimg("/volcanic/lavarock1.png");
        lavarock2=ImageLoader.loadimg("/volcanic/lavarock2.png");
        redrock=ImageLoader.loadimg("/volcanic/lavarock.png");
        blackrock=ImageLoader.loadimg("/volcanic/rocklava.png");    
    }
    
    
    
}
