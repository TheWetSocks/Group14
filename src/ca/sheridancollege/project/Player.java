
package ca.sheridancollege.project;


public class Player 
{
    private String playerID; //the unique ID for this player

   
    public Player(String name)
    {
        playerID= name;
    }

  
    public String getPlayerID() 
    {
        return playerID;
    }

   
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }

  
    public void play(){}

}