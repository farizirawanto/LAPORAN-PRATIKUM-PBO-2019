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
public class Tester2 {
     public static void main(String[] args){
         P1_PermanentEmployee Emp = new P1_PermanentEmployee("Dedik", 500);
         P1_Employee e;
         e = Emp;
         System.out.println(""+e.getEmployeeInfo());
         System.out.println("========================");
         System.out.println(""+Emp.getEmployeeInfo());
     }
}
