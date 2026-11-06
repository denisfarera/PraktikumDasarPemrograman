package Pertemuan3;

import java.util.Scanner;
public class TugasNomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lembar;
        int biayaCetak = 500;
        int biayaJilid = 5000;
        int total;

        System.out.print("Masukkan jumlah lembar: ");
        lembar = sc.nextInt();

        biayaCetak = lembar*biayaCetak;
        total = biayaCetak + biayaJilid;

        System.out.println("Total biaya: "+total);

        sc.close();
    }
}
