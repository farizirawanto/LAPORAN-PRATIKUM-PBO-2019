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
public class P6_karyawan {
     public String nama;
    public String alamat;
    public int umur;
    public String jk;
    public int gaji;

    public P6_karyawan() {
    }

    public P6_karyawan(String nama, String alamat, int umur, String jk, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }
    
    public void tampilDatakaryawan(){
        System.out.println("Nama            = "+nama);
        System.out.println("Alamat          = "+alamat);
        System.out.println("Umur            = "+umur);
        System.out.println("Jenis kelamin   = "+jk);
        System.out.println("Gaji            = "+gaji);
    }
}
