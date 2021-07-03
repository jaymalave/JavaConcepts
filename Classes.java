public class Classes {
     int x = 5;

     public void publicMethod(){
         System.out.println("This is a public method");
     }
     static void staticMethod(){
         System.out.println("This is a static method");
     }


     public static void main(String args[]){
         Classes obj = new Classes();
         System.out.println(obj.x);
         //public method cannot be called directly, it needs to be
         //called through an object of the class
         //static method can be called directly
         obj.publicMethod();
         staticMethod();
     }
}
