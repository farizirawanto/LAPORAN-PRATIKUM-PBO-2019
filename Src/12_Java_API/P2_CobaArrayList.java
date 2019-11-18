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
import java.util.Iterator;
import java.util.List;
public class P2_CobaArrayList {
    public static void main(String[] args) {
        List mListCountry=new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Germany");
        mListCountry.add("United Kingdom");
        System.out.println(mListCountry);
        System.out.format("List index 0= %s\n",mListCountry.get(1));
        System.out.format("List index 2= %s\n",mListCountry.get(2));
        
        System.out.println("--------------");
        System.out.println("Country List");
        Iterator mIterator =mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element =mIterator.next();
            System.out.format("%s ,",element);
        }
    }
}
