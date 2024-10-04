import java.util.Scanner;

public class TestBloodData {
   public static void main(String[] a) {
      Scanner sc = new Scanner(System.in);
      
      BloodData bloodData = new BloodData();
      
      System.out.print("Enter Blood Type: ");
      String bloodtype = sc.nextLine();
      bloodData.setBlood(bloodtype);
      System.out.print("Enter Rh Factor: ");
      String rhFactor = sc.nextLine();
      bloodData.setRH(rhFactor);
      
      bloodData.displayBloodInfo();
   }
}