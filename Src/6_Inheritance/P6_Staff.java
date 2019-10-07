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
public class P6_Staff extends P6_karyawan {
   public int lembur;
    public int potongan;

    public P6_Staff() {
    }

    public P6_Staff(int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(nama, alamat, umur, jk, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDatakaryawan();
        System.out.println("lembur      = "+lembur);
        System.out.println("potongan    = "+potongan);
        System.out.println("Total gaji      = "+(gaji+lembur-potongan));

    }
}
