package Pertemuan4;

import java.util.Scanner;

public class tugas2Pemilihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Masukkan jumlah saat ini :");
        int sks = sc.nextInt();

        if (sks >24 ) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS Valid");
        }
        sc.close();
    }
}
