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
public class Encapdemotestfariz {
      public static void main(String[] args) {         
      Encapsemofrz encap = new Encapsemofrz();
      Encapsemofrz encap1 = new Encapsemofrz(); 
      encap.setName("James");        
      encap.setAge(35);                  
      System.out.println("Name : "+ encap.getName());        
      System.out.println("Age : "+encap.getAge());     

      encap1.setName("fariz");        
      encap1.setAge(19);                  
      System.out.println("Name : "+ encap1.getName());        
      System.out.println("Age : "+encap1.getAge());  

} 
}




