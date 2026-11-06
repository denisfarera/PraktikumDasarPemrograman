package Pertemuan2;

import java.util.Scanner;
public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int gajiPokok;
    int tunjangan;
    int jumlahAnak;
    double persenPensiun = 0.1;

    System.out.println("Masukkan gaji pokok: ");
    gajiPokok = input.nextInt();
    System.out.println("Masukkan tunjangan: ");
    tunjangan = input.nextInt();
    System.out.println("Masukkan jumlah anak: ");
    jumlahAnak = input.nextInt();

    int totalTunjangan = jumlahAnak * tunjangan;
    double totalGaji = gajiPokok + totalTunjangan - persenPensiun * gajiPokok;

    System.out.println("Total gaji yang diterima: " + totalGaji);

    input.close();
    }
}
