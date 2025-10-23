package arrayQuestion;
  /*TASK :
  	write a java program to find the second largest number in the array?
  	Maximum and minimum number in the array?
  	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
  	bulmak için bir java programi yazin)

  	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

  	*/

public class Question6 {
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -95, 845, 8787, 898, 0, 1, -90,100002 };
        int enBuyuk = arr[0];
        int enKucuk = arr[0];

        for (int w : arr ) {
            enBuyuk = Math.max(enBuyuk,w);
            enKucuk = Math.min(enKucuk,w);
        }
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);
        int ikinciBuyuk = arr[0];
        for (int w : arr) {
            if (w > ikinciBuyuk && w < enBuyuk){
                ikinciBuyuk = w ;
            }
        }
        System.out.println("ikinciBuyuk = " + ikinciBuyuk);
    }
}
