/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_no_1;

/**
 *
 * @author Reynaldo
 */
public class Hewan {

    private String jenisSuara;

    public Hewan(String jenis_suara) {
        this.jenisSuara = jenis_suara;
    }

    public void bersuara() {
        System.out.println(jenisSuara);
    }

    public boolean mamalia() {
        return false;
    }
}
