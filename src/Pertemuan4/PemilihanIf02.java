package Pertemuan4;

import java.util.Scanner;

public class PemilihanIf02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas ? (True/False) :");
        boolean uktLunas = sc.nextBoolean();
    
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}
