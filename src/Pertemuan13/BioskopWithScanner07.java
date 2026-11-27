package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = Denis.nextLine();
            System.out.print("Masukkan baris: ");
            baris = Denis.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = Denis.nextInt();
            Denis.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = Denis.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
        Denis.close();
    }
}
