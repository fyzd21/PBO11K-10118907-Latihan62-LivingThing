/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan62.livingthing;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan living thing
 * 
 */
public class PBO11K10118907Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
