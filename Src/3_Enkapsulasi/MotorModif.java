/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author FARIZ
 */
public class MotorModif {
   private int kecepatan=0;
   private boolean kontakon=false;
   
   public void nyalaMesinfrz(){
       kontakon =true;
   }
   public void matikanMesinfrz(){
       kontakon=false;
       kecepatan=0;
   }
   public void tambahKecepatanfrz(){
       if(kontakon==true){
           kecepatan +=5;
       }
       else{
           System.out.println("Mesin masih mati anjing");
       }
   }
   public void kurangiKecepatanfrz(){
       if(kontakon==true){
           kecepatan -=5;
       }else{
           System.out.println("tidak bisa diurangi karena masih mati");
       }
   }
   
   public void printStatus(){
     if(kontakon==true){
       System.out.println("Kontak on");
    }else{
       System.out.println("kontak off");
        }
       System.out.println("Keceptan"+kecepatan+"/n");
    }
}
