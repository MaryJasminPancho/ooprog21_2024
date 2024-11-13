/* 
Mary Jasmin S. Pancho
BSIT 2A
*/

import java.util.Scanner;

public class SpoonerismGenerator {
   
   public static void main(String[] a) {
      Scanner scan = new Scanner(System.in);
      SpoonerismGenerator generator = new SpoonerismGenerator();
      generator.run();
   }
   
   public void run(){
      String spoonWord1 = new String();
      String spoonWord2 = new String();
      String outputLine = new String();
   
      String word1 = getWord("first ");
      String word2 = getWord("second ");
      
      int vowelIndex1 = vowelIndex(word1);
      int vowelIndex2 = vowelIndex(word2);
      
      if(vowelIndex1 > 0 && vowelIndex2 > 0){

         spoonWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
         spoonWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);
         
         outputLine = word1 + " and " + word2 + " spoonerized are ";
         outputLine += spoonWord1 + " " + spoonWord2;
      }
      else{
         outputLine = word1 + " and " + word2 + " are not good words to spoonerize.";
      }
      System.out.print(outputLine);      
   }
   
   public static String getWord(String position) {
      Scanner scan = new Scanner(System.in);
      String word = new String();
      System.out.print("Enter " + position + "word: ");
      word = scan.nextLine();
      return word;
   }
   
   public int vowelIndex(String inputStrng) {
      char ch;
      int i;
      
      inputStrng = inputStrng.toLowerCase();
      for(i = 0; i < inputStrng.length(); i++){
         ch = inputStrng.charAt(i);
         
         if(i > 0 && ch == 'y'){
            break;
         }
         else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            break;
         }
      }
      
      return i;
   } 
}