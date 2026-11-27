package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = Denis.nextInt();
            Denis.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = Denis.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = Denis.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = Denis.nextInt();
                    Denis.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris harus 1-4 dan kolom harus 1-2!");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = Denis.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : (kosong)");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : " + penonton[i][j]);
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak valid, pilih 1-3!");
            }
        }
        Denis.close();
    }
}