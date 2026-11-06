package Pertemuan4;

import java.util.Scanner;

public class TugasParkir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sistem Parkir Motor ---");
        System.out.println("Masukkan lama parkir anda :");
        int lamaParkir = sc.nextInt();

        if (lamaParkir <= 2) {
            System.out.println("Total Bayar : Rp2000");
        } else {
            System.out.println("Total Bayar : Rp" + ((lamaParkir-2)*1000+2000));
        }
        sc.close();
    }
}
