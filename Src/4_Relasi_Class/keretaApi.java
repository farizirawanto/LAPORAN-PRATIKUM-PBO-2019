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
public class keretaApi {
    private String nama;   
    private String kelas;   
    private Pegawai masinis; 
    private Pegawai asisten; 
 
    public keretaApi(String nama, String kelas, Pegawai masinis) {   
        this.nama = nama;        
        this.kelas = kelas;    
        this.masinis = masinis;   
    } 
    public keretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {      
        this.nama = nama;     
        this.kelas = kelas;    
        this.masinis = masinis;   
        this.asisten = asisten;    
    }
    public void setNama(String nama) {      
        this.nama = nama;     
    } 
    public String getNama() {  
        return nama;     
    } 
    public void setKelas(String kelas) {    
        this.kelas = kelas;    
    } 
    public String getKelas() { 
        return kelas;     
    } 
    public void setMasinis(Pegawai masinis) {    
        this.masinis = masinis;    
    } 
    public Pegawai getMasinis() {   
        return masinis;     
    } 
    public void setAsisten(Pegawai asisten) {       
        this.asisten = asisten;     
    } 
    public Pegawai getAsisten() {    
        return asisten; 
    }    
    public String info(){    
        String info = "";    
        info += "Nama: " + this.nama + "\n";   
        info += "Kelas: " + this.kelas + "\n";  
        info += "Masinis: " + this.masinis.info() + "\n";    
        if (asisten!=null){
        info += "Asisten: " + this.asisten.info() + "\n";     
    } 
        return info;     
}
}
