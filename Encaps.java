class Encap{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Encaps{
    
    public static void main(String args[]){
        Encap obj = new Encap();
        obj.setName("Jay");
        System.out.println(obj.getName());
    }
}