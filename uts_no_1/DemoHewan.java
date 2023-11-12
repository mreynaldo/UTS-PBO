/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_no_1;
import java.util.Scanner;

/**
 *
 * @author Reynaldo
 */

public class DemoHewan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine().trim().toLowerCase();

        Hewan hewan;

        switch (jenisHewan) {
            case "kucing":
                hewan = new Kucing();
                break;
            case "anjing":
                hewan = new Anjing();
                break;
            default:
                System.out.println("Jenis hewan tidak valid.");
                return;
        }

        System.out.println("Suara " + jenisHewan + ":");
        hewan.bersuara();

        if (hewan.mamalia()) {
            System.out.println(jenisHewan + " adalah mamalia.");
        } else {
            System.out.println(jenisHewan + " bukan mamalia.");
        }
    }
}

