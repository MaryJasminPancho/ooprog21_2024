
public class prelim{
   public static void main(String[] args){
   
      int firstTerm = 0;
      int secondTerm = 1;
      int nextTerm;
      
      for(int i = 0; i <= 10; i++){
         System.out.printf("\nfibonacci(%d) --> %d", i, firstTerm);
         nextTerm = firstTerm + secondTerm;
         firstTerm = secondTerm;
         secondTerm = nextTerm;
      }       
   }
} 