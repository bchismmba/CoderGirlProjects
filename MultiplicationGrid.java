import java.util.Scanner;

public class MultiplicationGrid {
   public static void main(String[] args) {
       //initialize variables
       Scanner keyboard = new Scanner(System.in);
       int size;

       System.out.println("Welcome to Multiplication Tables\n");
       System.out.println("How large would you like to see them?");

       size = keyboard.nextInt();
       while (size > 20 || size < 1) {
           System.out.println("Please enter a number between 1-20.");
           size = keyboard.nextInt();

       }
       System.out.print("n");

       System.out.printf("  ");

       for (int row = 0; row <= size; row++) {
           System.out.printf("%4d", row);
       }
       System.out.print("\n");

        for(int row = 0; row <= size; row++){
            System.out.printf("%2d", row);


            for(int col = 0; col <=size;col++){

                //System.out.print(row*col+" ");
                System.out.printf("%4d", (row*col));

                //if the result is 0-9 print 3 spaces followed by the result
                //if the result is 10-99 print 2 spaces followed by the result
                //if the result is greater than 100 print 1 space followed by the result
                //use if then else else

            }
            System.out.print("\n");
        }


    }
}
