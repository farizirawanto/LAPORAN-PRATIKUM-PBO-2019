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
public class Pembeli {
       private String nama;     
       private String nomorHp;     
       private String provider;     
       private int nominal; 
 
         Pembeli(){              
         }         
         public void setNama(String nama){         
             this.nama = nama;     }     
         public String getNama(){         
             return nama;     }     
         public void setNomorHp(String nomorHp){        
             this.nomorHp = nomorHp;     }     
         public String getNomorHp(){         
             return nomorHp;     }     
         public void setProvider(String provider){        
             this.provider = provider;     }     
         public String getProvider(){         
             return provider;     }    
         public void setNominal(int nominal){        
             this.nominal = nominal;     }    
         public int getNominal(){         
             return nominal;     }               
         public String info() {       
             String info = "";       
      info += "Nama Pembeli : " + nama + "\n"; 
      info += "Nomor Hp     :" + nomorHp + "\n";       
      info += "Provider     :" + provider + "\n";     
      info += "Nominal      :" + nominal + "\n";      
      return info;    
         } 
} 

