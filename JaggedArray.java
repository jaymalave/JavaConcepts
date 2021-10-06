 public class JaggedArray{

    public static void main(String args[]){

        int a[][] = new int[2][];

        a[0] = new int[5];
        a[1] = new int[7];

        int data = 15; 
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = data++;
            }
        }
        System.out.println("Displaying the jagged array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();

    }
  }
}
