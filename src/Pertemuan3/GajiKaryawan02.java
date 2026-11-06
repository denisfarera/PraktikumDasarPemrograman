package Pertemuan3;

import java.util.Scanner;
public class GajiKaryawan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunJtransp=600000;
        double tunjMkn=400000;
        System.out.println("Masukkan Gaji Pokok:");
        gajiPokok = sc.nextInt();
        bonus = 0.05*gajiPokok;
        totGaji= (int) (gajiPokok+tunJtransp+tunjMkn+bonus-(0.1*gajiPokok));
        System.out.println("Bonus Bulanan anda adalah Rp "+bonus);
        System.out.println("Gaji yang diterima adalah Rp "+totGaji);

        sc.close();
    }
}
