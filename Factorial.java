import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int x = sc.nextInt();
       int fact = 1;
       sc.close();
       for(int i = 1; i <= x; i++){
           fact *= i;
       }
       System.out.println(fact);
    }
}
