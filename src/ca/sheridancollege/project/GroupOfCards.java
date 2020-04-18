/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @Author Maksim Ivashkevich
 */
public class GroupOfCards {

    private ArrayList<Card> deck = new ArrayList<Card>(52);
    private ArrayList<Card> hand = new ArrayList<Card>();
    Player p = new Player();
    private int handSize = 7;

    private int deckSize = 52;
    public Card[] cards = new Card[deckSize];
    public Card[] handCards = new Card[handSize];

    public void generateHand() {
        int countCards = 0;
        for (int i = 0; i < 4; i++) {
            for (Card.Value v : Card.Value.values()) {
                cards[countCards] = (new Card(v));
                countCards++;
            }
        }//end outter for
    }//end method

    public void dealHand() {
        int countCards = 0;
        Random rnd = new Random();
        if (p.getHandSize() == 2) {
            int randomNum = rnd.nextInt(50);
            for (int i = 0; i < 7; i++) {
                handCards[i] = cards[randomNum];
                deck.remove(i);
                randomNum = 0;
            }
        } else if (p.getHandSize() < 7) {
            for (int i = 0; i < 7; i++) {
                int randomNum = rnd.nextInt(50);
                handCards[i] = cards[randomNum];
                randomNum = 0;
            }
        }
    }

    public void getHand() {
        for (int i = 0; i < handCards.length; i++) {
            System.out.println(handCards[i].getValue());
        }
    }
}//end class
