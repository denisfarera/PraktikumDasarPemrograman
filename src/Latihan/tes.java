package Latihan;

import java.util.Scanner;

public class tes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahProduk, jumlahHari;
       
        do {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jumlahProduk = input.nextInt();
        } while (jumlahProduk < 1);
        
        do {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jumlahHari = input.nextInt();
        } while (jumlahHari < 1);

        int totalSeluruh = 0;
        
        int p = 1;
        while (p <= jumlahProduk) {
            System.out.println("\n=== Produk " + p + " ===");

            int totalProduk = 0; 
            
            for (int h = 1; h <= jumlahHari; h++) {
                int terjual;
               
                do {
                    System.out.print("Hari ke-" + h + " jumlah terjual: ");
                    terjual = input.nextInt();
                    if (terjual < 0) {
                        System.out.println("Jumlah tidak boleh negatif, ulangi input!");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rata = (double) totalProduk / jumlahHari;
            System.out.println("--- Rekap Produk " + p + " ---");
            System.out.println("Total terjual    : " + totalProduk);
            System.out.printf("Rata-rata harian : %.2f%n", rata);

            totalSeluruh += totalProduk;
            p++;
        }

        System.out.println("\n===========================");
        System.out.println("Total seluruh produk : " + totalSeluruh);

        input.close();
    }
}
