package Pertemuan3;

import java.util.Scanner;
public class TugasNomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double sisa, bunga, cicilan, totalCicilan;
        double Harga;
        System.out.println("Masukkan harga laptop:");
        Harga = sc.nextDouble();
        double UangMuka;
        System.out.println("Masukkan uang muka :");
        UangMuka = sc.nextDouble();
        double Bulan;
        System.out.println("Masukkan lama cicilan (bulan) :");
        Bulan = sc.nextDouble();

        sisa = Harga-UangMuka;
        bunga = sisa* 0.02;
        totalCicilan = sisa / Bulan ;
        cicilan = totalCicilan + bunga;

        System.out.println("Cicilan Perbulan ="+cicilan);

        sc.close();

    }
}
