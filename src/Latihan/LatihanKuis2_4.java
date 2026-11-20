package Latihan;

import java.util.Scanner;

public class LatihanKuis2_4 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        System.out.print("Jumlah ruang baca : ");
        int jumlahRuang = Denis.nextInt();
        System.out.print("Jumlah hari       : ");
        int jumlahHari = Denis.nextInt();

        if (jumlahRuang <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah ruang dan hari harus > 0.");
        } else {
            int totalSemua = 0;
            int ruangTerramai = 0;
            int totalTertinggi = -1;
            int hariRamai = 0;

            for (int ruang = 1; ruang <= jumlahRuang; ruang++) {
                System.out.println("Ruang " + ruang);
                int totalRuang = 0;

                int hari = 1;
                while (hari <= jumlahHari) {
                    int pengunjung;

                    do {
                        System.out.print("  Pengunjung hari ke-" + hari + " : ");
                        pengunjung = Denis.nextInt();
                        if (pengunjung < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (pengunjung < 0);

                    totalRuang += pengunjung;
                    if (pengunjung > 50) {
                        hariRamai++;
                    }
                    hari++;
                }

                double rataRata = (double) totalRuang / jumlahHari;
                System.out.println("Ruang " + ruang + " - total: " + totalRuang + ", rata-rata per hari: " + rataRata);

                totalSemua += totalRuang;

                if (totalRuang > totalTertinggi) {
                    totalTertinggi = totalRuang;
                    ruangTerramai = ruang;
                }
            }

            System.out.println("==============================");
            System.out.println("Total seluruh pengunjung : " + totalSemua);
            System.out.println("Ruang paling ramai       : " + ruangTerramai);
            System.out.println("Hari ramai (> 50)        : " + hariRamai);
        }
        Denis.close();
    }
}
