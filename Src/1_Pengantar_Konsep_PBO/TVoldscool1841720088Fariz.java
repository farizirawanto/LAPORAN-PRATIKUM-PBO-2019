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
public class TVoldscool1841720088Fariz {
  public static void main(String []args){
    
    TV1841720088Fariz tv=new TV1841720088Fariz();
   TV1841720088Fariz tv1=new TV1841720088Fariz();
    TV1841720088Fariz tv2=new TV1841720088Fariz();
    
    //tv1
    tv.setNameFariz("LG");
    tv.sizeInchFariz(78);
    tv.prizepoolFariz(4000000);
    tv.typeSoundFariz("ssound");
    tv.bentukLayarFAriz("ultraHD");
    
    //tv2
     tv1.setNameFariz("OG");
    tv1.sizeInchFariz(99);
    tv1.prizepoolFariz(10000000);
    tv1.typeSoundFariz("ssound");
    tv1.bentukLayarFAriz("ultraHD");

    //tv
    tv2.setNameFariz("Liquid");
    tv2.sizeInchFariz(80);
    tv2.prizepoolFariz(9000000);
    tv2.typeSoundFariz("ssound");
    tv2.bentukLayarFAriz("ultraHD");
    
    
    //cetak status
    tv.cetakStatus();
    System.out.println(" ");
    tv1.cetakStatus();
      System.out.println(" ");
    tv2.cetakStatus();
      System.out.println(" ");
  }
  
 
   

    
}
