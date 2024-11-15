import java.util.Scanner;

public class Palindrome{
   public static void main(String[] a){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String inputStr = scan.nextLine();
      
      if(isPalindrome(inputStr)){
         System.out.println("This is a palindrome.");
      }
      else{
         System.out.println("This is not a palindrome.");
      }
      
   }
   public static boolean isPalindrome(String str){
      str = str.toLowerCase();
      
      int left = 0;
      int right = str.length() - 1;
      
      while(left < right){
         if(str.charAt(left) != str.charAt(right)){
            return false;
         }
         left++;
         right--;
      }
      return true;
   }
}