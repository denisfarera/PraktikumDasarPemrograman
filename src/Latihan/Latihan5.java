package Latihan;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        double ipk;
        int pendapatan;

        System.out.println("Masukkan ipk anda : ");
        ipk = Denis.nextDouble();
        
        
        if (ipk >= 3.00) {
            System.out.println("ke tahap selanjutnya");
            System.out.println("Masukkan pendapatan orang tua perbulan : ");
            pendapatan = Denis.nextInt();
            if (pendapatan < 5000000) {
                System.out.println("Beasiswa Penuh");
            } else if (pendapatan >= 5000000 && pendapatan <= 10000000) {
                System.out.println("Beasiswa Parsial");
            } else {
                System.out.println("Tidak berhak");
            }
        } else {
            System.out.println("Tidak lolos");
        }
        Denis.close();
    }
}
