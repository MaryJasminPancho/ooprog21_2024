public class Billing {

   private static double tax = 0.08;
   
   public static void main(String[] args) {
      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(40.45, 2, 10);
   }
   
   static void computeBill(double price) {    
      double total = (price * tax) + price;
      System.out.println("The total price for the bill is: $" + total);
   }
   
   static void computeBill(double price, int quantity) {    
      double subtotal = price * quantity;
      double total = subtotal + (subtotal * tax);
      System.out.println("The total price for the bill is: $" + total);
   }
   
   static void computeBill(double price, int quantity, int discount) {      
      double subtotal = (price * quantity) - discount;
      double total = subtotal + (subtotal * tax);
      System.out.println("The total price for the bill is: $" + total);
   }
}