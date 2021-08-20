import java.util.Scanner;

public class RecGCD {

   public static int findGCD(int n1, int n2){
       if(n2 != 0){
           return findGCD(n2, n1%n2);
       }else{
           return n1;
       }
   }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = findGCD(x, y);
        System.out.println(result);
        sc.close();
    }
}




