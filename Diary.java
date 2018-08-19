//necessary imports for file i/o
import java.io.FileInputStream;         //"turns" the file into a read stream
import java.util.Scanner;               //reads from stream
import java.io.IOException;             //this exception must be caught and handled when dealing with streams!         
import java.io.FileOutputStream;       //"turns" the file into a write stream
import java.io.PrintWriter;            //writes to the stream
import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Diary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diary
{
    
  public static void main(String[] args) throws IOException {
      
      // Needed variables
      int mm = 0;
      int dd = 0;
      int yyyy = 0;
      String prose = "";   //Empty string to read prose
      
      FileOutputStream fos = null;
      PrintWriter output = null;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the date as three integers separated by spaces (i.e mm dd yyyy) ");
      
      mm = keyboard.nextInt();
      dd = keyboard.nextInt();
      yyyy = keyboard.nextInt();
      
      System.out.println("Enter as many lines of prose you wish (for your to-do’s list or diary entry)");
      System.out.println("Press CTRL + Z to end your entry");
      
      //START YOUR CODE HERE
      
      
      
  }
}


