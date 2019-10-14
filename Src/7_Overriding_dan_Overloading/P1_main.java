/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author FARIZ
 */
public class P1_main {
    public static void main(String[] args) {
        P1_Manager man[]=new P1_Manager[2];
        P1_Staff staff1[]=new P1_Staff[2];
        P1_Staff staff2[]=new P1_Staff[3];
        
        man[0]=new P1_Manager();
        man[0].setNama("Fariz");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
         man[1]=new P1_Manager();
        man[1].setNama("Fuad");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
         staff1[0]=new P1_Staff();
        staff1[0].setNama("Dina");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);
        
         staff1[1]=new P1_Staff();
        staff1[1].setNama("Andri");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        man[0].setSt(staff1);
        
        
         staff2[0]=new P1_Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(55000);
        
        staff2[1]=new P1_Staff();
        staff2[1].setNama("arie");
        staff2[1].setNip("006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(10000);
        
         staff2[2]=new P1_Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("00");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(5);
        staff2[2].setGajiLembur(10000);
        man[1].setSt(staff2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
        
        
    }
 
}
