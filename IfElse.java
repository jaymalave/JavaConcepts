public class IfElse {
    public static void main(String[] args){
           int localTime = 28;

           if(localTime > 18){
               System.out.println("Good Eve!");
           }                                    //we can also add 'else if' here.
           else {
               System.out.println("Good morning!");
           }

           //Short Hand (Ternay Operating)
    
          String wish = (localTime > 18) ? "Good eve!" : "Good Morning";
          System.out.println(wish);


    }
}
