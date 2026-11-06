package Pertemuan4;

import java.util.Scanner;

public class tugas1Pemilihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas ? (True/False) :");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT Terverivikasi \nSilahkan cetak KRS dan minta tanda tangan DPA" : "";

        System.out.println(pesan);

        sc.close();
    }
}
