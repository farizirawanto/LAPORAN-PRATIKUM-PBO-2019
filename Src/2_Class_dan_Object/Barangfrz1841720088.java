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
public class Barangfrz1841720088 {
    public String namaBrg;
    public String jnsBrg;
    public int Stok;

public void tampilBarangfrz(){
    System.out.println("nama barang:" +namaBrg);
    System.out.println("jr=enis barang:" +jnsBrg);
    System.out.println("Stok:" +Stok);
}
public int tambahStokfrz(int brgMasuk){
    int stokbaru=brgMasuk+Stok;
    return stokbaru;
}   
}
