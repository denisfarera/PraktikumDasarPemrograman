package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner Denis = new Scanner(System.in);
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = Denis.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }
        Denis.close();
    }
}
