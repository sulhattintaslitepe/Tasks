package arrayQuestion;
 /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

import java.util.Arrays;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int count = 0;
        int[] arr = new int[8];
        do {
            System.out.println((index+1) + " . sayiyi giriniz");
            arr[index] = scanner.nextInt();
            if (arr[index] % 3 == 0){
                count++;
            }
            index++;
            if (index > 7) {
                break;
            }


        } while (true);
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.print("3'e bölünebilen sayiların sayisi : " + count);

    }
}
