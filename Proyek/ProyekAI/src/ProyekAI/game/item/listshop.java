/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyekAI.game.item;

/**
 *
 * @author ASUS
 */
public class listshop {
    String name;
    int harga;
    boolean use,equip;

    public listshop(String name, int harga, boolean use, boolean equip) {
        this.name = name;
        this.harga = harga;
        this.use = use;
        this.equip = equip;
    }

    
    
    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public boolean isEquip() {
        return equip;
    }

    public void setEquip(boolean equip) {
        this.equip = equip;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
    
    
}
