/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author FARIZ
 */
public class barangfrz {
   public String kode; 
   public String namaBarang; 
   public int hargaDasar; 
   public float diskon; 
   public int hargaJual; 
 
public void hitungHargaJual(int hargaDasar, float diskon){ 
    hargaJual = (int) (hargaDasar - (diskon*hargaDasar));
} 

 
public void tampilData(){ 
 System.out.println("Kode Barang : "+kode);
 System.out.println("Nama Barang : "+namaBarang);
 System.out.println("Harga Dasar : "+"Rp. "+hargaDasar); 
 System.out.println("Diskon : "+diskon); 
 System.out.println("Harga Jual : "+"Rp. "+hargaJual); 
 
 
}
}
