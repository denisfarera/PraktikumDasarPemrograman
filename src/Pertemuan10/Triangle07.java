/*
Percobaan 3 (uji awal, langkah 3) n 2 + (P mod 3) = 3
*/

package Pertemuan10;

import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Denis.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
                while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        
        Denis.close();
    }
}
