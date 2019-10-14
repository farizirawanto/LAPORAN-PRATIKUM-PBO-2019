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
public class Overloading_main {
     public static void main(String[] args) {         
         Overloading_Segitiga segi = new Overloading_Segitiga();         
         segi.totalSudut(110);         
         segi.totalSudut(30, 30);       
         segi.keliling(2, 3, 4);         
         segi.keliling(3, 4);         
         System.out.println("Total sudut : " + segi.totalSudut(120));         
         System.out.println("Total sudut : " + segi.totalSudut(30, 45));        
         System.out.println("Keliling : " + segi.keliling(4, 5, 6));        
         System.out.println("Keliling : " + segi.keliling(6, 7)); 

 
 
} 
}
