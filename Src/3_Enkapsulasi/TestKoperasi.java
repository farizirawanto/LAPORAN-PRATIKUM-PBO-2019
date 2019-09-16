/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author FARIZ
 */import java.util.Scanner;
public class TestKoperasi {
     public static void main(String[] args){   
            Scanner sc = new Scanner(System.in); 
        AnggotaFariz Fariz = new AnggotaFariz("Fariz", "1162734", 5000000);         
        System.out.println("Nama Anggota: " + Fariz.getNama());        
        System.out.println("Limit Pinjaman: " + Fariz.getLimitPeminjaman());        
        System.out.println("\nMeminjam uang 10.000.000...");        
        Fariz.pinjam(10000000);         
        System.out.println("Jumlah pinjaman saat ini: " + Fariz.getJumlahPinjaman()); 
        System.out.println("\nMeminjam uang 4.000.000...");         
        Fariz.pinjam(4000000);         
        System.out.println("Jumlah pinjaman saat ini: " + Fariz.getJumlahPinjaman());         
        System.out.println("\nMembayar angsuran 1.000.000");        
        Fariz.angsur(10000);        
        System.out.println("Jumlah pinjaman saat ini: " + Fariz.getJumlahPinjaman());        
        System.out.println("\nMembayar angsuran 3.000.000");  
        Fariz.angsur(3000000);       
        System.out.println("Jumlah pinjaman saat ini: " + Fariz.getJumlahPinjaman());     
  
     System.out.print("Masukkan Angsuran : ");         
     int a2 = sc.nextInt();         
     Fariz.angsur(a2);         
     System.out.println("Membayar angsuran"+a2); 
}
}
