/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author FARIZ
 */
public class Persewannfrz1841720088 {
 
 
      
       private String id;     
       private String namaMember;     
       private String namaGame;     
       private int lamaSewa;     
       private int hargaSewa;    
       private int totalBayar; 
 
    public void setIdfrz(String nilaiId) {  
        id = nilaiId;     }    
    public void setNamafrz(String nilaiNama) {                 
        namaMember = nilaiNama;     }          
    public void setGamefrz(String gem) {                
        namaGame = gem;     } 
    public void setLamafrz(int lamasewaa) {       
        lamaSewa = lamasewaa;     } 
 
    public int setHargafrz(int nilaiHarga) {                 
        hargaSewa = nilaiHarga;         
        return hargaSewa;     }   
    public int totalfrz() {                 
        totalBayar =  lamaSewa*hargaSewa;         
        return totalBayar;     } 
 
    public void tampilDatafrz() { 
                 System.out.println("ID : "+id);        
                 System.out.println("Nama Member : "+namaMember);         
                 System.out.println("Nama Game : "+namaGame);         
                 System.out.println("Lama Sewa : "+lamaSewa+" hari");          
                 System.out.println("Sewa harga per hari :Rp. "+hargaSewa);  
 
    } 
 
} 

 
