package Pertemuan4;

import java.util.Scanner;

public class TugasAntrean02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Mesin antrean akademik ---");
        System.out.println("Masukkan kode layanan :");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Surat keterangan aktif kuliah");
                break;
            case 3:
                System.out.println("Pembayaran ukt");
                break;
            case 4:
                System.out.println("Pengajuan cuti akademik");
                break;
            default:
                System.out.println("Layanan tidak tersedia");
                break;
        }
        sc.close();
    }
}
