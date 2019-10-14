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
public class Overriding_Mahasiswa extends Overriding_Manusia {
      public void Tidur(){         
          System.out.println("Mahasiswa butuh makan");    
      }      
      @Override
      public void Makan(){         
          System.out.println("Mahasiswa memenuhi energinya dengan cara makan");   
      }
}
