import java.util.*;

public class Recursive {
      public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       sc.close();
       System.out.println(factorial(x));
      }
      static int factorial(int num){
           if (num == 1){
               return 1;
           }
           else {
               return num*factorial(--num);
           }
      }
}
