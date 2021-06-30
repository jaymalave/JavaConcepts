public class MethOver {

    //method overloading: two methods with same name, but different
    //functionalites according to the parameters passed
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }
    
    public static void main(String args[]){
         System.out.println("int " + plusMethod(4, 5));
         System.out.println("double " + plusMethod(4.30, 5.43));
    }
}
