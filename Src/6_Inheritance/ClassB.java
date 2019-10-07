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
public class ClassB extends ClassA{
    public int z;

    public void setZ(int z) {
        this.z = z;
    }

    
    public void getZ() {
        System.out.println("nilai z:"+z);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+(x+y+z));
    }
    
    public static void main(String[] args) {
        ClassB hitung=new ClassB();
            hitung.setX(20);
            hitung.setY(30);
            hitung.setZ(5);
            hitung.getNilai();
            hitung.getZ(); 
            hitung.getJumlah();
        
    }




}
