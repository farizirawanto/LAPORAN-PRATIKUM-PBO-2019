/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author w33.haa
 */
public class Tester4 {
     public static void main(String[] args) {
        P4_Owner ow = new P4_Owner();
        P1_ElectricityBill eBill = new P1_ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("------------------------------");

        P1_PermanentEmployee pEmp = new P1_PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("------------------------------");

        P1_IntershipEmployee iEmp = new P1_IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("------------------------------");
        ow.showMyEmployee(iEmp);
    }
}
