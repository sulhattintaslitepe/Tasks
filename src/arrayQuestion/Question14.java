package arrayQuestion;
/*  TASK :
 * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
 * alin.
 * input : Congratulations
 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

 */


import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        String input = "Congratulations";
        String[] output = input.split("");
        char[] inputArr = input.toCharArray();
        System.out.println(Arrays.toString(output));
        String[] reserve = new String[output.length];
        String newString = "";
        int index = 0;
        for (int i = output.length-1; i >= 0; i--) {
            reserve[index] = output[i];
            if (output[i].contains("a") || output[i].contains("u") || output[i].contains("o")) {
                newString = newString + "i";
            } else {
                newString = newString + output[i];
            }
            index++;
        }

        System.out.println(Arrays.toString(reserve));
        System.out.println(newString);


    }
}
