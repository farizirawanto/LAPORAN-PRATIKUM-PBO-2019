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
public class agen {
      private String nama;     
      private String nomorHp;     
      private int saldo;         
      agen(){             
      }   public void setNama(String nama){        
      this.nama = nama;     }    
      public String getNama(){         
          return nama;     }    
      public void setNomorHp(String nomorHp){        
          this.nomorHp = nomorHp;     }    
      public String getNomorHp(){        
          return nomorHp;     }    
      public void setSaldo(int saldo){        
          this.saldo = saldo;     }    
      public int getSaldo(){        
          return saldo;     } 
 
    public String info() {      
        String info = "";       
        info += "Nama agen    : " + nama + "\n";      
        info += "Nomor Hp     :" + nomorHp + "\n";      
        info += "Saldo        :" + saldo + "\n";          
        return info;    
    } 
}
