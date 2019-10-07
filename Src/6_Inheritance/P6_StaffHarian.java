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
public class P6_StaffHarian extends P6_Staff{
    public int jmlJamKerja;

    public P6_StaffHarian() {
    }

    public P6_StaffHarian(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffharian(){
        System.out.println("=============================Data Staff Harian====================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam kerja = "+jmlJamKerja);
        System.out.println("Gaji Bersih      = "+(gaji+jmlJamKerja+lembur-potongan));
    }
}
