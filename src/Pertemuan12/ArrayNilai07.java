package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner Denis = new Scanner(System.in);

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status;
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                jumlahLulus++;
            } else {
                status = "TIDAK LULUS";
                jumlahTidakLulus++;
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        Denis.close();
    }
}
