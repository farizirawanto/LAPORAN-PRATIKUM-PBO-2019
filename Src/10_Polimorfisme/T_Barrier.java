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
public class T_Barrier implements T_Destroyable {
     private int strength;
    
    public T_Barrier (int strength){
        this.strength = strength;
    }
    public void setStrength (int strength){
        this.strength = strength;
    }
    public int getStrength (){
        return strength;
    } 
    public void destroy(){
        strength -= strength*0.1;
    }  
     @Override
    public void destroyed(){
        destroy();
    }
    public String getBarrierInfo(){
        return "Barrier Strength = "+strength+"\n";
    }
}

