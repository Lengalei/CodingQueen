import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
       // Reading input from user
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();

       // Creating and setting customer object
       Customer customer = new Customer();
       customer.firstName = firstName;
       customer.secondName = secondName;
       customer.age = age;
       customer.roomNumber = roomNumber;

       // Save and print customer info
       customer.saveCustomerInfo();
   }
}

class Customer {
   // Attributes
   String firstName;
   String secondName;
   int age;
   int roomNumber;

   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}
