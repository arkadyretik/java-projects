
//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats {
    public static void main(String[] args) throws IOException{  
        // Scanner and PrintWrite must be declared outside the try block
        // otherwise their scope will be limited to within the block 
        Scanner input = null;
        PrintWriter output = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        double inputNumber = 0.0;
        
        int negNum = 0;
        int btw0and100 = 0;
        int geq100 = 0;
        
        int lineCounter = 0;
        double grandTotal = 0.0;
        
        double min = 0.0;
        double max = 0.0;
        double average = 0.0;
        
       try {            
           
       } 
       catch (IOException e) {
              System.out.println("File not found.");
              System.exit(0);
       } finally {
             if(input != null)
             input.close();
       }
           
               display(average, max, min, lineCounter, negNum, btw0and100, geq100);
      }

public static void display (double average, double max, double min, double lineCounter, int negNum, int btw0and100, int geq100){
    
    PrintWriter output = null;
    try{

                
  } catch (IOException e) {
    System.out.println(" Sorry, we cannot locate the file!");
            System.exit(0);
  } finally {
        if (output != null)
            output.close();
    } 
    
}
}
