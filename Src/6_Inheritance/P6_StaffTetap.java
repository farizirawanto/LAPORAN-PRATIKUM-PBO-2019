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
public class P6_StaffTetap extends P6_Staff {
      public String golongan;
    public int asuransi;

    public P6_StaffTetap() {
    }

    public P6_StaffTetap(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetap(){
        System.out.println("=================== Data Staff Tetap ======================");
        super.tampilDataStaff();
        System.out.println("Golongan        = "+golongan);
        System.out.println("Jumlah Asuransi = "+asuransi);
        System.out.println("Gaji Bersih     = "+(gaji+lembur-potongan-asuransi));
        
    }
}
