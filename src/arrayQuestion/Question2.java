package arrayQuestion;

/* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[][] input = {{10,20,30},{4},{6,7,20}};
        int output[] = new int[input.length];
        int index = 0;
        int sum = 0;

        for (int[] w : input) {
            sum = 0;
            for (int a : w) {
                sum = sum + a;
            }
            output[index] =sum;
            index++;
        }
        System.out.println("Output Array : " + Arrays.toString(output));

    }
}
