package Pertemuan6;

import java.util.Scanner;

public class nestedUjianSkripsi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya / Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {

            if (bimbinganP1 >= 8 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi";

            } else if (bimbinganP1 < 8 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";

            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";

            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }

        } else {
            pesan = "Gagal! Mahasiswa belum bebas kompen";
        }

        System.out.println(pesan);

        sc.close();
    }
}

/* 
Rumus =
Syarat minimal log bimbingan Pembimbing 1 = 6 + (P mod 5)   → gantikan angka 8 pada contoh 
Syarat minimal log bimbingan Pembimbing 2 = 3 + (P mod 3)   → gantikan angka 4 pada contoh 
absen saya 07
*/