import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Ascending order
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
        } 
        else if (num1 <= num3 && num3 <= num2) {
            System.out.println("Ascending order: " + num1 + " " + num3 + " " + num2);
        } 
        else if (num2 <= num1 && num1 <= num3) {
            System.out.println("Ascending order: " + num2 + " " + num1 + " " + num3);
        } 
        else if (num2 <= num3 && num3 <= num1) {
            System.out.println("Ascending order: " + num2 + " " + num3 + " " + num1);
        } 
        else if (num3 <= num1 && num1 <= num2) {
            System.out.println("Ascending order: " + num3 + " " + num1 + " " + num2);
        } 
        else {
            System.out.println("Ascending order: " + num3 + " " + num2 + " " + num1);
        }

        // Descending order
        if (num1 >= num2 && num2 >= num3) {
            System.out.println("Descending order: " + num1 + " " + num2 + " " + num3);
        } 
        else if (num1 >= num3 && num3 >= num2) {
            System.out.println("Descending order: " + num1 + " " + num3 + " " + num2);
        } 
        else if (num2 >= num1 && num1 >= num3) {
            System.out.println("Descending order: " + num2 + " " + num1 + " " + num3);
        } 
        else if (num2 >= num3 && num3 >= num1) {
            System.out.println("Descending order: " + num2 + " " + num3 + " " + num1);
        } 
        else if (num3 >= num1 && num1 >= num2) {
            System.out.println("Descending order: " + num3 + " " + num1 + " " + num2);
        } 
        else {
            System.out.println("Descending order: " + num3 + " " + num2 + " " + num1);
        }
        
    }

}

