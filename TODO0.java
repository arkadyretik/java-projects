import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;

/* TODO 0 - Winning the game check; write code to determine if the game has been won if all blocks have been removed.
 *
 * Outcomes: Single if statement
 * 
 * Function to define:
 *          public void wonGameCheck();             //this function should check if the game has been won and if so, call gameWin()
 * 
 * Functions to call:
 *          public boolean areAllBlocksRemoved();   //returns true if no more blocks are onscreen
 *          public void gameWin();                  //call this function for the game won screen
 *          public void gameLost();                 //call this function for game lost screen
 *
 * Hints and tips:
 *         The game is won if all blocks have been removed from the screen.     
 *         Remember you can take control of the ball with F2 and WASD!
 */

public class TODO0 extends SpaceSmasherFunctionalAPI {
    
    public void wonGameCheck(){
       if(areAllBlocksRemoved()){
            gameWin();
        }  
   }//TODO: declare your one method here
}

/* Discussion on the Single IF Statement  
 * 
 * if( <someBooleanQuestion> ) {
 *  //do this code if the question resulted in a true value
 * } //or skip past this line if the question resulted in a false value
 * 
 * This "if" statement seeks to determine if the game logic 
 * should continue or if we should jump to the game over screen
 * defined in gameWin()
 * 
 * In pseudocode, the IF asks: "If we've won, call the gameWin() function"
 * Notice that the IF says nothing about what to do if we haven't won; 
 * to make such a structure we'd need to introduce an IF/ELSE.  
 */
