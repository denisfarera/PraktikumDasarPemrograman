package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab; 

        System.out.println("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.println("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.println("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.println("Asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi){
            if (punyaIzinDosen || asistenLab){
                System.out.println("Akses laboraturium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkn izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
        sc.close();
    }
}
