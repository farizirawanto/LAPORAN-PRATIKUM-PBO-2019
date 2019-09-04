/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author PC
 */
public class Sepeda1841720088Fariz {
    private String merek;
    private int kecepatan;
    private int gear;
    private int harga;
    private String warna;
    
    public void setMerek(String newValue) {
        merek = newValue;
    }
    
    public void posisiGear(int newValue) {
        gear = newValue;
    }
    
    public void tambahKecepatanFrz(int tambah){
        kecepatan = kecepatan + tambah;
    }
    
    public void kurangKecepatanFrz(int kurang){
        kecepatan = kecepatan - kurang;
    }
    
     public void setHargaFrz(int hargasepeda, int diskon){
         harga = hargasepeda - diskon;
    }
     
     public void setWarnaFrz(String newValue){
         warna = newValue;
     }
    
    public void cetakStatus(){
        System.out.println("Merek Sepeda : "+merek);
        System.out.println("Posisi Gear : "+gear);
        System.out.println("Kecepatan Sepeda: "+kecepatan+" km/h");
        System.out.println("Harga sepeda : Rp."+harga);
        System.out.println("Warna sepeda : "+warna);
    }    
}
