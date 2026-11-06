package Pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean mahasiswa, dosen, akunDiBlokir;

        System.out.println("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.println("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.println("Apakah akun sedang di blokir? (true/false): ");
        akunDiBlokir = sc.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiBlokir){
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }
        sc.close();
    }
}
