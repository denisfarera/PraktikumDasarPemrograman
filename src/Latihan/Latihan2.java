package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, member;
        int Studio;
        System.out.println("=== PEMESANAN TIKET ===");
        System.out.println("Pilih Studio Anda (1.Regular 2.VIP):");
        Studio = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan Hari (Weekend, Weekday):");
        hari = sc.nextLine();

        System.out.println("Apakah kamu memiliki member?");
        member = sc.nextLine();

        switch (Studio) {
            case 1:
                if (hari.equalsIgnoreCase("Weekend")) {
                    if (member.equalsIgnoreCase("ya")) {
                        System.out.print("Harga tiket anda Rp.40.000");
                    } else {
                        System.out.print("Harga tiket anda Rp.50.000");
                    }
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    if (member.equalsIgnoreCase("ya")) {
                        System.out.print("Harga tiket anda Rp.30.000");
                    } else {
                        System.out.print("Harga tiket anda Rp.35.000");
                    }
                } else {
                    System.out.print("hari tidak ada wok");
                }
                break;

            case 2:
                if (hari.equalsIgnoreCase("weekend")) {
                    if (member.equalsIgnoreCase("ya")) {
                        System.out.print("Harga tiket anda Rp.75.000");
                    } else {
                        System.out.print("Harga tiket anda Rp.90.000");
                    }
                } else if (hari.equalsIgnoreCase("Weekday")) {
                    if (member.equalsIgnoreCase("ya")) {
                        System.out.print("Harga tiket anda Rp.60.000");
                    } else {
                        System.out.print("Harga tiket anda 70.000");
                    }
                } else {
                    System.out.print("hari tidak ada wok");
                }
            default:
                break;
        }
        sc.close();
    }
}
