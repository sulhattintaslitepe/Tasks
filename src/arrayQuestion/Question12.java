package arrayQuestion;
/* Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
         ve yeni array’i ekrana yazdıran bir program yazınız
         Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}
 */

import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {
        int[][] input = { {1,2,3}, {4,5}, {6,7} };
        int sum = 0;
        int index =0;
        int[] output = new int[3];
        for (int[] w : input) {
            sum= 0;
            for (int a : w) {
                sum = sum +a;
            }
            output[index] = sum;
            index++;
        }
        System.out.println("output = " + Arrays.toString(output));

    }
}
