/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;

/**
 *
 * @author FARIZ
 */
public class Tugas_Windows extends Tugas_Laptop {
      public String fitur;       
      public Tugas_Windows(){          
      }    
      public Tugas_Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){        super( merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);      
      this.fitur=fitur;    
      }   
      public void tampilWindows(){    
          System.out.println("===========Windows============");       
          super.tampilLaptop();       
          System.out.println("Fitur   : "+fitur);    } 
}
