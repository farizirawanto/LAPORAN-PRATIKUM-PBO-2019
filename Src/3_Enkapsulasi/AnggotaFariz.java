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
public class AnggotaFariz {
   private String nama;     
   private final String ktp;    
   private float jumlahPinjaman;    
   private float limitPeminjaman;     
   public AnggotaFariz(String nama, String ktp, float limitPeminjaman){         
    this.nama = nama;         
    this.ktp = ktp;        
    this.limitPeminjaman = limitPeminjaman;         
    jumlahPinjaman = 0;     }    
   public String getKtp() {         
   return ktp;     }     
   public String getNama() {         
       return nama;     }     
   public float getLimitPeminjaman() {         
       return limitPeminjaman;     }     
   public float getJumlahPinjaman() {         
       return jumlahPinjaman; 
    }     public void pinjam(float uang){         
        if(uang>limitPeminjaman){            
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");         }
        else{             jumlahPinjaman += uang;         }     
    }     
     public void angsur(float uang){         
         if(uang>jumlahPinjaman*0.1){            
          jumlahPinjaman -= uang;         }
         else{  System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");         
         }
     }
}   


