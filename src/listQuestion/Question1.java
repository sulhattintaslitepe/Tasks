package listQuestion;

/* TASK :

 * Input olarak verilen listteki isimlerden
 * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
 *
 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
 * OUTPUT : [Veli,Omer]
 */

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        String[] list1={"Ali","Veli","Ayse","Fatma","Omer"};
        List<String> input = new ArrayList<>();
        input.addAll(0,List.of(list1));
        System.out.println(input);

        for (int i = 0; i < input.size(); i++) {

            if (input.get(i).contains("a") || input.get(i).contains("A") ) {
                input.remove(i);
            }

        }
        System.out.println(input);






    }
}
