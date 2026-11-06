/*
p = 7
Harga tiket kode 1 = 35000 + 1 * 5000 = 40000
Harga tiket kode 2 = 60000 + 1 * 5000 = 65000
Harga tiket kode 3 = 25000 + 1 * 5000 = 30000
T1 = 6 + 2 = 8
T2 = 15 + 2 = 17

*/

package UTS;

import java.util.Scanner;

public class TamanRekreasi_07 {
    public static void main(String[] args) {
        Scanner Denis = new Scanner(System.in);

        int kodeTiket,kodeLayanan, biayaDasar, jumlahTiket, hargaTiket = 0, T1, T2 ;
        String layanan, statusMember;
        double diskon = 0, totalBayar, potongan;

        System.out.println("Layanan");
        System.out.println("1. Reguler");
        System.out.println("2. Terusan");
        System.out.println("3. Pelajar");
        System.out.println("Masukkan kode tiket : ");
        kodeTiket = Denis.nextInt();
        System.out.println("Masukkan jumlah tiket : ");
        jumlahTiket = Denis.nextInt();

        switch (kodeTiket) {
            case 1:
                layanan = "Reguler";
                hargaTiket = 40000;
                diskon = 0;
                if (jumlahTiket <= 8) {
                    potongan = 0;
                } else {
                    potongan = 0.17;
                }
                break;
            case 2:
                layanan = "Terusan";
                hargaTiket = 65000;
                diskon = 0;
                if (jumlahTiket <= 8) {
                    potongan = 0;
                } else {
                    potongan = 0.17;
                }
                break;
            case 3:
                layanan = "Pelajar";
                diskon = 0;
                if (jumlahTiket <= 8) {
                    potongan = 0;
                } else {
                    potongan = 0.17;
                }
                hargaTiket = 30000;
                break;
            default:
                System.out.println("kode tidak dikenal");
                break;
        }

        biayaDasar = hargaTiket * jumlahTiket;
        totalBayar = biayaDasar * diskon;
        System.out.println("layanan" + kodeTiket);
        System.out.println("biaya dasar: " + biayaDasar);
        System.out.println("diskon : " +diskon);
        System.out.println("total bayar : " +totalBayar);
    }
}
/*
Layanan
1. Reguler
2. Terusan
3. Pelajar
Masukkan kode tiket : 
1
Masukkan jumlah tiket : 
6
layanan1
biaya dasar: 240000
diskon : 0.0
total bayar : 0.0
 */