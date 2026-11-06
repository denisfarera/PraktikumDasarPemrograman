package Pertemuan3;
import  java.util.Scanner;

public class ContohOperator02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 10;
        System.out.println("x++ = "+ x++);
        System.out.println("Setelah evaluasi, x = ");
        x = 10;
        System.out.println("++x =" + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println("x > y || y == x && y <= x");
        int z = x ^ y;
        System.out.println("Hasil x ^ adalah" + z);
        z %= 2;
        System.out.println("Hasil akhir" + z);

        sc.close();
    }
}
