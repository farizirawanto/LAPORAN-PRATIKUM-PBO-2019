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
public class Tugas_PC extends Tugas_Komputer {
      public int ukuranMonitor;        
      public Tugas_PC(){         
      }   
      public Tugas_PC ( String merk, int sizeMemory, int kecProsesor, String jnsProsesor, int ukuranMonitor){  
          super(merk, kecProsesor, sizeMemory,jnsProsesor);     
          this.ukuranMonitor=ukuranMonitor;   
      }   
      public void tampilPc(){       
          this.tampilData();       
          System.out.println("Ukuran Motor : "+ukuranMonitor);    } 
}
