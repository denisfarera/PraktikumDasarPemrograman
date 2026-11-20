package Latihan;

import java.util.Scanner;

public class LatihanKuis2_1 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        int jmlMhs;

        do {
            System.out.print("Masukkan jumlah mahasiswa : ");
            jmlMhs = Denis.nextInt();
            if (jmlMhs < 1) {
                System.out.println(" Jumlah mahasiswa minimal 1. Ulangi input!");
            }
        } while (jmlMhs < 1);

        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        int jumlahMhsLulus = 0;
        int jmlMhsTdkLulus = 0;
        int totalNilai = 0;
        double rataRata;

        for (int j = 1; j <= jmlMhs; j++) {
            int nilai;

            do {
                System.out.print(" Nilai Mahasiswa ke- " + j + ": ");
                nilai = Denis.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println(" Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            totalNilai += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
            if (nilai >= 60) {
                jumlahMhsLulus++;
            } else {
               jmlMhsTdkLulus++;
            }
        }
        rataRata = (double) totalNilai / jmlMhs;
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Lulus (>= 60) : " + jumlahMhsLulus);
        System.out.println("Tidak lulus : " +jmlMhsTdkLulus);
        Denis.close();
    }
}