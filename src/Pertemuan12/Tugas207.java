package Pertemuan12;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        int pilihan;
        do {
            System.out.println();
            System.out.println("========= KAFE KAMPUS =========");
            System.out.println("1. Lihat daftar menu");
            System.out.println("2. Cari menu");
            System.out.println("3. Buat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                System.out.println();
                System.out.println("------- DAFTAR MENU -------");
                for (int i = 0; i < menu.length; i++) {
                    System.out.printf("%d. %-16s Rp %,d%n", (i + 1), menu[i], harga[i]);
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan nama menu yang dicari: ");
                String cari = sc.nextLine().trim();

                int indeks = -1;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(cari)) {
                        indeks = i;
                        break;
                    }
                }

                if (indeks != -1) {
                    System.out.printf("Menu \"%s\" ditemukan, harga: Rp %,d%n", menu[indeks], harga[indeks]);
                } else {
                    System.out.println("Menu \"" + cari + "\" tidak tersedia.");
                }

            } else if (pilihan == 3) {
                int jumlah;
                do {
                    System.out.print("Jumlah item yang ingin dipesan: ");
                    jumlah = sc.nextInt();
                    sc.nextLine();
                    if (jumlah < 1) {
                        System.out.println("Jumlah item minimal 1!");
                    }
                } while (jumlah < 1);

                String[] pesanan = new String[jumlah];
                int[] hargaPesanan = new int[jumlah];
                int total = 0;

                for (int i = 0; i < jumlah; i++) {
                    int indeks;
                    do {
                        System.out.print("Nama menu pesanan ke-" + (i + 1) + ": ");
                        String nama = sc.nextLine().trim();

                        indeks = -1;
                        for (int j = 0; j < menu.length; j++) {
                            if (menu[j].equalsIgnoreCase(nama)) {
                                indeks = j;
                                break;
                            }
                        }

                        if (indeks == -1) {
                            System.out.println("Menu \"" + nama + "\" tidak tersedia, silakan ulangi!");
                        }
                    } while (indeks == -1);

                    pesanan[i] = menu[indeks];
                    hargaPesanan[i] = harga[indeks];
                    total += harga[indeks];
                }

                System.out.println();
                System.out.println("========== DAFTAR PESANAN ==========");
                System.out.printf("%-4s %-18s %13s%n", "No", "Menu", "Harga");
                System.out.println("-------------------------------------");
                for (int i = 0; i < jumlah; i++) {
                    String hargaTeks = String.format("Rp %,d", hargaPesanan[i]);
                    System.out.printf("%-4d %-18s %13s%n", (i + 1), pesanan[i], hargaTeks);
                }
                System.out.println("-------------------------------------");
                String totalTeks = String.format("Rp %,d", total);
                System.out.printf("%-23s %13s%n", "TOTAL BIAYA", totalTeks);

            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        System.out.println("Terima kasih telah berkunjung ke Kafe Kampus!");
        sc.close();
    }
}
