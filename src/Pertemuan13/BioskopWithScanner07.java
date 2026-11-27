package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        boolean kursiTersedia;
        String[][] penonton = new String[4][2];
        int jumlahBaris = penonton.length;
        int jumlahKolom = penonton[0].length;

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

                    do {
                        do {
                            System.out.print("Masukkan baris (1-" + jumlahBaris + "): ");
                            baris = Denis.nextInt();
                            if (baris < 1 || baris > jumlahBaris) {
                                System.out.println("Baris " + baris + " tidak tersedia! Pilih baris 1-" + jumlahBaris + ".");
                            }
                        } while (baris < 1 || baris > jumlahBaris);

                        do {
                            System.out.print("Masukkan kolom (1-" + jumlahKolom + "): ");
                            kolom = Denis.nextInt();
                            if (kolom < 1 || kolom > jumlahKolom) {
                                System.out.println("Kolom " + kolom + " tidak tersedia! Pilih kolom 1-" + jumlahKolom + ".");
                            }
                        } while (kolom < 1 || kolom > jumlahKolom);

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi baris " + baris + ", kolom " + kolom
                                    + " sudah diisi oleh " + penonton[baris - 1][kolom - 1]
                                    + "! Silakan pilih kursi lain.");
                            kursiTersedia = false;
                        } else {
                            kursiTersedia = true;
                        }
                    } while (!kursiTersedia);

                    Denis.nextLine();

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