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
public class P5_Staff extends P5_karyawan{
   public int lembur, potongan;

    public P5_Staff() {
    }

    public P5_Staff(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur          = "+lembur);
        System.out.println("Potongan        = "+potongan);
        System.out.println("Total gaji      = "+(gaji+lembur-potongan));
    } 
}
