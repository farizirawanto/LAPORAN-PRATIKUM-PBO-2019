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
public class Tester3 {
    public static void main(String[] args){
         P1_PermanentEmployee pEmp = new P1_PermanentEmployee("Dedik", 500);
         P1_IntershipEmployee iEmp = new P1_IntershipEmployee("Sunarto", 5);
         P1_ElectricityBill eBill = new P1_ElectricityBill(5, "A-1");
         P1_Employee e[] = {pEmp, iEmp};
         P1_Payable p[] = {pEmp, eBill};
       //  P1_Employee e2[] = {pEmp, iEmp, eBill};
    }
}
