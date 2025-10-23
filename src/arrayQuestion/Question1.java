package arrayQuestion;

/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilecek array sayısını belirleyiniz..");
        int boyut = scanner.nextInt();

        int[] sayilar = new int[boyut];
        int count = 0;

        do {
            if (count == boyut) {
                break;
            } else {

                System.out.println((count+1) + ". array  sayisi giriniz");
                sayilar[count] = scanner.nextInt();
                count++;

            }


        } while (true);

        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar[sayilar.length-1]);
        System.out.println(sayilar[0]);
        System.out.println("En büyük ve En küçük sayi arasındaki fark :  " + ((sayilar[sayilar.length-1]) - sayilar[0]));

    }
}
