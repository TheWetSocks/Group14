package ca.sheridancollege.project;

/**
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0
 * Date Complete: 2020-04-19
 */
public class Player {
    
    private String playerID; //the unique ID for this player
    private int handSize = 4;
    Card[] cards = new Card[handSize];
    
    /**
     * A constructor for the player that has a string param for the players name
     * @param name the name of the player 
     */
    public Player(String name) {
        playerID = name;
    }
    
    /**
     * Method for getting the id of the player
     * @return the players id/name
     */
    public String getPlayerID() {
        return playerID;
    }
    
    /**
     * Sets the players name or id to the users choice
     * @param givenID the id the player chooses
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }
    
    /**
     * 
     */
    public void play() {
    }

}
