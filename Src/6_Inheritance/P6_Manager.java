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
public class P6_Manager extends P6_karyawan {
       public int tunjangan;

    public P6_Manager() {
        
    }
    
    public void tampilDataManager(){
        super.tampilDatakaryawan();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total gaji      = "+(super.gaji + tunjangan));
    } 
}
