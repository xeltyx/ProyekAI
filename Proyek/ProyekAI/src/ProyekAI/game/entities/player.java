/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.entities;
import ProyekAI.game.gfx.animation;
import ProyekAI.game.gfx.assets;
import ProyekAI.game.gfx.text;
import ProyekAI.game.handler.handler;
import ProyekAI.game.item.item;
import ProyekAI.game.stat.Stat;
import ProyekAI.game.stat.weapon;
import ProyekAI.game.world.world;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;


public class player extends character{
    ArrayList<weapon> wep = new ArrayList<>();
    private boolean bhn=false;
    private boolean moneyminus=false;
    boolean statistic=false;
    boolean up=false;
    boolean down=false;
    boolean left=false;
    boolean right=false;
    int atktime=0;
    
    boolean atk=false;
    
    private static float xpl,ypl;

    int indexpoint[] = new int[5];
    
    int ckwep;
    
    
    Random rand = new Random();
    Stat s = new Stat();
    int clock=0;
    int anim=0;
    
    private animation anidown,aniup,anileft,aniright;
    private boolean activec=false;
    private boolean activewin=false;
    private boolean actives=false;
    private boolean dialog=false;
    float xp;
    float yp;

    int wepdmg=0;
    
    int selectedpoint=0;
    int maxhp;
    int maxmp;
    
    //stage
    boolean stage=false;
    private int stx=0,sty=0 , stwidth=1280,stheight=720;
    private int stcenterx=stx+171,stcentery=sty + stheight/2, stListSpacing=90;
    private int selectedstage=0;
    private String[] stagelist = new String[12];
    
    //inventory
    int inventoryshowmax=5;
    int inventoryshowmin=0;
    int indexshow=1;
    private boolean activeinv=false;
    
    private int invx=64,invy=48 , invwidth=512,invheight=384,invcenterx=invx+171,invcentery=invy + invheight/2+5,
                invListSpacing=30;
    private int selecteditem=0;
    
    //craft
    
    private int cx=0,cy=0 , cwidth=1280,cheight=720;
    private int ccenterx=cx+171,ccentery=cy + cheight/2+5 , cListSpacing=50;
    private int selectedcraft=0;
    
    //menu
    boolean activemenu=false;
    String tulisan[]= new String[3];
    private int mx=0,my=0 , mwidth=512,mheight=512;
    private int mcenterx=mx+171,mcentery=my + mheight/2, mListSpacing=90;
    private int selectedmenu=0;
    
    int hpindex=0;

    //shop
    
    int selecteditems=0;
    private int sx=0,sy=0 , swidth=1280,sheight=720;
    private int scenterx=sx+300,scentery=sy + sheight/2+5 , sListSpacing=50;
    
    public player(handler handler, float x, float y) {
        super(handler,x, y,character.def_width+20,character.def_height+20);
        unhurtable=false;
        self=true;

        bounds.x=32;
        bounds.y=32;
        bounds.width=16;
        bounds.height=48;
        
        anidown = new animation(300,assets.player_down);
        aniup = new animation(300,assets.player_up);
        anileft = new animation(300,assets.player_left);
        aniright = new animation(300,assets.player_right);

        tulisan[0]="resume";
        tulisan[1]="Statistic";
        tulisan[2]="ExitGame";
        
        for (int i = 0; i < 12; i++) {
            stagelist[i]="Stage " + (i+1);
        }
        
        
        //weapon list
        if(Stat.isAssassin())
        {
            wep.add(new weapon("beginner dagger",50,0));
        }
        else if(Stat.isGunner())
        {
            wep.add(new weapon("beginner gun",100,0));
        }
        else if(Stat.isPaladin())
        {
            wep.add(new weapon("beginner shield",20,100));
        }
        else if(Stat.isSwordman())
        {
             wep.add(new weapon("beginner sword",200,0));
        }
        else if(Stat.isWarlock())
        {
            wep.add(new weapon("beginner staff",100,0));
        }
        
        
        if(Stat.isAssassin())
        {
            health=100;
            mp=100;
            defense=10;
            damage=40;
            magicdmg=0;
            criticalrate=3;
            criticaldmg=20;

            vit=10;
            agility=20;
            magical=10;
            strength=10;
            dexterity=10;
            critical=20;
        }
        else if(Stat.isPaladin())
        {
            health=225;
            mp=100;
            defense=100;
            damage=20;
            magicdmg=20;
            criticalrate=3;
            criticaldmg=20;

            vit=20;
            agility=10;
            magical=10;
            strength=10;
            dexterity=20;
            critical=10;
        }
        else if(Stat.isGunner())
        {
            health=100;
            mp=100;
            defense=20;
            damage=70;
            magicdmg=20;
            criticalrate=3;
            criticaldmg=20;

            vit=10;
            agility=10;
            magical=10;
            strength=10;
            dexterity=20;
            critical=20;
        }
        else if(Stat.isSwordman())
        {
            health=100;
            mp=0;
            defense=40;
            damage=70;
            magicdmg=0;
            criticalrate=5;
            criticaldmg=20;

            vit=10;
            agility=10;
            magical=10;
            strength=20;
            dexterity=20;
            critical=15;
        }
        else if(Stat.isWarlock())
        {
            health=100;
            mp=100;
            defense=20;
            damage=40;
            magicdmg=70;
            criticalrate=0;
            criticaldmg=20;

            vit=10;
            agility=10;
            magical=20;
            strength=10;
            dexterity=20;
            critical=15;
        }
        
        maxhp=health;
        maxmp=mp;
                
    }
    
    private void in_out()
    {
        if(world.inhouse)
        {
            if(y==879 && x>=672 && y==879 && x<=783)
            {
                Stat.setHome(false);
                Stat.setIngame(true);
                world.inhouse=false;
            }
        }
        
        if(!world.inhouse)
        {
            if(y<=234 && y>=226 &&  x>=286 && x<=314 &&  handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
            {
                Stat.setHome(true);
                Stat.setIngame(false);
                world.inhouse=true;
            }
        }
        
        if(world.inshop)
        {
            if(y==495 && x>=288 && y==495 && x<=335)
            {
                Stat.setShop(false);
                Stat.setIngame(true);
                world.inshop=false;
            }
        }
        
        if(!world.inshop)
        {
            if(y>=255 && y<=266 &&  x>=844 && x<=880 &&  handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
            {
                Stat.setIngame(false);
                Stat.setShop(true);
                world.inshop=true;
            }
        }
    }
    
    @Override
    public void tick() {
        xpl=x;
        ypl=y;
        if(atk)
        {
            atktime++;
            if(atktime==10)
            {
                atk=false;
                atktime=0;
            }
        }
            
        if(!activemenu)
       {
           
            anidown.tick();
            aniup.tick();
            anileft.tick();
            aniright.tick();
            getinput();
            move();
            tickinv();
            crafttick();
            portaltick();
            shoptick();
       }
       win();
       in_out();
       handler.getGamecamera().center(this);
       menutick();
       attack();
       hpmplogic();
    }
    
    private void hpmplogic()
    {
        if(health>=maxhp)
            health=maxhp;
        if(mp>=maxmp)
            mp=maxmp;
    }
    
    private void attack()
    {
        Rectangle cb = getCollisionBounds(0,0);
        Rectangle ar = new Rectangle();
        int arsize=20;
        ar.width=arsize;
        ar.height=arsize;
        
        if(up && handler.getinput().KeyJustPressed(KeyEvent.VK_SPACE))
        {
            ar.x = cb.x + cb.width/2 - arsize;
            ar.y = cb.y -arsize;
            atk=true;
        }
        else if(down && handler.getinput().KeyJustPressed(KeyEvent.VK_SPACE))
        {
            ar.x = cb.x + cb.width/2 - arsize;
            ar.y = cb.y + cb.height;
            atk=true;
        }
        else if(left && handler.getinput().KeyJustPressed(KeyEvent.VK_SPACE))
        {
            ar.x = cb.x - arsize;
            ar.y = cb.y + cb.height/2 - arsize/2;
            atk=true;
        }
        else if(right && handler.getinput().KeyJustPressed(KeyEvent.VK_SPACE))
        {
            ar.x = cb.x + cb.width;
            ar.y = cb.y + cb.height/2 - arsize/2;
            atk=true;
        }
        
        
        for (Entity e : handler.getWorld().getEntitymanager().getEntities()) {
            if(e.equals(this))
                continue;
            if(e.getCollisionBounds(0, 0).intersects(ar))
            {
                e.hurtenemies(damage);
                return;
            }
        }
    }
    
    
    int tambahrock;
    int tambahwood;
    int tambahmoney;

    private void win()
    {
        if(Stat.isWin())
        {
            activewin=!activewin;
            if(!activewin)
                return;
            boolean addrock=true,addwood=true;
            Stat.setWin(false);
            tambahrock=rand.nextInt(10)+1;
            tambahwood=rand.nextInt(10)+1;
            tambahmoney=rand.nextInt(10000)+1000;
            money+=tambahmoney;

            for (int i = 0; i < item.size(); i++) {
                if(item.get(i).getNama().equals("rock"))
                {
                    item.get(i).setJumlah(item.get(i).getJumlah()+tambahrock);
                    addrock=false;
                }
                if(item.get(i).getNama().equals("wood"))
                {
                    item.get(i).setJumlah(item.get(i).getJumlah()+tambahwood);
                    addwood=false;
                }
            }
            
            if(addwood)
            {
                item.add(new item("wood",tambahwood,item.size(),false,false));
                addwood=false;
            }
            if(addrock)
            {
                item.add(new item("rock",tambahrock,item.size(),false,false));
                addrock=false;
            }
        }
    }
    
    private void winrender(Graphics g)
    {
        if(!activewin)
            return;

        g.drawImage(assets.wincondition,mx+100,my+100,mwidth,mheight,null);
        text.drawString(g,"rock : +"+tambahrock,stcenterx,stcentery-100, false, Color.black, assets.font28);
        text.drawString(g,"wood : +"+tambahwood,stcenterx,stcentery-50, false, Color.black, assets.font28);
        text.drawString(g,"money : +"+tambahmoney,stcenterx,stcentery, false, Color.black, assets.font28);
        text.drawString(g,"press Enter to continue",stcenterx,stcentery+100, false, Color.black, assets.font28);

        if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
        {
            Stat.setStage1(false);
            Stat.setStage2(false);
            Stat.setStage3(false);
            Stat.setStage4(false);
            Stat.setStage5(false);
            Stat.setIngame(true);
            activewin=false;
        }
    }
    
    private void getinput()
    {
        xm=0;
        ym=0;
       
        if(handler.getinput().up)
            ym=-speed;
        if(handler.getinput().down)
            ym= speed;
        if(handler.getinput().left)
            xm= -speed;
        if(handler.getinput().right)
            xm= speed;
        
    }

    private void menutick()
    {
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_ESCAPE))
        {
           activemenu=!activemenu;
        } 
        if(!activemenu)
        {
            return;
        }

        if(handler.getinput().KeyJustPressed(KeyEvent.VK_UP))
            selectedmenu--;
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_DOWN))
            selectedmenu++;
        
        if(selectedmenu<0)
            selectedmenu=0;
        else if(selectedmenu>=3)
            selectedmenu=2;
    }

    private void crafttick()
    {
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_Q) && x>=174 && x<=226 && y>=366 && y<=392 && world.inhouse)
        {
            activec=!activec;
        } 
        if(!activec)
        {
            return;
        }
        
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_UP))
            selectedcraft--;
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_DOWN))
            selectedcraft++;
        
        if(selectedcraft<0)
            selectedcraft=0;
        else if(selectedcraft>=listshop.size())
            selectedcraft=listshop.size();
    }
    
    private void shoptick()
    {
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_Q) && x>=206  && x<=280 && y>=395 && y<=402 && world.inshop)
        {
            actives=!actives;
        } 
        if(!actives)
        {
            return;
        }
        
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_UP))
            selecteditems--;
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_DOWN))
            selecteditems++;
        
        if(selecteditems<0)
            selecteditems=listshop.size()-1;
        else if(selecteditems>=listshop.size())
            selecteditems=0;
    }
    
    private void portaltick()
    {
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_Q) && x>=1000 && y>=900)
        {
            stage=!stage;
            if(!stage)
                return;
        }
        
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_LEFT))
            selectedstage--;
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_RIGHT))
            selectedstage++;
        
        if(selectedstage<0)
            selectedstage=0;
        if(selectedstage>11)
            selectedstage=11;
    }

    boolean hp1=true;
    boolean hp2=false;
    boolean hp3=false;
    boolean hp4=false;
    boolean hp5=false;
    boolean hp6=false;
    
    boolean mp1=true;
    boolean mp2=false;
    boolean mp3=false;
    boolean mp4=false;
    boolean mp5=false;
    boolean mp6=false;
    
    boolean exp1=true;
    boolean exp2=false;
    boolean exp3=false;
    boolean exp4=false;
    boolean exp5=false;
    boolean exp6=false;
    
    private void renderstatus(Graphics g)
    {
        if(health<=maxhp && health>maxhp/1.4)
        {
            hp1=true;
            hp2=false;
            hp3=false;
            hp4=false;
            hp5=false;
            hp6=false;
        }
        if(health<=maxhp/1.4)
        {
            hp1=false;
            hp2=true;
            hp3=false;
            hp4=false;
            hp5=false;
            hp6=false;
        }
        if(health<=maxhp/1.8)
        {
            hp1=false;
            hp2=false;
            hp3=true;
            hp4=false;
            hp5=false;
            hp6=false;
        }
        if(health<=maxhp/2.5)
        {
            hp1=false;
            hp2=false;
            hp3=false;
            hp4=true;
            hp5=false;
            hp6=false;
        }
        if(health<=maxhp/2.5)
        {
            hp1=false;
            hp2=false;
            hp3=false;
            hp4=false;
            hp5=false;
            hp6=true;
        }
        if(health<=0)
        {
            hp1=false;
            hp2=false;
            hp3=false;
            hp4=false;
            hp5=true;
            hp6=false;
        }
        
        if(mp<=maxmp && mp>maxmp/1.4)
        {
            mp1=true;
            mp2=false;
            mp3=false;
            mp4=false;
            mp5=false;
            mp6=false;
        }
        if(mp<=maxmp/1.4)
        {
            mp1=false;
            mp2=true;
            mp3=false;
            mp4=false;
            mp5=false;
            mp6=false;
        }
        if(mp<=maxmp/1.8)
        {
            mp1=false;
            mp2=false;
            mp3=true;
            mp4=false;
            mp5=false;
            mp6=false;
        }
        if(mp<=maxmp/2.5)
        {
            mp1=false;
            mp2=false;
            mp3=false;
            mp4=true;
            mp5=false;
            mp6=false;
        }
        if(mp<=maxmp/2.5)
        {
            mp1=false;
            mp2=false;
            mp3=false;
            mp4=false;
            mp5=false;
            mp6=true;
        }
        if(mp<=0)
        {
            mp1=false;
            mp2=false;
            mp3=false;
            mp4=false;
            mp5=true;
            mp6=false;
        }
        
        if(exp<=16)
        {
            exp1=false;
            exp2=false;
            exp3=false;
            exp4=false;
            exp5=true;
            exp6=false;
        }
        else if(exp<=34)
        {
            exp1=false;
            exp2=false;
            exp3=false;
            exp4=false;
            exp5=false;
            exp6=true;
        }
        else if(exp<=51)
        {
            exp1=false;
            exp2=false;
            exp3=false;
            exp4=true;
            exp5=false;
            exp6=false;
        }
        else if(exp<=68)
        {
            exp1=false;
            exp2=false;
            exp3=true;
            exp4=false;
            exp5=false;
            exp6=false;
        }
        else if(exp<=85)
        {
            exp1=false;
            exp2=true;
            exp3=false;
            exp4=false;
            exp5=false;
            exp6=false;
        }
        else if(exp<=100)
        {
            exp1=true;
            exp2=false;
            exp3=false;
            exp4=false;
            exp5=false;
            exp6=false;
        }
        
        if(hp1)
            g.drawImage(assets.hpbar[0],100-100,-10,200,50,null);
        if(hp2)
            g.drawImage(assets.hpbar[1],100-100,-10,200,50,null);
        if(hp3)
            g.drawImage(assets.hpbar[2],100-100,-5,200,50,null);
        if(hp4)
            g.drawImage(assets.hpbar[3],100-100,-3,200,50,null);
        if(hp5)
            g.drawImage(assets.hpbar[4],100-100,0,200,50,null);
        if(hp6)
            g.drawImage(assets.hpbar[5],100-100,-5,200,50,null);
        
        
        if(mp1)
            g.drawImage(assets.mpbar[0],105-100,0+40,200,50,null);
        if(mp2)
            g.drawImage(assets.mpbar[1],105-100,0+40,200,50,null);
        if(mp3)
            g.drawImage(assets.mpbar[2],105-100,-5+40,200,50,null);
        if(mp4)
            g.drawImage(assets.mpbar[3],105-100,-3+40,200,50,null);
        if(mp5)
            g.drawImage(assets.mpbar[4],105-100,0+40,200,50,null);
        if(mp6)
            g.drawImage(assets.mpbar[5],105,-5+40,200,50,null);
        
        if(exp1)
            g.drawImage(assets.expbar[0],-10,-10+650+25,1200,50,null);
        if(exp2)
            g.drawImage(assets.expbar[1],-10,-10+650+25,1200,50,null);
        if(exp3)
            g.drawImage(assets.expbar[2],-10,-5+650+25,1200,50,null);
        if(exp4)
            g.drawImage(assets.expbar[3],-10,-3+650+25,1200,50,null);
        if(exp5)
            g.drawImage(assets.expbar[4],-10,0+650+25,1200,50,null);
        if(exp6)
            g.drawImage(assets.expbar[5],-10,-5+650+25,1200,50,null);
        
        text.drawString(g,"Level:"+level,stcenterx,stcentery+327+25, false, Color.black, assets.font28);
        
    }
    
    private void renderstage(Graphics g)
    {
        int selectstage=0;
        boolean battle=false;
        int ctr=0;
        if(!stage)
            return;
                    
       g.drawImage(assets.stage,stx,sty,stwidth,stheight,null);
       
        
       
        for (int i = 0; i < 12; i++) {
            if(i<4)
            {
                if(selectedstage==i)
                {
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery-150, false, Color.red, assets.font28);
                    if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                    {
                        battle=true;
                        selectstage=i+1;
                    }
                }
                else
                {
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery-150, false, Color.black, assets.font28);
                }
                ctr++;
                if(ctr==4)
                    ctr=0;
            }
            else if(i<8)
            {
                if(selectedstage==i)
                {
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery+40, false, Color.red, assets.font28);
                    if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                    {
                        battle=true;
                        selectstage=i+1;
                    }
                }
                else
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery+40, false, Color.black, assets.font28);
                
                ctr++;
                if(ctr==4)
                    ctr=0;
            }
            else if(i<12)
            {
                if(selectedstage==i)
                {
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery+230, false, Color.red, assets.font28);
                    if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                    {
                        battle=true;
                        selectstage=i+1;
                    }
                }
                else
                    text.drawString(g,stagelist[i],(stcenterx+60) + ctr * 220,stcentery+230, false, Color.black, assets.font28);
                ctr++;
            }
        }
        
        for (int i = 1; i <= 12; i++) {
            if(battle && selectstage==i)
            {
                if(i==1)
                {
                    Stat.setStage1(true);
                    Stat.setStage2(false);
                    Stat.setStage3(false);
                }               
                else if(i==2)
                {
                    Stat.setStage2(true);
                    Stat.setStage1(false);
                    Stat.setStage3(false);
                }
                else if(i==3)
                {
                    Stat.setStage3(true);
                    Stat.setStage1(false);
                    Stat.setStage2(false);
                }
            }
        }
        
        
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_ESCAPE))
        {
            stage=false;
            activemenu=false;
        }
       
    }
    
    private void bahancraft(Graphics g)
    {
        if(!bhn)
        {
            return;
        }
    }
    
    
    
    private void craftrender(Graphics g)
    {
        boolean add=false;
        int counter=0;
        int ctr=0;
        if(!activec)
        {
            return;
        }
        
        g.drawImage(assets.craftlist,cx,cy,cwidth,cheight,null);
        
        for (int i = 0; i < listcraft.size(); i++) {
            if(i==selectedcraft)
            {
                text.drawString(g,"> " +listcraft.get(i).getNama()+ "< ", ccenterx+70, 
                ccentery + i * cListSpacing-200, false, Color.red, assets.font28);
                
                for (int j = 0; j < bahan.size(); j++) 
                {    
                    if(listcraft.get(selectedcraft).getId()==bahan.get(j).getId())
                    {
                        text.drawString(g," ~ "+bahan.get(j).getBahan() + "    x" + bahan.get(j).getJumlah(), ccenterx+500, 
                        ccentery+ctr * cListSpacing -200, false, Color.black, assets.font28);
                        ctr++;
                    }
                }
                
                if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                {
                    bhn=!bhn;
                    if(!bhn)
                    {
                        return;
                    }
                    for (int k = 0; k < bahan.size(); k++) {
                        if(bahan.get(k).getId()==listcraft.get(selectedcraft).getId())
                        {
                            counter++;
                        }
                    }

                    for (int a = 0; a < bahan.size(); a++) {
                        if(bahan.get(a).getId()==listcraft.get(selectedcraft).getId()){
                            for (int j = 0; j < item.size(); j++) {
                                if(bahan.get(a).getBahan().equalsIgnoreCase(item.get(j).getNama())){
                                    if(bahan.get(a).getJumlah()<=item.get(j).getJumlah())
                                    {
                                        counter--;
                                    }
                                }
                            }
                            for (int j = 0; j < item.size(); j++) {
                                if(bahan.get(a).getBahan().equalsIgnoreCase(item.get(j).getNama())){
                                    if(bahan.get(a).getJumlah()<=item.get(j).getJumlah() && counter==0)
                                    {
                                        item.get(j).setJumlah(item.get(j).getJumlah()-bahan.get(a).getJumlah());
                                        add=true;
                                    }
                                }
                            }
                        }
                    }
                    if(add)
                    {
                        boolean newarr=true;
                        for (int a = 0; a < item.size(); a++) {
                            if(item.get(a).getNama().equalsIgnoreCase(listcraft.get(selectedcraft).getNama()))
                            {
                                item.get(a).setJumlah(item.get(a).getJumlah()+1);
                                newarr=false;
                            }
                        }
                        if(newarr)
                        {
                            item.add(new item(listcraft.get(selectedcraft).getNama(),1,item.size(),listcraft.get(selectedcraft).isUse(),listcraft.get(selectedcraft).isEquip()));
                        }
                    }
                }
            }
            else
            {
                text.drawString(g,listcraft.get(i).getNama(), ccenterx, 
                ccentery + i * cListSpacing-200, false, Color.black, assets.font28);
            }
        }
    }
    
    public void menurender(Graphics g)
    {
        if(!activemenu)
        {
            return;
        }
        
        g.drawImage(assets.pause,mx+100,my+100,mwidth,mheight,null);
        for (int i = 0; i < 3; i++) {
            if(i==selectedmenu)
            {
                text.drawString(g,tulisan[i], mcenterx+100, 
                mcentery + i * mListSpacing+40, false, Color.red, assets.font28);
                if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER) && tulisan[i].equalsIgnoreCase("resume"))
                {
                    activemenu=false;
                }
                else if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER) && tulisan[i].equalsIgnoreCase("Statistic"))
                {
                    statistic=!statistic;
                    if(!statistic)
                    {
                        return;
                    }
                }
                else if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER) && tulisan[i].equalsIgnoreCase("ExitGame"))
                {
                    System.exit(1);
                }
            }
            else
            {
                text.drawString(g,tulisan[i], mcenterx+100, 
                mcentery + i * mListSpacing+40, false, Color.black, assets.font28);
            }
        }
    }
    
    public void statistic(Graphics g)
    {
        int ctrStrength=0;
        int ctrVit=0;
        int ctrAgi=0;
        int ctrMagical=0;
        int ctrDex=0;
        int ctrCrt=0;
        
        if(!statistic)
        {
            return;
        }
        
        activemenu=false;
        
        g.drawImage(assets.statistic,mx+100,my,mwidth+500,mheight+200,null);        
        g.drawImage(assets.player_down[anim],mx+200,my+100,mwidth-300,mheight-300,null);

        //stat
        text.drawString(g,"HP               : "+health+"/"+maxhp, mcenterx+50,mcentery+80, false, Color.white, assets.font28);
        text.drawString(g,"MP               : "+mp, mcenterx+50,mcentery+120, false, Color.white, assets.font28);
        text.drawString(g,"Damage           : "+damage + "(+" + wepdmg + ")", mcenterx+50,mcentery+160, false, Color.white, assets.font28);
        text.drawString(g,"Critical Damage  : "+criticaldmg, mcenterx+50,mcentery+200, false, Color.white, assets.font28);
        text.drawString(g,"Critical rate    : "+criticalrate+"0%", mcenterx+50,mcentery+240, false, Color.white, assets.font28);
        text.drawString(g,"Magic Damage     : "+magicdmg, mcenterx+50,mcentery+280, false, Color.white, assets.font28);
        text.drawString(g,"Defense          : "+defense, mcenterx+50,mcentery+320, false, Color.white, assets.font28);
        
        text.drawString(g,"Equipped : ", mcenterx+250,mcentery-100, false, Color.white, assets.font28);
        if(equip.equals(""))
            text.drawString(g,equip, mcenterx+220,mcentery-50, false, Color.white, assets.font28);
        else
            text.drawString(g,"["+equip+"]", mcenterx+220,mcentery-50, false, Color.white, assets.font28);
        
        text.drawString(g,"Strength   :  "+strength, mcenterx+530,mcentery, false, Color.black, assets.font28);
        text.drawString(g,"Vitality   :  "+vit, mcenterx+530,mcentery+50, false, Color.black, assets.font28);
        text.drawString(g,"Agility    :  "+agility, mcenterx+530,mcentery+100, false, Color.black, assets.font28);
        text.drawString(g,"Magical    :  "+magical, mcenterx+530,mcentery+150, false, Color.black, assets.font28);
        text.drawString(g,"Dexterity  :  "+dexterity, mcenterx+530,mcentery+200, false, Color.black, assets.font28);
        text.drawString(g,"Critical   :  "+critical, mcenterx+530,mcentery+250, false, Color.black, assets.font28);
        
        
        if(statpoint>0)
        {
            text.drawString(g, "====LEVEL UP====" , mcenterx+550,mcentery-50, false, Color.BLACK, assets.font29);
            
            text.drawString(g, "Stat Point: "+statpoint, mcenterx+580,mcentery+300, false, Color.BLACK, assets.font29);
            
            if(handler.getinput().KeyJustPressed(KeyEvent.VK_UP))
                selectedpoint--;
            if(handler.getinput().KeyJustPressed(KeyEvent.VK_DOWN))
                selectedpoint++;
            
            if(selectedpoint<0)
                selectedpoint=0;
            if(selectedpoint>5)
                selectedpoint=5;
            
            for (int i = 0; i < 6; i++) {
                if(i==selectedpoint)
                {
                    text.drawString(g, "[ + ]" , mcenterx+750,mcentery+ i * 50, false, Color.red, assets.font28);
                    if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                    {
                        if(selectedpoint==0)
                        {
                            strength++;
                            ctrStrength++;
                        }
                        else if(selectedpoint==1)
                        {
                            vit++;
                            ctrVit++;
                        }
                        else if(selectedpoint==2)
                        {
                            agility++;
                            ctrAgi++;
                        }
                        else if(selectedpoint==3)
                        {
                            magical++;
                            ctrMagical++;
                        }
                        else if(selectedpoint==4)
                        {
                            dexterity++;
                            ctrDex++;
                        }
                        else if(selectedpoint==5)
                        {
                            critical++;
                            ctrCrt++;
                        }
                            statpoint--;
                            
                        //penambahan stat point    
                        if(Stat.isAssassin())
                        {
                            if(ctrAgi>0)
                            {
                                damage+=agility*2;
                                ctrAgi--;
                            }
                            else if(ctrVit>0)
                            {
                                maxhp+=vit*2;
                                health=maxhp;
                                defense+=vit;
                                ctrVit--;
                            }
                            else if(ctrStrength>0)
                            {
                                damage+=strength/2;
                                ctrStrength--;
                            }
                            else if(ctrMagical>0)
                            {
                                mp+=magical*2;
                                magicdmg+=magical;
                                ctrMagical--;
                            }
                            else if(ctrDex>0)
                            {
                                damage+=dexterity;
                                ctrDex--;
                            }
                            else if(ctrCrt>0)
                            {
                                if(critical%20==0)
                                    criticalrate++;
                                if(criticalrate>10)
                                    criticalrate=10;
                                criticaldmg+=critical*2;
                                ctrCrt--;
                            }
                        }
                        if(Stat.isSwordman())
                        {
                            if(ctrAgi>0)
                            {
                                damage+=agility/2;
                                ctrAgi--;
                            }
                            else if(ctrVit>0)
                            {
                                maxhp+=vit*2;
                                health=maxhp;
                                defense=+vit;
                                ctrVit--;
                            }
                            else if(ctrStrength>0)
                            {
                                damage+=strength*2;
                                ctrStrength--;
                            }
                            else if(ctrMagical>0)
                            {
                                mp+=magical*2;
                                magicdmg+=magical;
                                ctrMagical--;
                            }
                            else if(ctrDex>0)
                            {
                                damage+=dexterity;
                                ctrDex--;
                            }
                            else if(ctrCrt>0)
                            {
                                if(critical%20==0)
                                    criticalrate++;
                                if(criticalrate>10)
                                    criticalrate=10;
                                criticaldmg+=critical;
                                ctrCrt--;
                            }
                        }
                        if(Stat.isGunner())
                        {
                            if(ctrAgi>0)
                            {
                                damage+=agility;
                                ctrAgi--;
                            }
                            else if(ctrVit>0)
                            {
                                maxhp+=vit*2;
                                health=maxhp;
                                defense+=vit;
                                ctrVit--;
                            }
                            else if(ctrStrength>0)
                            {
                                damage+=strength/2;
                                ctrStrength--;
                            }
                            else if(ctrMagical>0)
                            {
                                mp+=magical*2;
                                magicdmg+=magical;
                                ctrMagical--;
                            }
                            else if(ctrDex>0)
                            {
                                damage+=dexterity*2;
                                ctrDex--;
                            }
                            else if(ctrCrt>0)
                            {
                                if(critical%20==0)
                                    criticalrate++;
                                if(criticalrate>10)
                                    criticalrate=10;
                                criticaldmg+=critical;
                                ctrCrt--;
                            }
                        }
                        if(Stat.isPaladin())
                        {
                            if(ctrAgi>0)
                            {
                                damage+=agility/2;
                                ctrAgi--;
                            }
                            else if(ctrVit>0)
                            {
                                maxhp+=vit*2+100;
                                health=maxhp;
                                defense+=vit*2;
                                ctrVit--;
                            }
                            else if(ctrStrength>0)
                            {
                                damage+=strength;
                                ctrStrength--;
                            }
                            else if(ctrMagical>0)
                            {
                                mp+=magical*2;
                                magicdmg+=magical;
                                ctrMagical--;
                            }
                            else if(ctrDex>0)
                            {
                                damage+=dexterity/2;
                                ctrDex--;
                            }
                            else if(ctrCrt>0)
                            {
                                if(critical%20==0)
                                    criticalrate++;
                                if(criticalrate>10)
                                    criticalrate=10;
                                criticaldmg+=critical;
                                ctrCrt--;
                            }
                        }
                        if(Stat.isWarlock())
                        {
                            if(ctrAgi>0)
                            {
                                damage+=agility/2;
                                ctrAgi--;
                            }
                            else if(ctrVit>0)
                            {
                                maxhp+=vit*2;
                                health=maxhp;
                                defense+=vit;
                                ctrVit--;
                            }
                            else if(ctrStrength>0)
                            {
                                damage+=strength;
                                ctrStrength--;
                            }
                            else if(ctrMagical>0)
                            {
                                mp+=magical*2+100;
                                magicdmg+=magical*2;
                                ctrMagical--;
                            }
                            else if(ctrDex>0)
                            {
                                damage+=dexterity/2;
                                ctrDex--;
                            }
                            else if(ctrCrt>0)
                            {
                                if(critical%20==0)
                                    criticalrate++;
                                if(criticalrate>10)
                                    criticalrate=10;
                                criticaldmg+=critical;
                                ctrCrt--;
                            }
                        }
                        maxhp=health;
                        maxmp=mp;
                    }
                }
                else
                {
                    text.drawString(g, "[ + ]" , mcenterx+750,mcentery + i * 50, false, Color.black, assets.font28);
                }
            }
        }
        
        
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_ESCAPE))
        {
            statistic=false;
        }
        
        clock++;
        
        if(clock==5)
        {
            anim++;
            if(anim>3)
            {
                anim=0;
            }
        }
        
        if(clock==20)
        {
            clock=0;
        }
    }
    
    public void tickinv()
    {
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_E) && !dialog)
        {
            activeinv=!activeinv;
        } 
        if(!activeinv)
        {
            return;
        }

        if(handler.getinput().KeyJustPressed(KeyEvent.VK_UP))
            selecteditem--;
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_DOWN))
            selecteditem++;
        
        
        if(selecteditem<inventoryshowmin)
        {
            selecteditem=inventoryshowmin;
        }
        if(selecteditem>inventoryshowmax-1)
        {
            selecteditem=inventoryshowmax-1;
        }

    }

    
    public void renderinv(Graphics g)
    {
        try{
        int ctr=0;
        if(!activeinv)
        {
            return;
        }
        
        for (int i = 0; i < item.size(); i++) {
            if(item.get(i).getJumlah()==0)
            {
                item.remove(i);
            }
        }
        
        g.drawImage(assets.inventory,invx,invy,invwidth,invheight,null);

        for (int i = inventoryshowmin; i < item.size(); i++) {
            if(i<inventoryshowmax)
            {
                if(i==selecteditem)
                {
                    text.drawString(g,"> " +item.get(i).getNama() + "    x" + item.get(i).getJumlah() + "< ", invcenterx-50, 
                    invcentery + ctr * invListSpacing-10, false, Color.red, assets.font28);
                    if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER) && item.get(i).isEquip())
                    {
                        ckwep=i;
                        dialog=!dialog;
                        if(!dialog)
                        {
                            return;
                        }
                    }
                    else if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER) && item.get(i).isUse()){
                        if(item.get(i).getNama().equalsIgnoreCase("Potion L"))
                            health+=1000;
                        if(item.get(i).getNama().equalsIgnoreCase("Potion M"))
                            health+=500;
                        if(item.get(i).getNama().equalsIgnoreCase("Remedy L"))
                            mp+=300;
                        if(item.get(i).getNama().equalsIgnoreCase("Remedy M"))
                            mp+=100;
                        if(item.get(i).getNama().equalsIgnoreCase("Elixir L"))
                        {
                            health+=1000;
                            mp+=300;
                        }
                        if(item.get(i).getNama().equalsIgnoreCase("Elixir M")){
                            health+=500;
                            mp+=100;
                        }
                        item.get(i).setJumlah(item.get(i).getJumlah()-1);
                    }
                }
                else 
                {
                    text.drawString(g,item.get(i).getNama() + "    x" + item.get(i).getJumlah(), invcenterx-50, 
                    invcentery + ctr * invListSpacing-10,false, Color.black, assets.font28);
                }
            }
            
            ctr++;
        }
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_LEFT))
        {
            ctr=0;
            inventoryshowmin-=5;
            inventoryshowmax-=5;
            indexshow--;
            if(indexshow<1)
                indexshow=1;

            if(inventoryshowmin<=0)
                inventoryshowmin=0;
            if(inventoryshowmax<=5)
                inventoryshowmax=5;
        }
        if(handler.getinput().KeyJustPressed(KeyEvent.VK_RIGHT))
        {
            ctr=0;
            inventoryshowmax+=5;
            inventoryshowmin+=5;
            indexshow++;
            if(indexshow>item.size()/5)
                indexshow=item.size()/5+1;
            if(inventoryshowmax>=item.size())
                inventoryshowmax=item.size();
            if(inventoryshowmin>=item.size()-5)
                inventoryshowmin=item.size()-5;
            if(inventoryshowmin<=0)
                inventoryshowmin=0;
        }
        
        text.drawString(g,"$"+money + "", invcenterx-145, 
                invcentery+150,false, Color.black, assets.font28);
        
        text.drawString(g,">"+indexshow+"<", invcenterx+240, 
                invcentery+150,false, Color.red, assets.font28);
        }
        catch(ArrayIndexOutOfBoundsException e){}
    }
    
    private void equip_able(Graphics g)
    {
        boolean eq=false;
        if(!dialog)
        {
            return;
        }
        
        for (int i = 0; i < wep.size(); i++) {
            if(item.get(ckwep).getNama().equalsIgnoreCase(wep.get(i).getNama()))
            {
                eq=true;
                wepdmg=wep.get(i).getDamage();
                equip=wep.get(i).getNama();
            }
        }
        
        
        g.drawImage(assets.dialog,invx+100,invy+140,300,100,null);   
        if(eq)
            text.drawString(g,"Equipped", invcenterx,invcentery,false, Color.red, assets.font28);
        else
            text.drawString(g,"Wrong class", invcenterx,invcentery,false, Color.red, assets.font28);
        
    }
    
    public void koordinat(Graphics g)
    {
        text.drawString(g,"X:"+x, scenterx+800, scentery-325,false, Color.white, assets.font28);
        text.drawString(g,"Y:"+y, scenterx+800, scentery-325+50,false, Color.white, assets.font28);
    }
    
    public void shoprender(Graphics g)
    {
        if(!actives)
        {
            return;
        }
        
        g.drawImage(assets.shoplist,sx,sy,swidth,sheight,null);
        
        int len=listshop.size();
        if(len==0)
            return;
        
        for (int i = -5; i < 6; i++) {
            if(selecteditems+i<0 || selecteditems+i>=len)
                continue;
            
            if(i==0)
            {
                boolean add=true;
                text.drawString(g,">" +listshop.get(selecteditems+i).getName() + "                                                         "
                + "           $" + listshop.get(selecteditems+i).getHarga() + "< ", scenterx, 
                scentery + i * sListSpacing, false, Color.red, assets.font28);
                if(handler.getinput().KeyJustPressed(KeyEvent.VK_ENTER))
                {      
                    
                    if(listshop.get(selecteditems+i).getHarga()<=money){
                        for (int j = 0; j < item.size(); j++) {
                            if(item.get(j).getNama().equals(listshop.get(selecteditems+i).getName())){
                                item.get(j).setJumlah(item.get(j).getJumlah()+1);
                                money-=listshop.get(selecteditems+i).getHarga();
                                add=false;
                            }
                        }
                        
                        if(add)
                        {
                            item.add(new item(listshop.get(selecteditems+i).getName(),1,item.size()+1,listshop.get(selecteditems+i).isUse(),listshop.get(selecteditems+i).isEquip()));
                            money-=listshop.get(selecteditems+i).getHarga();
                        }
                    }
                    else
                    {
                        moneyminus=!moneyminus;
                        if(!moneyminus)
                            return;
                    }
                    
                } 
            }
            else
            {
                text.drawString(g,listshop.get(selecteditems+i).getName() + "                                                         "
                + "           $" + listshop.get(selecteditems+i).getHarga(), scenterx, 
                scentery + i * sListSpacing,false, Color.black, assets.font28);
            }
        }
    }
    
    private void moneyminus(Graphics g)
    {
        if(!moneyminus)
            return;
        g.drawImage(assets.dialog,invx+400,invy+300,400,100,null);   
        text.drawString(g,"not enough money",invx+450,invy+350,false, Color.red, assets.font28);
    }
    
    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimation(),(int) (x - handler.getGamecamera().getX()),(int)(y-handler.getGamecamera().getY()), width,height,null);
    }
    
    
    
    public void postRender(Graphics g)
    {
        koordinat(g);
        winrender(g);
        renderstatus(g);
        craftrender(g);
        renderinv(g);
        shoprender(g);
        equip_able(g);
        bahancraft(g);
        moneyminus(g);
        menurender(g);
        statistic(g);
        renderstage(g);
    }
    
    private BufferedImage getCurrentAnimation(){
        
        if(atk)
        {
            if(right)
                return assets.player_atkright;
            else if(left)
                return assets.player_atkleft;
            else if(up)
                return assets.player_atkup;
            else if(down)
                return assets.player_atkdown;
        }
        
        if(handler.getinput().up)
        {
            up=true;
            down=false;
            left=false;
            right=false;
            return aniup.getCurrentFrame();
        }
        else if(handler.getinput().left)
        {
            up=false;
            down=false;
            left=true;
            right=false;
            return anileft.getCurrentFrame();
        }
        else if(handler.getinput().right)
        {
            up=false;
            down=false;
            left=false;
            right=true;
            return aniright.getCurrentFrame();
        }
        else if(handler.getinput().down)
        {
            up=false;
            left=false;
            right=false;
            down=true;
            return anidown.getCurrentFrame();
        }
        else
        {
            if(up)
               return aniup.getCurrent();
            if(down)
               return anidown.getCurrent();
            if(left)
               return anileft.getCurrent();
            if(right)
               return aniright.getCurrent();
            else
               return anidown.getCurrent();
        }
    }

    
    
    @Override
    public void die() {
        Stat.setStage1(false);
        Stat.setIngame(true);
        Stat.setDie(true);
    }

    public static float getXpl() {
        return xpl;
    }

    public static float getYpl() {
        return ypl;
    }

    @Override
    public void gettinghurt() {
       
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getStatpoint() {
        return statpoint;
    }

    public void setStatpoint(int statpoint) {
        this.statpoint = statpoint;
    }

}
