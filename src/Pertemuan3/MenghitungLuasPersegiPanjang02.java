package Pertemuan3;

import java.util.Scanner;
public class MenghitungLuasPersegiPanjang02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int panjang;
        int lebar;
        int luas;
        System.out.println("Masukkan Panjang:");
        panjang = sc.nextInt();
        System.out.println("Masukkan Lebar:");
        lebar = sc.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas persegi adalah"+luas);
        
        sc.close();
    }
}
