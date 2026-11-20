package Latihan;

import java.util.Scanner;

public class LatihanKuis2_6 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        System.out.print("Jumlah area parkir : ");
        int jumlahAreaParkir = Denis.nextInt();
        System.out.print("Jumlah hari : ");
        int jumlahHari = Denis.nextInt();

        if (jumlahAreaParkir <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah area parkir dan hari harus > 0");
        } else {
            int areaParkir = 1;
            int totalSeluruh = 0;
            int totalTerendah = Integer.MAX_VALUE;
            int hariSepi = 0;
            int areaSepi = 0;

            while (areaParkir <= jumlahAreaParkir) {
                System.out.println("Area " + areaParkir);

                int totalKendaraan = 0;
                for (int j = 1; j <= jumlahHari; j++) {
                    int  kendaraan = 0;
                    do {
                        System.out.print("Kendaraan hari ke-" + j + " : ");
                        kendaraan = Denis.nextInt();
                        if (kendaraan < 0) {
                            System.out.println("Jumlah kendaraan tidak boleh negatif. Masukkan ulang!");
                        }
                    } while (kendaraan < 0);

                    if (kendaraan < 30) {
                        hariSepi++;
                    }
                    totalKendaraan += kendaraan;
                }
                totalSeluruh += totalKendaraan;
                double rataPerHari = (double)totalKendaraan / jumlahHari;
                System.out.println("Area - " + areaParkir + " total: " + totalKendaraan + "," +" rata-rata per hari: " + rataPerHari);

                if (totalKendaraan <= totalTerendah) {
                    totalTerendah = totalKendaraan;
                    areaSepi = areaParkir;
                }
                areaParkir++;
            }
            System.out.println("================================================");
            System.out.println("Total seluruh kendaraan\t : " + totalSeluruh);
            System.out.println("Area paling sepi\t : " + areaSepi);
            System.out.println("Hari sepi (<30)\t\t : " + hariSepi);
        }
        Denis.close();
    }
}
