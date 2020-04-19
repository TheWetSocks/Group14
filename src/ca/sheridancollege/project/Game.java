/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0
 * Date Complete: 2020-04-19
 */
public class Game {

    private final String gameName;//the title of the game
    private ArrayList<Player> players = new ArrayList<Player>();// the players of the game // private
    private int numberOfPlayers;
    /**
     * For getting the players and their names
     * @param givenName gets the players names
     * @param numberOfPlayers gets the amount of players
     */

    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList();
    }
    /**
     * makes the game with the players name and makes an arraylist of players
     * @return the gameName is the name of the player inside the game
     */
    
    public String getGameName() {
        return gameName;
    }
    /**
     * @return the players of this game
     */
    
    public ArrayList<Player> getPlayers(String nameOfPlayer) {
        //Player player = new Player(nameOfPlayer);
        //players.add();
        return players;
    }
    /**
     * @param players the players of this game
     */
    
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    /**
     * @return sets the players into the arraylist
     */
    
    public void startGame() {

        Scanner input = new Scanner(System.in);
        System.out.println("You are playing " + gameName);
        System.out.println("Please enter number of players");
        numberOfPlayers = input.nextInt();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Please name of player " + (i + 1) + ": ");
            Player player = new Player(input.next());
        }

        System.out.println("Start Game");

    }
    /**
     * Starts the game
     */
    
    public void declareWinner() {
    }
    /**
     * 
     * @return the winner of the game
     */

}//end class
