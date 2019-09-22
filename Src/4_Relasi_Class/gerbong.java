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
public class gerbong {
       private String kode;
    private kursi[] arrayKursi;
    
    gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new kursi[jumlah];
        this.initKursi();
    }
    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new kursi(String.valueOf(i + 1));
        }
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(penumpang penumpang, int nomer) {
        this.arrayKursi[nomer - 1].setPenumpang(penumpang);
    }
    public kursi[] getarrayKursi(){
        return arrayKursi;
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
