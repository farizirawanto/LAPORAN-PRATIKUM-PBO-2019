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
public class statustransaksi {
     private agen agen;     
     private Pembeli pembeli;    
     private String tglWaktu;    
     private String status; 
 
    statustransaksi() {    
    }     
    public void setAgen(agen agen){        
        this.agen = agen;     }    
    public agen getAgen(){        
        return agen;     }    
    public void setPembeli(Pembeli pembeli){       
        this.pembeli = pembeli;     }   
    public void setTglWaktu(String tglWaktu){        
        this.tglWaktu = tglWaktu;     }     
    public String getTglWaktu(){         
        return tglWaktu;     }    
    public void setStatus(String status){        
        this.status = status;     } 
 
    public void print(){        
        System.out.println("Pengirim:"+agen.getNama());      
        System.out.println("Nomor Pengirim  :"+agen.getNomorHp());      
        System.out.println("-------------------");       
        System.out.println(""+pembeli.info());        
        System.out.println("Tgl/Waktu       :"+tglWaktu);       
        System.out.println("Status          :"+status);     }      
}

