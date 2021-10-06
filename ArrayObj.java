import java.util.*;

public class ArrayObj {
    static Customer customers[];
     public static void main(String args[]){
        
     System.out.println("Enter the number of customers");
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     customers = new Customer[n];
     int i = 0;
     while(i < n){
         System.out.println("Enter your account id");
         int acc_id = sc.nextInt();
         System.out.println("Enter your name");
         sc.nextLine();
         String name = sc.nextLine();
         System.out.println("Enter your balance");
         int balance = sc.nextInt();
         customers[i] = Customer(acc_id, name, balance);
         i++;
     }
     viewCustomers();
     System.out.println("Enter id of the customer you want to delete: ");
     int del_id = sc.nextInt();
     deleteCustomer(del_id);
     System.out.println("Enter id of the customer you want to view: ");
     int acc_id = sc.nextInt();
     viewCustomer(acc_id);
    }

    
    private static ArrayObj.Customer Customer(int acc_id, String name, int balance) {
        return null;
    }

    public static void deleteCustomer(int id){
       for (int i = 0; i < customers.length; i++) {
           if (customers[i] != null && customers[i].getAccount_id() == id){
               customers[i] = null;
             break; 
           }
    }
}
    public static void viewCustomer(int id){
       for (int i = 0; i < customers.length; i++) {
           if (customers[i] != null && customers[i].getAccount_id() == id){
            System.out.println("Account id: " + customers[i].getAccount_id());
            System.out.println("Name: " + customers[i].getName());
            System.out.println("Balance: " + customers[i].getBalance());
             break; 
           }
    }
}
public static void viewCustomers(){
    for (int i = 0; i < customers.length; i++){
       System.out.println("Account id: " + customers[i].getAccount_id());
       System.out.println("Name: " + customers[i].getName());
       System.out.println("Balance: " + customers[i].getBalance());
    }
}
    class Customer {
    public int account_id;
    public String name;
    public int balance;

    Customer(int account_id, String name, int balance){
          this.account_id = account_id;
          this.name = name;
          this.balance = balance;
    }
    public int getAccount_id() {
        return account_id;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    }
}
