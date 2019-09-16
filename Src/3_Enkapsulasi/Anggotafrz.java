/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author FARIZ
 */
public class Anggotafrz {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggotafrz(String nama,String alamat){
        this.nama=nama;
        this.alamat=alamat;
        this.simpanan =0;
    }
   public void setNama(String nama){
       this.nama=nama;
   } 
   public String getNama(){
       return nama;
   }
   public String getalamat(){
       return alamat;
   }
   public void setAlamat(String alamat){
       this.alamat=alamat;
   }
   public float getSimpanan(){
       return simpanan;
   }
   public void setor(float uang){
    simpanan +=uang;   
   }
   public void pinjam(float uang){
       simpanan-=uang;
   }
}
