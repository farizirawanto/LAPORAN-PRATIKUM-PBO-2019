/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author FARIZ
 */
public class TestBarang1841720088frz {
    public static void main(String []args){
        Barangfrz1841720088 brg1=new Barangfrz1841720088();
        brg1.namaBrg="pensil";
        brg1.jnsBrg="ATK";
        brg1.Stok=20;
        brg1.tampilBarangfrz();
        System.out.println("stokbaru adlah"+brg1.tambahStokfrz(20));
    }
}
