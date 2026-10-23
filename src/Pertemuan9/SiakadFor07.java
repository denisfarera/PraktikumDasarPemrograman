/*
• Jumlah mahasiswa (batas perulangan FOR) = 8 + (7 mod 5) = 10
• Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (7 mod 11) = 62
*/
package Pertemuan9;

import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        double nilai, tertinggi = 100, terendah = 0, batasNilaiLulus = 62;
        int jmlLulus = 0,jmlTidakLulus = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = Denis.nextDouble();
            if (nilai < tertinggi) {
                tertinggi = nilai;
            }
            if (nilai > terendah) {
                terendah = nilai;
            }
            if (nilai >= batasNilaiLulus) {
                jmlLulus++;
            } else {
               jmlTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " +jmlTidakLulus);
        
        Denis.close();
    }
}