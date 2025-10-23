package arrayQuestion;
 /*Aşağıdaki mutli dimensional array'lerin iç array'lerinde
         aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
         arr1[]={{1,2},{3,4,5}{6}}
         arr2[]={{7,8,9},{10,11},{12}}
        */

import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4,5},{6}};
        int[][] arr2 = {{7,8,9},{10,11},{12}};
        int outherLoopLengt = Math.max(arr2.length,arr1.length);
        int[] output = new int[arr1.length];

        for (int i = 0; i < outherLoopLengt; i++) {

            int[] inner1 =  (i < arr1[i].length) ? arr1[i] : new int[0];
            int[] inner2 =  (i < arr2[i].length) ? arr2[i] : new int[0];

            int innerLoopLengt = Math.max(arr2[i].length,arr1[i].length);

            System.out.print("arr[" + i + "] toplamları: [");
            for (int j = 0; j < innerLoopLengt; j++) {
                int val1 = (j < inner1.length ) ? inner1[j] : 0;
                int val2 = (j < inner2.length ) ? inner2[j] : 0;

                System.out.print((val1+val2) + ", ");

            }
            System.out.println("]");

        }
       // System.out.println(Arrays.toString(output));

    }
}
