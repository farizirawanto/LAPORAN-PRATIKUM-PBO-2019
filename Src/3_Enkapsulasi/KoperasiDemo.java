/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author FARIZ
 */
public class KoperasiDemo {
    public static void main(String []args){
        Anggotafrz anggota1=new Anggotafrz("Mochamad Fariz","jalan bandung");
        System.out.println("Simpanan"+anggota1.getNama()+"Rp="+anggota1.getSimpanan());
       
        anggota1.setNama("Mochamad Fariz I");
        anggota1.setAlamat("Jalan Bandung");
        anggota1.setor(10000);
        System.out.println("Simpanan"+anggota1.getNama()+"Rp="+anggota1.getSimpanan());
    }
}
