package Latihan;

import java.util.Scanner;

public class LatihanKuis2_3 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        Denis.nextInt();

        int jmlMhs = 5;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        int Tuntas = 0; 
        int Remidi = 0;
        int totalNilai = 0;
        double rataRata;

        for (int j = 1; j <= jmlMhs; j++) {
            int nilai;
            
            do {
                System.out.print(" Nilai tugas ke- " + j + ": ");
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
            if (nilai >= 70) {
                Tuntas++;
            } else {
               Remidi++;
            }
        }
        rataRata = totalNilai / jmlMhs;
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Tuntas (>= 70) : " + Tuntas);
        System.out.println("Remidi : " +Remidi);
        Denis.close();
    }
}
