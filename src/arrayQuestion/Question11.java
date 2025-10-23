package arrayQuestion;
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

public class Question11 {
    public static void main(String[] args) {
        int[][] arr1 = { {1,2}, {3,4,5}, {6} };
        int[][] arr2 = { {7,8,9}, {10,11}, {12} };
        int sum = 0;

        for (int[]  w : arr1) {
            for (int a : w) {
                sum = sum + a;
            }

        }
        System.out.println("sum = " + sum);
        for (int[]  w : arr2) {
            for (int a : w) {
                sum = sum + a;
            }

        }
        System.out.println("sum = " + sum);
    }
}
