interface Inter {
    public void methodOne();
}

class Impl implements Inter{
    public void methodOne(){
        System.out.println("This is an implemented method");
    }
}

public class Interface{
    public static void main(String args[]){
        Impl obj = new Impl();
        obj.methodOne();
    }
}