package arrayQuestion;
/*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        String str = "GayetBasarılı";
        String  newBegin = "coook";

        int indexOflast = str.indexOf("Basarılı");

        String lastPart = str.substring(indexOflast);
        System.out.println(lastPart);

        char[] bas = newBegin.toCharArray();
        char[] son = lastPart.toCharArray();

        char[] yeni = new char[bas.length + son.length];

        System.arraycopy(bas,0,yeni,0,indexOflast);
        System.arraycopy(son,0,yeni,indexOflast,lastPart.length());

        System.out.println(Arrays.toString(yeni));

        String newString = new String(yeni);
        System.out.println(newString);



    }
}
