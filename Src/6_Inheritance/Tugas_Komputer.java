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
public class Tugas_Komputer {
     public String merk;    
     public int kecProsesor;    
     public int sizeMemory;    
     public String jnsProsesor;        
     public Tugas_Komputer(){           
     }   
     public Tugas_Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){        
         this.merk=merk;        this.kecProsesor=kecProsesor;       
         this.sizeMemory=sizeMemory;        
         this.jnsProsesor=jnsProsesor;   
     }    public void tampilData(){        
         System.out.println("Merk: "+ merk);        
         System.out.println("Jenis Prosesor: "+ jnsProsesor);       
         System.out.println("Keceapatan Prosesor: "+kecProsesor);       
         System.out.println("Size Memory: "+ sizeMemory);    }
}


