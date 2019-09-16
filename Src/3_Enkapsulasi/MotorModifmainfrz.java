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
public class MotorModifmainfrz {
    public static void main(String []args){
     MotorModif motor=new MotorModif();
     
     motor.printStatus();
     motor.tambahKecepatanfrz();
     System.out.println();
     motor.nyalaMesinfrz();
     motor.tambahKecepatanfrz();
     System.out.println();
     motor.tambahKecepatanfrz();
     motor.printStatus();
     System.out.println();
     motor.kurangiKecepatanfrz();
     motor.printStatus();
     System.out.println();
     motor.kurangiKecepatanfrz();
     motor.printStatus();
     System.out.println();
     motor.matikanMesinfrz();
     motor.printStatus();
}
}