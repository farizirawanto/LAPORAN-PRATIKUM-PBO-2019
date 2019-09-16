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
public class Motorfrz {
    public int kecepatan=0;
    public boolean kontakon=false;
    
    public void printStatus(){
        if(kontakon==true){
            System.out.println("Kontak on");
        }else{
            System.out.println("kontak off");
        }
        System.out.println("Keceptan"+kecepatan+"/n");
    }
  
}
