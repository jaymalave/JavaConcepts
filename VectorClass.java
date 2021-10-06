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

             for(int i = 0; i < Kennel.size(); i++) {
            	 String req_name = Kennel.get(i).d_name;
            	 int req_id = Kennel.get(i).d_id;
            	 boolean req_isStray = Kennel.get(i).d_isStray;
            	 System.out.println(req_name + req_id + req_isStray);
             }
    }
}
