public class While {
      public static void main(String args[]){
          int i = 0;
          while(i > 10){
              System.out.println(Math.pow(i, 3));
              i++;
          }
          System.out.println("Second loop");
          int j = 0;
          do{
            System.out.println(Math.pow(j, 3));
            j++;
          }while(j > 10);
      }
}

//continue and break keywords are used to skip a condition in a loop
//and simply jump out of the loop whenever the specified condition matches
//respectively.