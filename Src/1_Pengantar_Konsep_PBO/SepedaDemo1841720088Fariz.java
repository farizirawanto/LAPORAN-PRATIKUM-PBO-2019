/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author PC
 */
public class SepedaDemo1841720088Fariz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Buat 2 buah objek sepeda
        Sepeda1841720088Fariz spd1 = new Sepeda1841720088Fariz();
        Sepeda1841720088Fariz spd2 = new Sepeda1841720088Fariz();
        Sepeda1841720088Fariz spd3 = new Sepeda1841720088Fariz();
        //Terapkan method ke setiap sepeda
        
        //Sepeda 1
        spd1.setMerek("Polygon");
        spd1.posisiGear(2);
        spd1.tambahKecepatanFrz(20);
        spd1.setHargaFrz(5000000, 1000000);
        spd1.setWarnaFrz("Kuning");
        spd1.cetakStatus();
        
         //Sepeda 2
        spd2.setMerek("United");
        spd2.posisiGear(3);
        spd2.tambahKecepatanFrz(70);
        spd2.kurangKecepatanFrz(30);
        spd2.tambahKecepatanFrz(40);
        spd2.setHargaFrz(2000000, 200000);
        spd2.setWarnaFrz("Biru");
        spd2.cetakStatus();
        
        //Sepeda 3
        spd3.setMerek("NEW");
        spd3.posisiGear(4);
        spd3.tambahKecepatanFrz(20);
        spd3.tambahKecepatanFrz(10);
        spd3.tambahKecepatanFrz(30);
        spd3.kurangKecepatanFrz(20);
       
        spd3.setHargaFrz(3500000, 500000);
        spd3.setWarnaFrz("Merah");
        spd3.cetakStatus();
        
        

    
    }
    
}
