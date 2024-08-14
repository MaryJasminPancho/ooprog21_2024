public class Triangle {
    public static void main(String[] args) {
        int column = 7;

        for(int i = 0; i < column; i++){
            int spaces = column - i - 1;

            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print("T ");
            }
            System.out.println();
        }
    }
}
