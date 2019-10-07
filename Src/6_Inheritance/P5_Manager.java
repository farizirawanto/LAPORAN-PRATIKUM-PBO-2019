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
public class P5_Manager extends P5_karyawan {
     public int tunjangan;

    public P5_Manager() {
        
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total gaji      = "+(super.gaji + tunjangan));
    } 
}
