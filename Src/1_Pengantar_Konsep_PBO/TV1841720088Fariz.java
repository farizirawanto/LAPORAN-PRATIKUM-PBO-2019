/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FARIZ
 */
public class TV1841720088Fariz {
     private String merek;
    private int Inch;
    private String sound;
    private int harga;
    private String layar;

public void setNameFariz(String newValue){
    merek=newValue;
}
public void sizeInchFariz(int sizeinch){
    Inch=sizeinch;
}
public void typeSoundFariz(String values){
    sound=values;
}
public void prizepoolFariz(int prize){
    harga=prize;
}
public void bentukLayarFAriz(String bentuk){
    layar=bentuk;
}
public void cetakStatus(){
        System.out.println("Merek TV : "+merek);
        System.out.println("Posisi Inch : "+Inch+"inci");
        System.out.println("type sound: "+sound);
        System.out.println("TV price : Rp."+harga);
        System.out.println("tipe layar : "+layar);
    }
 






}
