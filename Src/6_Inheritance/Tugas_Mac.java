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
public class Tugas_Mac extends Tugas_Laptop {
    public String security;       
    public Tugas_Mac(){          
    }    
    public Tugas_Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security){      
        super( merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);       
        this.security=security;    }    
    public void tampilMac(){      
        System.out.println("===========MAC============");       
        super.tampilLaptop();        
        System.out.println("Securituy   : "+security);    } 
}
