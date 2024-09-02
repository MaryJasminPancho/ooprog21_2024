import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MINUTES;
        System.out.print("Enter minutes: ");  
        MINUTES = sc.nextInt();
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun.   S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        int HOURS = MINUTES / 60;    
        int extraMin = MINUTES % 60;
        double totalPrice = (40 * HOURS) + extraMin;
        
        System.out.println("Hours  : " + HOURS);
        System.out.println("Minutes: " + extraMin);
        System.out.printf("Total price: $%.2f", totalPrice);
        sc.close();
    }
}