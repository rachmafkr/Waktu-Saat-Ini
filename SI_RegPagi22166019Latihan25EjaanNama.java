/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Berisi cara mengeja nama yang diberikan user.
 */
public class SI_RegPagi22166019Latihan25EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Meminta pengguna untuk memasukkan nama depan
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        String namaDepan = input.nextLine();
        System.out.println();

        // Mengonversi nama depan ke huruf kecil (untuk memastikan konsistensi)
        namaDepan = namaDepan.toLowerCase();

        // Menampilkan ejaan nama depan huruf demi huruf
        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah:");

        for (int i = 0; i < namaDepan.length(); i++) {
            char huruf = namaDepan.charAt(i);
            int urutan = i + 1;
            System.out.println("Huruf ke-" + urutan + ": " + huruf);
        }

        input.close();
    }
}