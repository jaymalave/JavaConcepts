import java.util.Scanner;

public class RectangleArea{
 
     
     public static void main(String args[]){
   
      Rectangle r1 = new Rectangle();

      Scanner sc = new Scanner(System.in);
      System.out.println("value of y");
      float x = sc.nextFloat();

     System.out.println("value of x");
      float y = sc.nextFloat();
      
      sc.close();
     r1.getData(x, y);

     System.out.println(r1.computeArea());
    }
}

class Rectangle{
   float length;
   float breadth;
    
    void getData(float a, float b){
        length = a;
        breadth  = b;
}

    float computeArea(){
       return length * breadth;
   }
}

