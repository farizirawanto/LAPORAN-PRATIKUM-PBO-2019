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
public class P4_Owner {
    public void pay(P1_Payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof P1_ElectricityBill){
           P1_ElectricityBill eb = (P1_ElectricityBill)p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof P1_PermanentEmployee){
            P1_PermanentEmployee pe = (P1_PermanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    
    public void showMyEmployee(P1_Employee e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof P1_PermanentEmployee)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
