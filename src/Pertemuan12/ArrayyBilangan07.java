//7 ; 7+8 ; −(1+(7 mod 7)) ; 20+(7 mod 15)
//7; 15; -1; 21; 

package Pertemuan12;

import java.util.Arrays;

public class ArrayyBilangan07 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 7;
        bil[1] = 15;
        bil[2] = -1;
        bil[3] = 21;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));

    }
}
