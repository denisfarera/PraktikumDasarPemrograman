/*
Percobaan 1 (uji tambahan, langkah 10) n (uji ke-1) 3 + (P mod 5) = 5
Percobaan 1 (uji tambahan, langkah 10) n (uji ke-2) 9 + (P mod 5) = 11
Percobaan 1 (Pertanyaan 1 & 2) n 4 + (P mod 4) = 7
Percobaan 1 (Pertanyaan 3) n 10 + (P mod 6) = 11
*/

package Pertemuan10;

import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Denis.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        Denis.close();
    }
}
