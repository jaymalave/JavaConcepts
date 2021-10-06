import java.util.*;

public class JaggedExample{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Number of players: ");
         int n = sc.nextInt();
         //create a jagged array
         int a[][] = new int[n][];
         float sum[] = new float[n];
         float avg[] = new float[n];

         //accept the data from the user
         for(int i=0; i<n; i++){
            System.out.print("Number of matches played by player"+ (i+1)+" ");
            int m=sc.nextInt();
            a[i]=new int[m];
         }
        for(int i=0;i<n;i++){
            System.out.println("Enter the runs scored by player "+(i+1)+" in");
            for(int j=0;j<a[i].length;j++){
                    System.out.print("Match "+(j+1)+":");
                    a[i][j]=sc.nextInt();
                }
         }
         sc.close();
         //retrieve the operated data as an output
        System.out.println("Sum of the runs scored");
        for(int i=0;i<n;i++){
         for(int j=0;j<a[i].length;j++){
            sum[i]=sum[i]+a[i][j];
          }
        }
        for(int i=0;i<n;i++){
             avg[i]=sum[i]/a.length;
        }
        
        for(int i=0;i<n;i++){
           System.out.println("\nPlayer"+(i+1));
           for(int j=0;j<a[i].length;j++){
                System.out.println("Match"+(j+1)+" "+a[i][j]+"\t");
             }
            System.out.println("Total Runs are "+sum[i]+"\t");
            System.out.println("Average is "+avg[i]);
        }
    }
}