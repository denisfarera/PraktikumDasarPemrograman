package Kuis2;

import java.util.Scanner;

public class NilaiMhs_07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        String namaMhs;
        int nilaiKuis;
        int nilaiUts;
        int nilaiUAS;
        double rataRata;
        double NA;

        System.out.print("Nama mahasiswa: ");
        namaMhs = Denis.nextLine();
        System.out.print("Nilai Kuis: ");
        nilaiKuis = Denis.nextInt();
        System.out.print("Nilai UTS: ");
        nilaiUts = Denis.nextInt();
        System.out.print("Nilai UAS: ");
        nilaiUAS = Denis.nextInt();

        int nilaiTugas = 2;
        for (int i = 1; i <= nilaiTugas; i++) {
            int nilaiTugasKe;
            do {
                System.out.print("Nilai tugas " + i + " : ");
                nilaiTugasKe = Denis.nextInt();
                if (nilaiTugasKe <=0) {
                    System.out.println("Nilai tidak valid, ulangi!");
                }
            } while (nilaiTugasKe <=0);
                rataRata = nilaiTugas / i ;
                NA = nilaiKuis * 0.35 + nilaiUts * 0.15 + nilaiUAS * 0.2 + rataRata;
                
                System.out.println("rata-rata " + rataRata);
                System.out.println("Nilai akhir " + NA);
        }
    }
}