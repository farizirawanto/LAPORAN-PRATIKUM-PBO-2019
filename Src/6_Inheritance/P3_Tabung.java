/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;

/**
 *
 * @author FARIZ
 */
public class P3_Tabung extends P3_Bangun{
    protected int t;
    
   public void setSuperPhi(double phi){
       super.phi=phi;
   }
   public void setSuperR(int r){
       this.r=r;
   }
   public void setT(int t){
       this.t=t;
   }
   public void volume(){
       System.out.println("Volumetabung adalah: "+(super.phi*super.r*super.r*t));
   }
}
