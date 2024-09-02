import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numOfGuest;
        System.out.print("Enter the number of guests: ");  
        numOfGuest = sc.nextInt();
        sc.close();

        System.out.println("******************************************");
        System.out.println("*   Carly's makes the food that makes   *");
        System.out.println("*              it a party.               *");
        System.out.println("******************************************");

        System.out.println("Number of guests: " + numOfGuest);
        System.out.println("Price per guest: $35");

        double totalPrice = numOfGuest * 35;
        System.out.printf("Total Price: $%.2f", totalPrice);
        
        boolean isLargeEvent = numOfGuest >= 50;
        System.out.println("\nIs a large event: " + isLargeEvent);
     
    }
}
