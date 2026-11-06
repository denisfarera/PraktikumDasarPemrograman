package Pertemuan7;

import java.util.Scanner;

public class StudiKasus107 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int hargaPerCup = 16000;
        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = Denis.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = Denis.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        int diskon  = 0;

        if (totalHarga >= 100000 ) {
            diskon = totalHarga * 6 / 100;
        }

        totalBayar = totalHarga - diskon;
        
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar :" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup kurang Rp : " + kurang);
        }
        Denis.close();
    }
}

