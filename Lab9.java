import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Lab9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab9  {

    public static void main(String [] args) {


        // Test random matrix of integers
        int[][] a = randomMatrix (7, 20, 100);
        // use the above array to test next rowSum()
        int rowTotal = rowSum( a, 3);
        System.out.println("\n Sum of row  = " + rowTotal);

        // use the above array to test next colSum()
        int columSum = colSum( a, 4);
        System.out.println("\n Sum of columns  = " + columSum);

        isSquare(a);



        int[][] nonsquare = { {1,2,3}, {4,5}, {6,7,8,9} };
        int[][] notlatin = { {2,1,3}, {2,3,1}, {3,1,2} };
        int[][] latin = { {1,2,3}, {2,3,1}, {3,1,2} };
        int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
        int[][] notSquare = { {10, 12, 3, 17}, { 4, 5, 16, 18}, { 7, 9, 10, 45} };
        int[][] perfectSquare = { {1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12}, { 13, 14, 15, 16}};

        // Your tests, here are 2 to start with
        isLatin(nonsquare);
        isSquare(perfectSquare);



    }

    // (a) int[][] random(int N, int start, int end) returns an N-by-N matrix of
    // random integers ranging from start to end;

    public static int [][]randomMatrix (int N, int start, int end) {

       // Your logic goes here
    }

    // Generates a new random integer between 0 and end when called to be used in part(a)
    public static int randomGenerator( int end, int start){

        // Your code goes here

    }

    // (b) int rowSum(int[][] a, int i) returns the sum of the elements in row i of the 2-D array a
    public static int rowSum( int[][] a, int i) {

        // Your logic goes here
    }

    // (c) int colSum(int[][] a, int j) returns the sum of the elements in column j of the 2-D array a
    public static int colSum( int[][] a, int j) {

        // Your logic goes here
    }

    // (d) boolean isSquare(int[][] a) returns true if the 2-D array a is square (i.e. the number of
    // rows and columns are the same)
    public static boolean isSquare(int[][] a) {

        // Your logic goes here

    }

    // (e) boolean isLatin(int[][] a) returns true if the 2-D array a is a Latin square
    // (i.e. an n-by-n matrix such that each row and each column contains the values
    // from 1 through n with no repeats)
    public static boolean isLatin(int[][] a) {

        // Your logic goes here
    }

    // 2. In a different class named ShiftNumbers.java write a program that takes integer M as the number of both rows and columns for your 2D array.
    // Create the same exact  2D array as displayed in Lab handout.

  }






