 class Animal {
    public void sound(){
        System.out.println("This is an animal");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("This is a dog");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("This is a cat");
    }
}

public class Polymorph{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.sound();
        d.sound();
        c.sound();
    }
}
