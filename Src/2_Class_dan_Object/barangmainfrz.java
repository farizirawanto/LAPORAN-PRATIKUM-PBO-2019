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
public class barangmainfrz {
   public static void main(String[] args){ 
       barangfrz brg = new barangfrz();
   
 
brg.kode="999"; 
brg.namaBarang="Kaos"; 
brg.hargaDasar=100000; 
brg.diskon=0.2f; 
brg.hitungHargaJual(100000, 0.2f); 
brg.tampilData();  
}
}