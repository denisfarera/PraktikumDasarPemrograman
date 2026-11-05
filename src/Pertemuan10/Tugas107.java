package Pertemuan10;

import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 1) : ");
            n = Denis.nextInt();
            if (n < 1) {
                System.out.println("Masukkan ulang nilai n (nilai n harus minimal 1)");
            }
        } while (n < 1);
        
        int totalAngka = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                totalAngka++;
                j++;
            }
            System.out.println();
            i++; 
        }
        System.out.print("Total angka yang tercetak: " + totalAngka);
        Denis.close();
    }
}
