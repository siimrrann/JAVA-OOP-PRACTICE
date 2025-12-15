import java.util.ArrayList;
import java.util.Scanner;

class Order{
    // int choice;
    int quantity;

    Order(int quantity){
        // this.choice = choice;
        this.quantity = quantity;
    }
}

public class ClassesAndObjects4 {
    public static void main(String[] args) {
        
        ArrayList<Order> orders = new ArrayList<>();
        int quantity;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose");
            System.out.println("1. Paneer Price: 250rs");
            System.out.println("2. Pasta Price: 300rs");
            System.out.println("3. Chicken Price: 500rs");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter quantity: ");
                    quantity = sc.nextInt();
                    sc.nextLine();
                    orders.add(new Order(quantity));
                    System.out.println("Your total bill is: "+ (1.1* quantity * 250));
                    break;

                case 2:
                    quantity = sc.nextInt();
                    sc.nextLine();
                    orders.add(new Order(quantity));
                    System.out.println("Your total bill is: "+ (1.1 * quantity * 300));
                    break;
                
                case 3:
                    quantity = sc.nextInt();
                    sc.nextLine();
                    orders.add(new Order(quantity));
                    System.out.println("Your total bill is: "+ (1.1 * quantity * 500));
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Invalid input choice");
            }
        }
    }
}
