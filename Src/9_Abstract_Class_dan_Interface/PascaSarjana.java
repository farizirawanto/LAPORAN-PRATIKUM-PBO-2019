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
public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    
    public PascaSarjana(String nama)
    {
        super(nama);
    }
    @Override
    public void menjuaraiKompetisi()
    {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    
    @Override
    public void membuatPublikasiIlmiah()
    {
        System.out.println("saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

    @Override
    public void lulus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}