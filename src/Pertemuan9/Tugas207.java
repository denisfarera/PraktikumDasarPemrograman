/*
• Tarif parkir mobil = 2500 + (7 mod 6) × 250 per jam = 2750→ gantikan Rp3.000 pada soal
• Tarif parkir motor = 1500 + (7 mod 6) × 250 per jam = 1750 (gunakan nilai (7 mod 6) yang SAMA
dengan tarif mobil) → gantikan Rp2.000 pada soal
*/

package Pertemuan9;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
         int jenis, durasi;
        int total = 0;

        int tarifMobil = 2500 + (7 % 6) * 250; 
        int tarifMotor = 1500 + (7 % 6) * 250;

        do {
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor, 0: keluar): ");
            jenis = Denis.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = Denis.nextInt();

                if (jenis == 1) {
                    total += durasi * tarifMobil;
                } else {
                    total += durasi * tarifMotor;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("\nTotal pembayaran parkir: Rp " + total);


    }
}
