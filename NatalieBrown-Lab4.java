
/**
 * Write a description of class Lab4 here.
 * 
 * @author (Natalie Brown) 
 * @version (1/26/18)
 */
import java.util.Scanner;
import java.lang.*;

public class Lab4 {

    /**
     * main method (driver) to execute all the method calls properly
     *
     * @param args
     */
    public static void main(String[] args) {

        // Call all methods here
        // countGrains();
        // powerOfTwo();
        // numBackward();
        // straightLine();
        // boxMaker();
        // shape7a();
        // shape7b();

    }


    /**
     * Calculates the number of grains and prints out the result per lab instructions
     */
    public static void countGrains() {

        // declare and initialize your variables first, if any
        double grainsOfRice;
        double day;
        for(grainsOfRice = 1.0, day = 1.0; day <= 64.0; grainsOfRice = (grainsOfRice * 2.0), day++){
                System.out.println("Day " + day + " and you got " + grainsOfRice + " grain(s) of rice for a total of " + (grainsOfRice + (grainsOfRice - 1)));
        }
        // once loop reaches 32, the grainsOfRice can no longer compute when stated as an int

    }

    /**
     * Determines if a number is power of 2 and displays result per lab instructions
     * @param numberInput
     */
    public static void powerOfTwo (int numberInput) {

        // declare and initialize your variables first, if any then start writing your code
        // use what we learned in branching exercise if/else statements
        Scanner in = new Scanner(System.in);
        numberInput = in.nextInt();
        int result = numberInput;  
        int exponent = 0;
        while ((result%2 == 0) && result > 1){
            result = result / 2;
            exponent++;
        }
        if (result > 1) {
            System.out.println(numberInput + " is not a power of 2");
        } else{
            System.out.println(numberInput + " is 2 to the power of " + exponent);
        }

    }

    /**
     * Reverses the digits of a given integer, i.e. 12345 would become 54321 per lab instructions
     *
     * @param number
     */
    public static void numBackward(int number) {

       // declare and initialize your variables first, if any then start writing your code
       Scanner in = new Scanner(System.in);
       number = in.nextInt();
       int originalNumber = number; 
       int reverseNumber = 0;
       int a = 0;
       while (originalNumber > 0){
           a = originalNumber % 10;
           originalNumber = originalNumber / 10;
           reverseNumber = reverseNumber * 10 + a;
        }
       if (reverseNumber == number){
           System.out.println("backward: " + reverseNumber + ", palindrome!");
        } else{
           System.out.println("backward: " + reverseNumber + ", not palindrome!");
        }

    }

    /**
     * Produces and displays a straight line using asterisks per lab instructions
     */

    public static void straightLine() {

       // declare and initialize your variables first, if any then start writing your code
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int i;
       int j;
       for (i = 0; i < size; i++){
           for (j = 0; j < size; j++){
               System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * void method that asks the user for an integer x (using Scanner), and prints box using asterisks
     * refer to detailed instructions in lab description part 6
     */

    public static void boxMaker() {

       // declare and initialize your variables first, if any then start writing your code
       Scanner in = new Scanner(System.in);
       int boxSize = in.nextInt();
       int a;
       int b; 
       for (a = 0; a < boxSize; a++){
           if ((a == 0) || (a == boxSize - 1)){
               for (b = 0; b < boxSize; b++){
                   System.out.print("*");
                }
            } else{
                for (b = 0; b < boxSize; b++){ 
                    if ((b == 0) || (b == boxSize-1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } 
            System.out.println();
        }

    }

    /**
     *  void method to print a shape that is a triangular pattern with sides of 6 asterisks
     *  refer to detailed instructions in lab description part 7a
     */

    public static void shape7a(int number) {

       // declare and initialize your variables first, if any then start writing your code
       Scanner in = new Scanner(System.in);
       System.out.println("Type in an integer: ");
       number = in.nextInt();
       int row;
       int i;
       int j;
       for (row = 0; row < number; row++){
           for (i = 0; i < row; i++){
               System.out.print(".");
            }
           for (j = 0; j < (number - row); j++){
               System.out.print("*");
            }
           System.out.println();
        }
       
    }


    /**
     * void method to print a shape that is an "X" pattern with arms of 3 asterisks each.
     * refer to detailed instructions in lab description part 7b
     */

    public static void shape7b(int number) {

       // declare and initialize your variables first, if any then start writing your code
       Scanner in = new Scanner(System.in);
       System.out.println("Type in an integer: ");
       number = in.nextInt();
       int boxSize = (number * 2) + 1;
       int row; 
       int column;
       for (row = 0; row < boxSize; row++){
           for (column = 0; column < boxSize; column++){
               if ((column == row) || (column  == (boxSize - row) - 1)){
                   System.out.print("*");
                } else{
                    System.out.print(".");
                }
            }
           System.out.println();
        }
       
    }

} // end of class Lab4.  Good luck!