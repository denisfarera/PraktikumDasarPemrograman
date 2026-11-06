package Pertemuan10;

import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int jumlahToko;
        
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = Denis.nextInt();
            if (jumlahToko < 1) {
                System.out.print("Jumlah toko harus minimal 1");
            }
        } while (jumlahToko < 1);

        int totalSeluruhBarang = 0;
        int barangTerbanyak = 0;
        int tokoTerbanyak = 0;

        int toko = 1;
        while (toko <= jumlahToko) {
            int jumlahPelanggan;

            do {
                System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                jumlahPelanggan = Denis.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan harus minimal 0, tidak boleh negatif");
                }
            } while (jumlahPelanggan < 0);

            int totalBarang = 0;
            int pelanggan = 1;
            while (pelanggan <= jumlahPelanggan) {
                
                int barang;
                do {
                    System.out.print("Pelanggan " + pelanggan + " - jumlah barang: ");
                    barang = Denis.nextInt();
                    if (barang <= 0) {
                        System.out.print("Jumlah barang harus minimal 0, tidak boleh negatif");
                    }
                } while (barang < 0);
                totalBarang += barang;
                pelanggan++;
            }
            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + " total barang: " + totalBarang);
            System.out.println();

            totalSeluruhBarang += totalBarang;

            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak = toko;
            }
            toko++;
        }
        System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        Denis.close();
    }
}