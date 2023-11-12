/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_no_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Reynaldo
 */
public class PerpusDemo {

    public static void main(String[] args) {
        List<Buku> bukuList = new ArrayList<>();
        bukuList.add(new Buku("Spiderman", "Fantasy"));
        bukuList.add(new Buku("Ada Apa Dengan Cinta", "Romance"));
        bukuList.add(new Buku("Nenek Gayung", "Horror"));

        Scanner input = new Scanner(System.in);

        Pengguna pengguna;
        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIK   : ");
        String NIK = input.nextLine();
        if (nama.equals("admin") || nama.equals("Admin") && NIK.equals("123")) {
            pengguna = new Admin(nama, NIK);

        } else {
            pengguna = new User(nama, NIK);
        }

        pengguna.login();
        if (pengguna instanceof User user) {
            user.lihatBuku(bukuList);
        } else {
            Admin admin = (Admin) pengguna;
            System.out.println("1. Lihat Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.print("Choose : ");
            String pilihan = input.nextLine();
            if (pilihan.equals("1")) {
                admin.lihatBuku(bukuList);
            } else if (pilihan.equals("2")) {
                admin.tambahBuku(bukuList);
                admin.lihatBuku(bukuList);
            } else {
                admin.hapusBuku(bukuList);
                admin.lihatBuku(bukuList);
            }
            System.out.println("Back to Menu (Y/N)? ");
        }
        System.out.print("\nKetik N untuk LogOut");
        String pilihan = input.nextLine();
        pengguna.logout();

    }
}
