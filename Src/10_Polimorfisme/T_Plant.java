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
public class T_Plant {
      public void doDestroy (T_Destroyable d){
        if (d instanceof T_Walkingzombie){
            T_Walkingzombie wz = (T_Walkingzombie) d;
            wz.destroyed();
        }else if (d instanceof T_Jumpingzombie){
            T_Jumpingzombie jz = (T_Jumpingzombie) d;
            jz.destroyed();
        }else if (d instanceof T_Barrier){
            T_Barrier b = (T_Barrier) d;
            b.destroyed();
        }
    }
}
