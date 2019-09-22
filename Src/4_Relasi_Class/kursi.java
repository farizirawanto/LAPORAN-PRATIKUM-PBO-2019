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
public class kursi {
    private String nomer;
    private penumpang penumpang;

    kursi(String nomer) {
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String info() {
        String info = "";
        info += "Nomer: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
