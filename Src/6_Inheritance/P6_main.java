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
public class P6_main {
      public static void main(String[] args){
    
        P6_StaffTetap ST = new P6_StaffTetap("2A",2000000,20,250000,"Budi","Malang",20,"laki-Laki",1000);
       ST.tampilStaffTetap();
       
       P6_StaffHarian SH = new P6_StaffHarian(100,100000,50000,"Indah","Malang",27,"Perempuan",10000);
       SH.tampilStaffharian();
    }
}
