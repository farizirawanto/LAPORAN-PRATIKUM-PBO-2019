/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author w33.haa
 */
import java.util.ArrayList;
public class P4_InputData {
    ArrayList<P4_Mahasiswa>ListMahasiswa;
    public P4_InputData(){
        ListMahasiswa=new ArrayList();
    }
    public void isiData(String Nim,String Nama,String Alamat){
     P4_Mahasiswa mhs =new P4_Mahasiswa(Nim, Nama, Alamat);  
     ListMahasiswa.add(mhs);
    }
    public ArrayList<P4_Mahasiswa> getData(){
        return ListMahasiswa;
    }
}
