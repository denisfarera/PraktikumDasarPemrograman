package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        
    Scanner Denis = new Scanner(System.in);
    
    double hasil, angkaPertama, angkaKedua ;
    int operasi;
    
    
    System.out.print("Masukkan angka pertama : ");
    angkaPertama = Denis.nextDouble();
    System.out.print("Masukkan angka kedua : ");
    angkaKedua = Denis.nextDouble();
    System.out.print("Pilih operasi yang diinginkan \n1.penjumlahan \n2.pengurangan \n3.perkalian \n4.pembagian \n");
    System.out.print("Pilih operasi (1-4) : ");
    operasi = Denis.nextInt();
    
    switch (operasi) {
            case 1:
                hasil = angkaPertama + angkaKedua;
                System.out.print("Hasil : " +hasil);
                break;
            case 2:
                hasil = angkaPertama - angkaKedua;
                System.out.print("Hasil : " +hasil);
                break;
            case 3:
                hasil = angkaPertama * angkaKedua;
                System.out.print("Hasil : " +hasil);
                break;
            case 4:
                if (angkaKedua > 0) {
                    hasil = angkaPertama / angkaKedua;
                    System.out.print("Hasil : " +hasil);
                } else {
                    System.out.print("error tidak bisa dibagi 0");
                }
                break;
        }
        Denis.close();
    }
}
