class Vehicle{
    protected String car = "Mercedes";

    public void Honk(){
        System.out.println("Hornnn");
    }
}

class Car extends Vehicle{
    public void Move(){
        System.out.println("Moving its way out!");
    }
}


public class Inheritance {
    public static void main(String args[]){
        Car c = new Car();
        c.Honk();
        c.Move();
        System.out.println(c.car);
    }
}
