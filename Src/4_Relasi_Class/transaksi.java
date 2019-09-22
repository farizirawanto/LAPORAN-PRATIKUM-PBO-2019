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
public class transaksi {
      private Pembeli pembeli;    
      private int biaya;         
      transaksi(){           
      }         
      public void setPembeli(Pembeli pembeli){         
          this.pembeli = pembeli;     }    
      public Pembeli getPembeli(){         
          return pembeli;     }    
      public void setBiaya(int biaya){         
          this.biaya = biaya;     }    
      public int getBiaya(){         
          return biaya;     }     
      public void print() {          
          System.out.println("Pembeli : \n"+ pembeli.info());          
          System.out.println("Biaya  : \n"+ biaya);     }
} 


