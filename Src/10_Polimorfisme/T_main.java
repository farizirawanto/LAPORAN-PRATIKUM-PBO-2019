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
public class T_main {
    public static void main(String[] args) {
        T_Walkingzombie wz = new T_Walkingzombie(100,2);
        T_Jumpingzombie jz = new T_Jumpingzombie(100,2);
        T_Barrier b = new T_Barrier (100);
        T_Plant p = new T_Plant();
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    } 
}
