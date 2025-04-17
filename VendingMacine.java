import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        
        if(choice >= 0 && choice < menu.length){
            System.out.println(menu[choice]);
        }else{
            System.out.println("invalid");
        }
    }
}
