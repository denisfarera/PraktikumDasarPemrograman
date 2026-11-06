package Latihan;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);
        String nama, nim, jurusan;
        int semester, jumlahTanggungan;
        double ipk, penghasilanOrtu;

        String statusSemester;
        String kategoriAkademik;
        String golonganUkt;
        String statusBeasiswa;
        double nominalUktDasar = 4500000.0;
        double diskonUkt;
        double totalUktAkhir;

        System.out.println("====SISTEM TERPADU AKADEMIK & KEUANGAN KAMPUS====");
        
        System.out.print("Masukkan Nama Lengkap      : ");
        nama = Denis.nextLine();
        
        System.out.print("Masukkan Nomor Induk (NIM) : ");
        nim = Denis.nextLine();
        
        System.out.print("Masukkan Jurusan/Prodi     : ");
        jurusan = Denis.nextLine();
        
        System.out.print("Masukkan Semester Aktif    : ");
        semester = Denis.nextInt();

        if (semester >= 2 && semester <= 8) {
            statusSemester = "Aktif / Valid";
            System.out.println("Semester valid. Melanjutkan input nilai akademik");
            System.out.print("Masukkan IPK Terakhir (0.0 - 4.0): ");
            ipk = Denis.nextDouble();

            if (ipk >= 2.75) {
                
                if (ipk >= 3.51) {
                    kategoriAkademik = "Dengan Pujian (Cumlaude)";
                } else if (ipk >= 3.20) {
                    kategoriAkademik = "Sangat Memuaskan";
                } else {
                    kategoriAkademik = "Memuaskan";
                }

                System.out.println("[INFO] Status akademik: " + kategoriAkademik);
                System.out.print("Masukkan Total Penghasilan Orang Tua per Bulan (Rp): ");
                penghasilanOrtu = Denis.nextDouble();

                System.out.print("Masukkan Jumlah Tanggungan Keluarga (Anak/Jiwa): ");
                jumlahTanggungan = Denis.nextInt();

                if (penghasilanOrtu < 3000000) {
                    golonganUkt = "Golongan I (Subsidi Penuh)";
                    
                    if (jumlahTanggungan >= 3) {
                        statusBeasiswa = "Beasiswa Penuh (Full 100% + Biaya Hidup)";
                        diskonUkt = 1.0; 
                    } else {
                        statusBeasiswa = "Beasiswa Parsial Utama";
                        diskonUkt = 0.75; 
                    }

                } else if (penghasilanOrtu >= 3000000 && penghasilanOrtu <= 7000000) {
                    
                    if (ipk >= 3.50) {
                        golonganUkt = "Golongan II (Subsidi Sebagian)";
                        statusBeasiswa = "Beasiswa Prestasi Unggulan";
                        diskonUkt = 0.50; 
                    } else {
                        golonganUkt = "Golongan III (Standar Menengah)";
                        statusBeasiswa = "Tidak Mendapatkan Beasiswa (Mandiri)";
                        diskonUkt = 0.20; 
                    }

                } else {
                    golonganUkt = "Golongan IV (Non-Subsidi)";
                    statusBeasiswa = "Mandiri (Mampu)";
                    diskonUkt = 0.0; 
                }

                totalUktAkhir = nominalUktDasar - (nominalUktDasar * diskonUkt);

            } else {
                kategoriAkademik = "Peringatan Akademik (Probation)";
                golonganUkt = "Golongan IV (Peninjauan Kembali)";
                statusBeasiswa = "Ditolak (Syarat IPK Minimum Tidak Terpenuhi)";
                totalUktAkhir = nominalUktDasar; 
            }

        } else {
            statusSemester = "Tidak Valid / Di Luar Batas Akademik";
            kategoriAkademik = "Tidak Dapat Diproses";
            golonganUkt = "Tidak Terdefinisi";
            statusBeasiswa = "Tidak Tersedia";
            totalUktAkhir = 0.0;
            System.out.println("Semester tidak valid. Sistem menghentikan kalkulasi lanjutan.");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("=======HASIL EVALUASI AKADEMIK & KEUANGAN=======");
        System.out.println("Nama Mahasiswa     : " + nama);
        System.out.println("Nomor Induk (NIM)  : " + nim);
        System.out.println("Jurusan / Prodi    : " + jurusan);
        System.out.println("Status Semester    : " + statusSemester);
        System.out.println("--------------------------------------------------");
        System.out.println("Kategori Akademik  : " + kategoriAkademik);
        System.out.println("Penetapan UKT      : " + golonganUkt);
        System.out.println("Status Beasiswa    : " + statusBeasiswa);
        System.out.println("--------------------------------------------------");
        System.out.println("Nominal UKT Dasar  : Rp " + nominalUktDasar);
        System.out.println("Total UKT Dibayar  : Rp " + totalUktAkhir);

        Denis.close();
    }
}
