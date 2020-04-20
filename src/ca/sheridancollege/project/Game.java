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
 * @since 1.0 Date Complete: 2020-04-19
 */
public class Game {

    private final String gameName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int numberOfPlayers;

    /**
     * For getting the players and their names
     *
     * @param givenName gets the players names
     * @param numberOfPlayers gets the amount of players
     * @param players the players of the game
     */

    /**
     * makes the game with the players name and makes an arraylist of players
     *
     * @return the gameName is the name of the player inside the game
     */
    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
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
     * Play the game. This might be one method or many method calls depending on
     * your game.
     * @return the number of players the game has
     */
    public int startGame() {

        Scanner input = new Scanner(System.in);
        System.out.println("You are playing " + gameName);
        System.out.println("Please enter number of players");
        numberOfPlayers = input.nextInt();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Please name of player " + (i + 1) + ": ");
            players.add(new Player(input.next()));
        }
        System.out.println("Start Game");
        return numberOfPlayers;
    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {
    }

}//end class
