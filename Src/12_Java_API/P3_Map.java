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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class P3_Map {
    public static void main(String[] args) {
        HashMap hMapItem=new HashMap();
        hMapItem.put("1","Coklat");
        hMapItem.put("2","CoffeCream");
        hMapItem.put("3","Beer");
        System.out.println(hMapItem);
        Collection mCollection=hMapItem.values();
        Iterator mIterator =mCollection.iterator();
        while (mIterator.hasNext()){
            System.out.println(mIterator.next());
        }
        
        Object mObject=hMapItem.remove("1");
        System.out.format("%s remove hashMap\n",mObject);
        System.out.format("HashMap item total : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("Hasmap item total : %d\n",hMapItem.size());
    }
}
