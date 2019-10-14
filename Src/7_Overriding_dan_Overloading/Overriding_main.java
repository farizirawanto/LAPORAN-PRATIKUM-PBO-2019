/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author FARIZ
 */
public class Overriding_main {
   public static void main(String[] args) {         
      Overriding_Manusia m = new Overriding_Manusia();         
       Overriding_Dosen dsn = new Overriding_Dosen();       
       Overriding_Mahasiswa mhs = new Overriding_Mahasiswa();                  
       m.Bernafas();         
       m.Makan();        
       System.out.println("===========");         
       dsn.Makan();         
       dsn.Lembur();         
       System.out.println("============");        
       mhs.Makan();         
       mhs.Tidur();               
       System.out.println("============");        
       m = mhs;         
       m.Makan();         
       m = dsn;        
       m.Makan();                       }  
}
