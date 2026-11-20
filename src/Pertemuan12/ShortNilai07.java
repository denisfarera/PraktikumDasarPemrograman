package Pertemuan12;

import java.util.Arrays;

public class ShortNilai07 {
    public static void main(String[] args) {

        int[] nilai = { 22, 37, 14, 52, 2, 27 };
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp; 
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}