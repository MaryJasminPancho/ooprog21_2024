import java.util.Scanner;

public class Billing {
   public static void main(String[] a) {
      Scanner sc = new Scanner(System.in);
      double tax = 0.08;
      
      System.out.print("Enter price: ");
      double price = sc.nextDouble();
      System.out.print("Enter quantity: ");
      int quantity = sc.nextInt();
      System.out.print("Enter discount: ");
      int discount = sc.nextInt();

      
      /*computeBill(totalBill);
      computeBill(totalBill);
      computeBill(totalBill);*/
   }
   
   public static double computeBill(double price, int quantity, int discount) {

      return (price * tax) + price;
   }  
   
   public static double computeBill(double price, int quantity, int discount) {
     
      return ((price * quantity) * tax);
   } 
   
   public static double computeBill(double price, int quantity, int discount) {
      
      return ((price * quantity) * tax) - (discount/100);
   }
}