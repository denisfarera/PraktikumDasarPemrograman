/*
Percobaan 2 (uji tambahan, langkah 9) (baris, kolom) uji ke-1 (2 + (P mod 3), 4 + (P mod 3)) = 3, 5
Percobaan 2 (uji tambahan, langkah 9) (baris, kolom) uji ke-2 (5 + (P mod 3), 2 + (P mod 3)) = 6, 3
Percobaan 2 (Pertanyaan 2) baris, kolom 4 + (P mod 4), 6 + (P mod 4) = 7, 9
*/

package Pertemuan10;

import java.util.Scanner;

public class Rectangle07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = Denis.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = Denis.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Denis.close();
    }
}
