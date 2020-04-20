package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 2.0
 * Date Complete: 2020-04-19
 */
public class Main {

    public static void main(String[] args) {

        Game game = new Game("Go Fish"); // Go fish Game created
        Scanner input = new Scanner(System.in);
        /**
         * creates the game and adds a scanner
         */
        game.startGame();

        DealCards cards = new DealCards(4);
        cards.dealHand();
        for (Card c : cards.cards) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
    }
}