 class Abc{
    public Abc(){
        System.out.println("This is a constructor");
    }

    public void xyz(){
        System.out.println("This is a normal method");
    }
}

public class Const{
    public static void main(String args[]){
        Abc obj = new Abc();
        obj.xyz();
    }
}
