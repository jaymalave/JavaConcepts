import java.util.*;

public class Sincos{
    static final double PI = 3.142;

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");

        double x = sc.nextDouble();
        x = x * (PI / 180.0);

        System.out.print("Enter the value of n: ");

        double n = sc.nextDouble();
        double cosine= cosX(x, n);
        double sine = sinX(x,n);


        System.out.println("Enter the values of p and q for power");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        double pow = power(p, q);

        System.out.println("Enter the value of f for factorial");
        double f = sc.nextDouble();
        double fact = fact(f);

        sc.close();

        System.out.println("The sinx value is"+ sine);
        System.out.println("The cosx value is"+ cosine);
        System.out.println(pow);
        System.out.println(fact);

    }

    static double cosX(double x, double n)
    {
        double ans=0;
        int c=0;
        for (int i = 1; i < n; i++)
        {
            if(i%2==1)
                ans= ans+ (power(x,c)/fact(c));
            else
                ans= ans- (power(x,c)/fact(c));
            c= c+2;
        }
        return ans;
    }
    static double sinX(double x, double n)
    {
        double ans=0;
        int c=1;
        for (int i = 1; i < n; i++)
        {
            if(i%2==1)
                ans= ans+ (power(x,c)/fact(c));
            else
                ans= ans- (power(x,c)/fact(c));
            c= c+2;
        }
        return ans;
    }

    static double fact(double c)
    {
        double factorial=1;
        for(int i = 1; i <= c; ++i)
        {
            factorial *= i;
        }
        return factorial;
    }

    static double power(double x, double c)
    {
        double power=1;
        for (int i = 1; i <= c; i++)

            power = power * x;
        return power;
    }
}
