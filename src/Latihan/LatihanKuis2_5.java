package Latihan;

import java.util.Scanner;

public class LatihanKuis2_5 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        System.out.print("Masukkan jumlah kantin: ");
        int jumlahKantin = Denis.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = Denis.nextInt();

        if (jumlahKantin <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0");
        } else {
            int kantin = 1;
            int totalSeluruh = 0;
            int totalTerbaik = -1;
            int kantinTerbaik = 0;
            int hariSepi = 0;

            while (kantin <= jumlahKantin) {
                System.out.println("kantin" + kantin);

                int totalPendapatan = 0;
                for (int j = 1; j <= jumlahHari; j++) {
                    int pendapatan = 0;
                    do {
                        System.out.print("Pendapatan hari ke " + j + " : " );
                        pendapatan = Denis.nextInt();
                        if (pendapatan < 0) {
                            System.out.println("Pendapatan tidak boleh negatif. Masukkan ulang!");                            
                        }
                    } while (pendapatan < 0);
                    
                    if (pendapatan < 100) {
                        hariSepi++;
                    }
                    totalPendapatan += pendapatan;
                }
                totalSeluruh += totalPendapatan;
                double rataPerHari = (double)totalPendapatan / jumlahHari;
                System.out.println("Kantin " + kantin + " - total " + totalPendapatan + "," + " rata-rata per hari " + rataPerHari);
                
                if (totalPendapatan > totalTerbaik) {
                    totalTerbaik = totalPendapatan;
                    kantinTerbaik = kantin;
                }
                kantin++;
            }
            System.out.println("================================================");
            System.out.println("Total seluruh kantin\t : " + totalSeluruh);
            System.out.println("Kantin\t\t\t : " + kantinTerbaik);
            System.out.println("Hari sepi (<100)\t : " + hariSepi);
        }
        Denis.close();
    }
}
