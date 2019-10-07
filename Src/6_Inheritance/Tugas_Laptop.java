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
public class Tugas_Laptop extends Tugas_Komputer{
     public String jnsBaterai;        
     public Tugas_Laptop(){            
     }   
     public Tugas_Laptop( String merk, int kecProsesor, int sizeMeory, String jnsPorsesor, String jnsBaterai){       
         super(merk, kecProsesor, sizeMeory, jnsPorsesor);        
         this.jnsBaterai=jnsBaterai;    }   
     public void tampilLaptop(){        
         this.tampilData();       
         System.out.println("Jenis Baterai : "+jnsBaterai);    }  
}
