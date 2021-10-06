import java.util.*;

class Dogs{
	public String d_name;
	public int d_id;
	public boolean d_isStray;
	Dogs(String name, int id, boolean isStray){
		d_name = name;
		d_id = id;
		d_isStray = isStray;
	}
}


public class VectorClass {
    
    public static void main(String args[]){
             Vector<Dogs> Kennel = new Vector<Dogs>();
             Kennel.add(new Dogs("Tom", 1, false));
             Kennel.add(new Dogs("Bravo", 2, true));
             Kennel.add(new Dogs("Corey", 3, false));
             Kennel.add(new Dogs("Mat", 4, true));
             String dog_to_search = "Corey";
             String dog_to_remove = "Mat";
             int new_dog_id = 5;
             String new_dog_name = "Sam";
             boolean new_dog_isStray = true;
             
             Kennel.addElement(new Dogs(new_dog_name, new_dog_id, new_dog_isStray));
             
             Kennel.add(1, new Dogs("Chris", 6, false));

             for(int i = 0; i < Kennel.size(); i++) {
            	 Dogs check = Kennel.get(i);
            	 if(dog_to_remove.equals(check.d_name)) {
            		 Kennel.remove(i);
            	 } 	 
            	 //array index out of range error after this
            	 //create a separate function for this
            	 String req_name = Kennel.get(i).d_name;
            	 int req_id = Kennel.get(i).d_id;
            	 boolean req_isStray = Kennel.get(i).d_isStray;
            	 System.out.println(req_name + req_id + req_isStray);
            	 
            	 if(dog_to_search.equals(check.d_name)){
            		 System.out.println("Corey is there");
            	 }
            	 
             }
    }
}
