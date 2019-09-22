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
public class MainPercobaan3 {
     public static void main(String[] args) {
        Pegawai masinis = new Pegawai ("1234","Spongebob Squarepants");  
        Pegawai asisten = new Pegawai ("4567","Patrick Star"); 
        keretaApi keretaApi = new keretaApi("Gaja Baru", "Bisnis", masinis, asisten);         
        System.out.println(keretaApi.info());     
    }
}
