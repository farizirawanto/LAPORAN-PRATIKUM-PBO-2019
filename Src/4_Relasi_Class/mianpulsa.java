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
public class mianpulsa {
   public static void main(String[] args) {                  
       agen a = new agen(); 
        a.setNama("amii");        
        a.setNomorHp("0816152234423");         
        a.setSaldo(400000);        
        System.out.println(a.info());         
        System.out.println("==================");       
        Pembeli p = new Pembeli();       
        p.setNama("amylina");         
        p.setNomorHp("0812399800345");        
        p.setProvider("TKartru hatimu");        
        p.setNominal(100000);         
        System.out.println(p.info());       
        System.out.println("==================");         
        statustransaksi st = new statustransaksi();         
        st.setTglWaktu("25/09/2019 00:00 WIB");      
        st.setStatus("SUKSES");         
        st.setAgen(a);         
        st.setPembeli(p);        
        st.print();         
        System.out.println("==================");        
        System.out.println("Info Saldo");       
        int sisah;         
        sisah = a.getSaldo()-p.getNominal();        
        System.out.println("Saldo Sekarang  :"+sisah);     }  
}
