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
public class bahancraft{
    int id;
    String bahan;
    int jumlah;

    public bahancraft(int id,String bahan,int jumlah) {
        this.id=id;
        this.bahan=bahan;
        this.jumlah=jumlah;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
}
