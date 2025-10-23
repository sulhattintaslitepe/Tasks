package arrayQuestion;
/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        int dolar = 0;
        int euro = 0 ;
        for (String w : kelimeler) {
            if (w.contains("$")){
                String dolarKelime = w.replace("$","");
                dolar += Integer.parseInt(dolarKelime);

            }
            if (w.contains("£")){
                String euroKelime = w.replace("£","");
                euro += Integer.parseInt(euroKelime);

            }
        }
        System.out.println("toplam dolar = " + dolar);
        System.out.println("toplam euro = " + euro);


    }
}
