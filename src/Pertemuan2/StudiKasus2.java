package Pertemuan2;

import java.util.Scanner;
public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebarTanah;
        int panjangTanah;
        double diameterLingkaran;
        double phi = 3.14;
        int sisi;
        double luasTanah;
        double jariJari;
        double kolamLingkaran;
        int luasPersegi;
        double luasDigunakan;
        double luasTidakDigunakan;

        System.out.println("Masukkan lebar tanah: ");
        lebarTanah = input.nextInt();
        System.out.println("Masukkan panjang tanah: ");
        panjangTanah = input.nextInt();
        System.out.println("Masukkan diameter kolam: ");
        diameterLingkaran = input.nextInt();
        System.out.println("Masukkan sisi kolam: ");
        sisi = input.nextInt();

        luasTanah = lebarTanah * panjangTanah;
        jariJari = diameterLingkaran / 2;
        kolamLingkaran = phi * jariJari * jariJari;
        luasPersegi = sisi * sisi;
        luasDigunakan = kolamLingkaran + luasPersegi;
        luasTidakDigunakan = luasTanah - luasDigunakan;

        System.out.println("Luas Tanah: " + luasTanah + " m2");
        System.out.println("Luas Kolam: " + kolamLingkaran + " m2");
        System.out.println("Luas Taman: " + luasPersegi + " m2");
        System.out.println("Luas Tanah Digunakan: " + luasDigunakan + " m2");
        System.out.println("Luas Tidak Digunakan: " + luasTidakDigunakan + " m2");

        input.close();
    }
}