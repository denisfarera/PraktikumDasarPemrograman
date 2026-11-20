package Latihan;

import java.util.Scanner;

public class LatihanKuis2_2 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        System.out.print("Jumlah kantin : ");
        int jumlahKantin = Denis.nextInt();
        System.out.print("Jumlah hari : ");
        int jumlahHari = Denis.nextInt();

        int kantin = 1;
        double rataRata = 0;
        int kantinTerbaik = 0;
        int totalSeluruh = 0;
        int totalHariSepi = 0;

        while (kantin <= jumlahKantin) {
            System.out.println("Kantin " + kantin);
            double totalNilai = 0;

            for (int j = 1; j <= jumlahHari; j++) {
                int nilai;
                do {
                    System.out.print(" Pendapatan hari ke- " + j + ": ");
                    nilai = Denis.nextInt();
                    if (nilai < 0) {
                        System.out.println("Tidak boleh negatif. Ulangi input!");
                    }
                } while (nilai < 0);

                if (nilai < 100) {
                    totalHariSepi++;
                }
                totalNilai += nilai;
            }

            totalSeluruh += totalNilai;
            double rataPerHari = (double)totalNilai / jumlahHari;

            System.out.println("Kantin " + kantin + " - total = " + totalNilai + ", rata-rata per hari = " + rataPerHari);
            if (rataPerHari > rataRata) {
                kantinTerbaik = kantin;
                rataRata = rataPerHari;
            }
            kantin++;
        }

        System.out.println("==============================");
        System.out.println("Total seluruh kantin : " + totalSeluruh);
        System.out.println("Kantin terbaik : " + kantinTerbaik);
        System.out.println("Total hari sepi : " + totalHariSepi);

        Denis.close();
    }
}