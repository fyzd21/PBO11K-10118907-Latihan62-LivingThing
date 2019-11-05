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
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama+" bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama+" makan");
        
    }
}
