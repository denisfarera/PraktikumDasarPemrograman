/*
P = 7, kita hitung dulu parameter uniknya:

Nilai minimal Dasar Pemrograman = 75 + (7 mod 11) = 82
Nilai minimal wawancara = 70 + (7 mod 11) = 77
 */

package Pertemuan6;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaSertifikat;
        double nilaiDaspro, nilaiWawancara;

        System.out.println("== SELEKSI CALON ASISTEN PRAKTIKUM ==");
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        nilaiDaspro = sc.nextDouble();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        punyaSertifikat = sc.nextBoolean();

        
        if (mahasiswaAktif && !sedangDisanksi) {
            if (nilaiDaspro >= 82 || punyaSertifikat) {

                System.out.println("Anda lolos tahap awal.");
                System.out.println("Anda dipanggil untuk mengikuti wawancara.");

                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 77) {

                    System.out.println("Selamat, Anda diterima sebagai asisten praktikum.");

                } else {

                    System.out.println("Anda gagal pada tahap wawancara.");
                    System.out.println("Nilai wawancara belum mencapai 72.");
                }

            } else {

                System.out.println("Anda gagal pada tahap kedua.");
                System.out.println("Nilai Dasar Pemrograman kurang dari 77");
                System.out.println("dan tidak memiliki sertifikat kompetensi pemrograman.");
            }

        } else {

            System.out.println("Anda gagal pada tahap pertama.");
            System.out.println("Status mahasiswa tidak memenuhi syarat.");
            System.out.println("Mahasiswa harus aktif dan tidak sedang mendapatkan sanksi akademik.");
        }
    }
}

