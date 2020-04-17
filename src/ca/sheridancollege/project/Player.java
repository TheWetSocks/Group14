/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye
 */
public class Player 
{
    private int numberOfPlayers;
    private int handSize;
    private String playerName;
    public static ArrayList<String> playerList = new ArrayList<String>();
    
    public Player(){
    }
    
    public Player(String playerName){
        this.playerName = playerName;
        numberOfPlayers++;
        playerList.add(playerName);
    }
    
    private int handSize(){
        if(numberOfPlayers == 2){
            handSize = 7;
        }
        else if(numberOfPlayers < 4)
        {
            handSize = 5;
        }
        else{
            System.out.println("Invalid amount of players. Try entering them again!");
        }
        return handSize;
    }
    
    public int getHandSize(){
        return handSize;
    }
    
    public String getPlayers(){
        return playerList.toString();
    }
    
    public String getName(){
        return playerName;
    }
}
