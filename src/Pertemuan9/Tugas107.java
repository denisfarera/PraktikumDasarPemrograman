/*
• Harga tiket = 40000 + (7 mod 6) × 2000 → gantikan Rp42.000 pada soal
• Syarat diskon pertama = lebih dari (3 + (7 mod 3)) = 4 tiket, dengan diskon (8 + (7 mod 5))% = 10%→
gantikan "lebih dari 4 tiket, diskon 10%"
Dasar Pemrograman 2026
• Syarat diskon kedua = lebih dari (8 + (P mod 4)) = 11 tiket, dengan diskon (15 + (7 mod 4))= 18% →
gantikan "lebih dari 10 tiket, diskon 15%"
*/
package Pertemuan9;

import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        int jmlTiket = 0, jmlPelanggan, hargaTiket = 42000, totalTiket = 0, i = 0;
        double diskon = 0, totalHargaTiket = 0, totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan: ");
        jmlPelanggan = Denis.nextInt();

        while (i < jmlPelanggan) {
            System.out.println("Pelanggan ke-" +(i+1)+": ");
            System.out.println("Masukkan jumlah tiket Pelanggan ke- " +(i + 1)+ ": " );
            jmlTiket = Denis.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Masukkan ulang jumlah tiket: ");
                continue;
            }
            if (jmlTiket >= 4 && jmlTiket < 10) {
                diskon = jmlTiket * hargaTiket * 0.10;
                totalHargaTiket = hargaTiket * jmlTiket - diskon;
            } else if (jmlTiket >= 11) {
                diskon = hargaTiket * 0.18;
                totalHargaTiket = hargaTiket * jmlTiket - diskon;
            } else {
                totalHargaTiket = hargaTiket * jmlTiket;
            }
            totalTiket += jmlTiket;
            totalPenjualan += totalHargaTiket;
            i++;
        }
        System.out.println("Total tiket yang terjual " + totalTiket);
        System.out.println("Total penjualan hari ini: " + totalPenjualan);
    }
}
