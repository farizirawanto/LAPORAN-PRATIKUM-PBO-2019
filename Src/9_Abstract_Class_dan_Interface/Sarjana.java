/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author User
 */
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    
    public Sarjana(String nama)
    {
        super(nama);
    }
    @Override
    public void lulus()
    {
        System.out.println("Aku sudah menyelesaikan skripsi");
    }
    
    @Override
    public void meraihIPKTinggi()
    {
        System.out.println("IPK-ku dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
       System.out.println("saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
