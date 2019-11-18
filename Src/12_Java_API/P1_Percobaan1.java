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
import java.util.HashSet;
import java.util.Iterator;
import  java.util.Set;
public class P1_Percobaan1 {
    public static void main(String[] args) {
        Set mSetCity=new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Bandung");
        mSetCity.add("jakarta");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator=mSetCity.iterator();
        
        while(mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
