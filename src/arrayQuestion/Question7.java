package arrayQuestion;
/* TASK :
 * write a method that accepts a 2 dimensional array and finds the max value
 * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
 * Input : {{1,2,-3},{41,55},{-61,-17,80}}
 * Output : 80
 */

public class Question7 {
    public static void main(String[] args) {
        int[][] input = {{1,2,-3},{41,55},{-61,-17,80}};
        int max = input[0][0];
        int min = input[0][0];

        for (int[] w : input) {
            for (int a : w) {
                max = Math.max(max,a);
                min = Math.min(min,a);
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
