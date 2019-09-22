/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author FARIZ
 */
public class mainpercobaan4 {
           public static void main(String[] args) {
        penumpang p = new penumpang("11234", "Mr.fredickson");
        gerbong gerbong = new gerbong("C", 12);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
