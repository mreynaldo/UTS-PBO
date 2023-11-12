/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_no_2;

/**
 *
 * @author Reynaldo
 */
public abstract class Pengguna {
    private String nama;
    private String NIK;

    public Pengguna(String nama, String NIK) {
        this.nama = nama;
        this.NIK = NIK;
    }

    public void login() {
        System.out.println("Anda berhasil login.\n");
    }

    public void logout() {
        System.out.println("Anda berhasil logout.\n");
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }
}
