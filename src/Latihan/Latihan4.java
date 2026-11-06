package Latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan, kategoriBarang, metodePembayaran, statusBelanja;
        int kodeBarang, hargaBarang = 0, jumlahBarang, totalBelanja, kodePembayaran, potonganEwallet = 0;
        double diskonMember = 0, totalBayar, diskonBelanja = 0;
        boolean punyaMember;

        System.out.println("===== KASIR MINIMARKET =====");
        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan = sc.nextLine();
        
        System.out.println("Pilih kategori barang:");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Peralatan mandi");
        System.out.println("4. Alat tulis");
        System.out.print("Masukkan kode barang: ");
        kodeBarang = sc.nextInt();

        switch (kodeBarang) {
            case 1:
                kategoriBarang = "Makanan";
                hargaBarang = 15000;
                break;
            case 2:
                kategoriBarang = "Minuman";
                hargaBarang = 10000;
                break;
            case 3:
                kategoriBarang = "Peralatan Mandi";
                hargaBarang = 25000;
                break;
            case 4:
                kategoriBarang = "Alat Tulis";
                hargaBarang = 5000;
                break;
        
            default:
            System.out.println("\nKategori barang tidak valid!");
            System.out.println("Transaksi dibatalkan.");
            kategoriBarang = "Tidak valid";
            System.exit(1);
        }

        System.out.print("Masukkan jumlah barang : ");
        jumlahBarang = sc.nextInt();

        if (jumlahBarang <= 0) {
            System.out.println("Jumlah barang tidak valid");
        } 

        totalBelanja = hargaBarang * jumlahBarang;

        if (totalBelanja >= 100000) {
            diskonBelanja = totalBelanja * 0.10;
        } else if (totalBelanja >= 50000) {
            diskonBelanja = totalBelanja * 0.05;
        } else {
            diskonBelanja = 0;
        }

        System.out.print("Apakah anda memiliki kartu member? (true/false): ");
        punyaMember = sc.nextBoolean();

        if (punyaMember) {
            if (totalBelanja >= 100000) {
                diskonMember = totalBelanja*0.5;
            } else {
                diskonMember = totalBelanja*0.2;
            }
        } else {
            diskonMember = 0;
        }

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Debit");
        System.out.println("3. E-Wallet");
        kodePembayaran = sc.nextInt();

        switch (kodePembayaran) {
            case 1:
                metodePembayaran = "Tunai";
                break;
            case 2:
                metodePembayaran = "Debit";
                break;
            case 3:
            if (totalBelanja-diskonBelanja >= 50000) {
                potonganEwallet = 2000;
            }
            metodePembayaran = "E-Wallet";
                break;
        
            default:
            System.out.println("Metode tidak valid");
                break;
        }

        totalBayar = totalBelanja - diskonBelanja - diskonMember;

        if (totalBayar >= 100000) {
            statusBelanja = "Belanja besar";
        } else if (totalBayar >= 50000) {
            statusBelanja = "Belanja sedang";
        } else {
            statusBelanja = "Belanja kecil";
        }

        System.out.println("=== STRUK BELANJA ===");
        System.out.println("Nama Pelanggan\t\t : "+ namaPelanggan);
        System.out.println("Kategori Barang\t\t : "+ kategoriBarang);
        System.out.println("Harga per unit\t\t : "+ hargaBarang);
        System.out.println("Total belanja\t\t : "+ totalBelanja);
        System.out.println("Diskon belanja (10%)\t : "+ diskonBelanja);
        System.out.println("Diskon member (5%)\t : "+ diskonMember);
        System.out.println("Potongan e-wallet\t : "+ potonganEwallet);
        System.out.println("-----------------------------------------");
        System.out.println("Total pembayaran\t : "+ totalBayar);
        System.out.println("Metode pembayaran\t : "+ kodePembayaran);
        System.out.println("Status Belanja\t\t : "+ statusBelanja);

        sc.close();
    }
}
