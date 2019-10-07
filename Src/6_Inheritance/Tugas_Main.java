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
public class Tugas_Main {
        public static void main(String[] args) {        
            Tugas_Mac mac = new Tugas_Mac("Apple", 1080, 8,"Intel Core i7","Tanam", "AVAST");       
            mac.tampilMac();                
            Tugas_Windows win = new Tugas_Windows("MSI",1080, 8, "Intel Core i8", "Tanam", "Mode Khusus Gaming");        
            win.tampilWindows();     
        } 
}
