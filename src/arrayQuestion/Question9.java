package arrayQuestion;
/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        int[] input = {2,6,4,5,8,9};
        int[] output = new int[input.length];
        System.out.println("input = " + Arrays.toString(input));
        int index = 0;
        for (Integer w : input) {
            output[index] = (w*w);
            index++;
        }
        System.out.println("output = " + Arrays.toString(output));

    }
}
