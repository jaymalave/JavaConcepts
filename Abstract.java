abstract class Bike{
    public abstract void ride();
}

class Tiger extends Bike{
    public void ride(){
        System.out.println("This is a defined method");
    }
}


public class Abstract {
    public static void main(String args[]){
      Tiger obj = new Tiger();
      obj.ride();
    }
}
