/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author FARIZ
 */
public class percobaanmain2 {
    public static void main(String[] args) {
        Mobil m=new Mobil();
        m.setBiaya(350000);
        m.setMerk("BUGATI VERON");
        Sopir s=new Sopir();
        s.setNama("Mikasa");
        s.setBiaya(4000000);
      Pelanggan p =new Pelanggan();
      p.setNama("amii");
      p.setMobil(m);
      p.setSopir(s);
      p.setHari(5);
      
      
        System.out.println("Nama pelanggan= "+p.getNama());
        System.out.println("Nama mobil= "+m.getMerk());
        System.out.println("Biaya Mobil= "+m.getBiaya());
        System.out.println("Nama Sopir= "+s.getNama());
        System.out.println("Biaya sopir= "+s.getBiaya());
        System.out.println("Lama Hari= "+p.getHari());
        System.out.println("Biaya total= "+p.hitungBiayaTotal());
        
    }
}
