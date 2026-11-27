package Pertemuan13;

import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int jumlahMhs, jumlahMatkul;

        do {
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlahMhs = Denis.nextInt();
            if (jumlahMhs < 1) {
                System.out.println("Jumlah mahasiswa minimal 1!");
            }
        } while (jumlahMhs < 1);

        do {
            System.out.print("Masukkan jumlah mata kuliah: ");
            jumlahMatkul = Denis.nextInt();
            if (jumlahMatkul < 1) {
                System.out.println("Jumlah mata kuliah minimal 1!");
            }
        } while (jumlahMatkul < 1);

        int[][] nilai = new int[jumlahMhs][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = Denis.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }
        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
        }
        Denis.close();
    }
}