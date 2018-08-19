// Here is the solution set to lab 10:
import java.util.Scanner;

public class LabEC {
  /*
   * Lab Extra Credit - Strings and Arrays Review
   * 
   * In a class named LabEC, implement all of the following methods:
   * 
   * 1) Write a method named capitalizeFirstLetters that prints a capitalized
   * version of a passed in string to the screen, that is, it changes the first
   * letter of each word in the string to upper case (if it is not already upper
   * case). So "I really enjoy attending lab!" becomes
   * "I Really Enjoy Attending Lab!". The string to be printed should be a
   * parameter to the method, and the method should have a void return. You
   * should test your method in main by getting a line of input from the user
   * and applying the method to it. (Hint: you may want to browse the Java
   * String docs for useful methods on strings).
   */
  public static void capitalizeFirstLetters() {
    
	// Your code here
	
	
  }

  /*
   * 2) Write a method named transpose that calculates the transpose of a n-by-n
   * matrix when called, that is, it exchanges the rows and columns of a matrix
   * without using extra space. The n-by-n matrix should be passed in as a
   * parameter and nothing needs to be returned. You should test your method in
   * main by creating a matrix of random values and passing that in to your
   * method. Print the original matrix first, before calling transpose, then
   * print it again after calling transpose.
   */
  public static void transpose(int[][] matrix) {
    
	// Your code here
	
  }

  /*
   * 3) Write a method named isRagged that determines if a passed in two
   * dimensional array is ragged. It should take a 2d array as a parameter, and
   * return true if it is ragged and false if it is not ragged. You should test
   * your method in main by hard coding some different 2d array inputs (ragged
   * and non-ragged).
   */
  public static boolean isRagged(int[][] matrix) {
    
	// Your code here
	
	}

  /*
   * 4) Write a method named findMin that takes in an array of strings and a
   * starting index, and calculates the minimum string (i.e. the earliest word
   * alphabetically) in the array starting from the passed in index. The method
   * should return the index where the minimum string is located. As before,
   * make sure to test you method in main (you can hard code the array or use
   * Scanner on keyboard input to populate the array).
   */

  public static int findMin(String array[], int index) {
    
	// Your code here
  }

  /*
   * 5) Write a method named stringSort that sorts an array of strings
   * lexicographically, that is, using dictionary ordering. You should sort by
   * finding the smallest string, swapping it with the first string in the
   * array, then finding the second smallest string then swapping it with the
   * second string in the array and so on. As before, make sure to test you
   * method in main (you can hard code the array or use Scanner on keyboard
   * input to populate the array).
   */

  public static void stringSort(String[] array) {
    
	// Your code here
  }

  // main method to test all the methods above, no need to change
  public static void main(String[] args) {
    // Exercise 1
    // capitalizeFirstLetters();

    // Exercise 2
    // create n-by-n matrix
    int n = 5; // try other values
    int[][] matrix = new int[n][n];
    // populate it
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = (int) (Math.random() * 42);
      }
    }

    // print original matrix
    System.out.println("Before");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%3d", matrix[i][j]);
      }
      System.out.println();
    }

    transpose(matrix);

    // print transposed matrix
    System.out.println("After");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%3d", matrix[i][j]);
      }
      System.out.println();
    }

    // Exercise 3
    int[][] matrix1 = { { 1, 2, 4 }, { 1, 3 }, { 3, 4 } };
    int[][] matrix2 = { { 1, 2 }, { 1, 3 }, { 3, 4 } };

    System.out.println(isRagged(matrix1));
    System.out.println(isRagged(matrix2));

    // Exercise 4
    String[] array = { "hello", "boo", "achoo", "goodbye" };
    System.out.println(findMin(array, 0));

    // Exercise 5
    stringSort(array);
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + ", ");
  }
}

