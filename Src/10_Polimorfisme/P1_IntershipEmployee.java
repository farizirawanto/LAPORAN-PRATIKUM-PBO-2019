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
public class P1_IntershipEmployee extends P1_Employee {
     private int length;
    
    public P1_IntershipEmployee(String name, int length){
        this.length = length;
        this.nama = name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
     @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
