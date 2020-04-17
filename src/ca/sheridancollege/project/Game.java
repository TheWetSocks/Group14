/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye
 */
public class Game extends Player
{
    String gameName = "Go Fish!";
    
    public String getGameName(){
        return gameName;
    }
}//end class
