package arrayQuestion;

import java.util.Arrays;

/*  TASK :
 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
 * int istenenToplam=9;
 */
public class Question4 {
    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int[] output = new int[arr.length];
        int istenenToplam = 9;

        int index = 1;
        int ilkSayi = arr[0];
        int count = 1;

        do {
            for (int w : arr) {
                if (istenenToplam == (ilkSayi + w)) {
                    System.out.println("sayi : " + ilkSayi + " ve sayi : " + w);
                }
            }


            ilkSayi = arr[index];
            index++;
            count++;


        } while (count < (arr.length)  );


    }
}
