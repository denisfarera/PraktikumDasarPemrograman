package Pertemuan12;

import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int BATAS_LULUS = 50;

        int n;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Banyaknya nilai minimal 1!");
            }
        } while (n < 1);

        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nilai mahasiswa ke-" + (i + 1) + " (0-100): ");
                nilai[i] = sc.nextInt();
                if (nilai[i] < 0 || nilai[i] > 100) {
                    System.out.println("Nilai harus antara 0 sampai 100!");
                }
            } while (nilai[i] < 0 || nilai[i] > 100);

            total += nilai[i];
        }
        double rata = (double) total / n;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println();
        System.out.println("===== HASIL PENGELOLAAN NILAI =====");
        System.out.println("Jumlah nilai   : " + n);
        System.out.printf("Rata-rata      : %.2f%n", rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        System.out.println();
        System.out.println("Daftar nilai dan status kelulusan:");
        for (int i = 0; i < n; i++) {
            String status;
            if (nilai[i] > BATAS_LULUS) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println((i + 1) + ". Nilai " + nilai[i] + " -> " + status);
        }

        sc.close();
    }
}
