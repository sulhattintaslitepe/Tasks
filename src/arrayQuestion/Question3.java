package arrayQuestion;
/* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] input = {1,2,-3,4,-5,-6};
        int[] output = new int[input.length];
        int index = 0;

        for (int w : input) {
            if (w > 0 ) {
                output[index] = (-1) * w;
                index++;
            } else {
                output[index] = (-1) * w;
                index++;
            }
        }
        System.out.println("input : " + Arrays.toString(input));
        System.out.println("output : " + Arrays.toString(output));

    }
}
