package Pertemuan7;

import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, kurang;
        String pesan;

        System.out.print("Masukkan nama\t\t\t\t\t\t : ");
        nama = Denis.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya)\t : ");
        jenisKegiatan = Denis.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen\t\t\t\t\t\t : ");
            jumlahDokumen = Denis.nextInt();
            System.out.print("Juara\t\t\t\t\t\t\t : ");
            peringkatJuara = Denis.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen < 4) {
                    kurang = 4 - jumlahDokumen;
                    pesan = "Status : Dokumen tidak lengkap (kurang " + kurang
                            + "dokumen) dana pernghargaan tidak diberikan";
                } else {
                    pesan = "Status : Dokumen lengkap. Dana penghargaan diberikan.";
                }
            } else {
                pesan = "Status : Dana penghargaan tidak diberikan.";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen\t\t\t\t\t\t : ");
            jumlahDokumen = Denis.nextInt();
            System.out.print("Jumlah juara\t\t\t\t\t\t : ");
            peringkatJuara = Denis.nextInt();
            if (peringkatJuara == 1) {
                if (jumlahDokumen < 4) {
                    kurang = 4 - jumlahDokumen;
                    pesan = "Status : Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen) dana penghargaan tidak diberikan";
                } else {
                    pesan = "Status : Dokumen lengkap, dana diberikan.";
                }
            } else {
                pesan = "Status : Bukan juara. Dana penghargaan tidak diberikan";
            }
        } else {
            pesan = "Status : Tidak ada kegiatan";
        }
        System.out.println(pesan);

        Denis.close();
    }
}
