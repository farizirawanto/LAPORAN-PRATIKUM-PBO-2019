/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author FARIZ
 */
public class Sopir {
 private  String nama;
  private int biaya;
  

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }
   
   public Sopir(){
       this.nama=nama;
       this.biaya=biaya;
   }
   public int hitungBiayaSopir(int hari){
       return biaya*hari;
   }
}
