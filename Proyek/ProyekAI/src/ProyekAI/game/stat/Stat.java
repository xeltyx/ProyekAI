/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.stat;

/**
 *
 * @author ASUS
 */
public class Stat {
    private static boolean tambah;
    private static boolean tambahplayer;
    
    private static boolean die,win;
    private static boolean stage1,stage2,stage3,stage4,stage5;
    private static int jumlahmusuh;
    private static int money,wood,rock;
    private static boolean mainmenu;
    private static boolean ingame;
    private static boolean home;
    private static boolean shop;
    
    private static boolean assassin;
    private static boolean gunner;
    private static boolean paladin;
    private static boolean warlock;
    private static boolean swordman;

    public static boolean isShop() {
        return shop;
    }

    public static void setShop(boolean shop) {
        Stat.shop = shop;
    }
    
    public static boolean isHome() {
        return home;
    }

    public static void setHome(boolean home) {
        Stat.home = home;
    }
    
    public static boolean isTambahplayer() {
        return tambahplayer;
    }

    public static void setTambahplayer(boolean tambahplayer) {
        Stat.tambahplayer = tambahplayer;
    }

    
    
    public static boolean isTambah() {
        return tambah;
    }

    public static void setTambah(boolean tambah) {
        Stat.tambah = tambah;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Stat.money = money;
    }

    public static int getWood() {
        return wood;
    }

    public static void setWood(int wood) {
        Stat.wood = wood;
    }

    public static int getRock() {
        return rock;
    }

    public static void setRock(int rock) {
        Stat.rock = rock;
    }

    
    
    public static int getJumlahmusuh() {
        return jumlahmusuh;
    }

    public static void setJumlahmusuh(int jumlahmusuh) {
        Stat.jumlahmusuh = jumlahmusuh;
    }
    
    public static boolean isDie() {
        return die;
    }

    public static void setDie(boolean die) {
        Stat.die = die;
    }

    public static boolean isWin() {
        return win;
    }

    public static void setWin(boolean win) {
        Stat.win = win;
    }
    
    public static boolean isStage1() {
        return stage1;
    }

    public static void setStage1(boolean stage1) {
        Stat.stage1 = stage1;
    }

    public static boolean isStage2() {
        return stage2;
    }

    public static void setStage2(boolean stage2) {
        Stat.stage2 = stage2;
    }

    public static boolean isStage3() {
        return stage3;
    }

    public static void setStage3(boolean stage3) {
        Stat.stage3 = stage3;
    }

    public static boolean isStage4() {
        return stage4;
    }

    public static void setStage4(boolean stage4) {
        Stat.stage4 = stage4;
    }

    public static boolean isStage5() {
        return stage5;
    }

    public static void setStage5(boolean stage5) {
        Stat.stage5 = stage5;
    }


    
    
    public static boolean isIngame() {
        return ingame;
    }

    public static void setIngame(boolean ingame) {
        Stat.ingame = ingame;
    }
    
    public static boolean isMainmenu() {
        return mainmenu;
    }

    public static void setMainmenu(boolean mainmenu) {
        Stat.mainmenu = mainmenu;
    }
    
    public static boolean isAssassin() {
        return assassin;
    }

    public static void setAssassin(boolean assassin) {
        Stat.assassin = assassin;
    }

    public static boolean isGunner() {
        return gunner;
    }

    public static void setGunner(boolean gunner) {
        Stat.gunner = gunner;
    }

    public static boolean isPaladin() {
        return paladin;
    }

    public static void setPaladin(boolean paladin) {
        Stat.paladin = paladin;
    }

    public static boolean isWarlock() {
        return warlock;
    }

    public static void setWarlock(boolean warlock) {
        Stat.warlock = warlock;
    }

    public static boolean isSwordman() {
        return swordman;
    }

    public static void setSwordman(boolean swordman) {
        Stat.swordman = swordman;
    }

    

    
    
    
}
