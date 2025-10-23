package arrayQuestion;
 /*Aşağıdaki mutli dimensional array'lerin iç array'lerinde
         aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
         arr1[]={{1,2},{3,4,5}{6}}
         arr2[]={{7,8,9},{10,11},{12}}
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4,5},{6}};
        int[][] arr2 = {{7,8,9},{10,11},{12}};

        List<Integer> sums = new ArrayList<>();

        int maxArrayLanght = Math.min(arr1.length,arr2.length);

        for (int i = 0; i < maxArrayLanght; i++) {

            int[] innerArr1 = arr1[i];
            int[] innerArr2 = arr2[i];


            int minArrayLanght = Math.min(innerArr1.length,innerArr2.length);

            for (int j = 0; j < minArrayLanght ; j++) {

                int sum = innerArr1[j] + innerArr2[j];

                sums.add(sum);

            }

        }

        System.out.println(sums);



    }
}
