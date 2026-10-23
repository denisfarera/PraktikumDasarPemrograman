package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = Denis.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transakasi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = Denis.nextInt();
            System.out.print("Jumlah teh: ");
            teh = Denis.nextInt();
            System.out.print("Jumlah roti: ");
            roti = Denis.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            Denis.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

        Denis.close();
    }
}
