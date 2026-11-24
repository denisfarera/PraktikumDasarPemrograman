//7 ; 7+8 ; −(1+(7 mod 7)) ; 20+(7 mod 15)
//7; 15; -1; 27; 

package Pertemuan12;

import java.util.Arrays;

public class ArrayyBilangan07 {
    public static void main(String[] args) {
        int[] bil = {7, 15, -1, 27};
        
        for (int i = 0; i <=4; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));

    }
}
