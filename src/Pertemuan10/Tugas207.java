package Pertemuan10;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 1) : ");
            n = Denis.nextInt();
            if (n < 3) {
                System.out.println("Masukkan ulang nilai n (nilai n harus minimal 1)");
            }
        } while (n < 3);
        
        int jumlahAngka = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n ) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahAngka += hasil;
                j++;
            }
            System.out.println(); 
            i++; 
        }
        System.out.print("Jumlah seluruh angka: " + jumlahAngka);
        Denis.close();
    }
}
