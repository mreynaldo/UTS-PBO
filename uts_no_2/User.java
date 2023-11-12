/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_no_2;
import java.util.List;

/**
 *
 * @author Reynaldo
 */
public class User extends Pengguna {
    public User(String nama, String NIK) {
        super(nama, NIK);
    }

    public void lihatBuku(List<Buku> bukuList) {
        System.out.println("Daftar buku :");
        for (Buku buku : bukuList) {
            System.out.println(buku.getJudul() + " | " + buku.getGenre());
        }
    }
}
