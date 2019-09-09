/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author FARIZ
 */
public class LIngkara1841720088frz {
 private double phi; private double r; private double luas; private double keliling; 
 
    public void setPhifrz(double nilaiPhi){       
        phi = nilaiPhi;     }    
    public void setJarifrz(double nilaiR){       
        r = nilaiR;      } 
    public double hitungLuasfrz(){          
        luas = phi*r*r;        
        return luas;     } 
 
    public double hitungKelilingfrz(){        
        keliling = 2*r*phi;         
        return keliling;     } 
    public void tampilData(){        
        System.out.println("Phi : "+phi);      
        System.out.println("Jari-jari: "+r);}    
}
