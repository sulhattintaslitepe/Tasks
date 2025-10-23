package arrayQuestion;
/*  TASK :
 * write a java program that calculates the average value of array elements
 * Print elements that are greater than avarage
 * (dizi elemanlarinin ortalama degerini hesaplayan ve
 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
 * input[]= {1,2,3,4,5,6,7}
 * Output : 4
 */

import java.util.Arrays;
import java.util.Collections;

public class Question5 {
    public static void main(String[] args) {
        int input[]= {1,2,3,4,5,6,7};
        int sum = 0;
        int average ;
        Arrays.sort(input);
        for (int w : input) {
            sum = sum + w;

        }
        average = sum / input.length;
        System.out.println("average = " + average);
        for (int w : input) {
            if (average < w )
                System.out.print(w + ", ");
        }

    }
}
