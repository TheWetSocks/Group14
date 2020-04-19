/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 * The Card class holds the enum of the cards available (all 52). It holds the
 * methods to get the suit and value as well as print the card.
 *
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0 Date Complete: 2020-04-19
 */
public class Card {

    //default modifier for child classes
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS
    };

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    };
    private final Suit suit;
    private final Value value;

    /**
     * This represents the suit and value the card holds
     *
     * @param s the cars suit
     * @param gVal the cards value
     */
    public Card(int s, int gVal) {
        suit = Suit.values()[s];
        value = Value.values()[gVal];
    }

    /**
     * @return the card with the values from the enum
     */

    public Card() {
        suit = Suit.values()[0];
        value = Value.values()[0];
    }

    /**
     * A blank constructor for card class
     *
     * @return a blank card
     */
    public Value getValue() {
        return this.value;
    }

    /**
     * gets the cards value
     *
     * @return the value of the card at a specific location
     */

    public Suit getSuit() {
        return this.suit;
    }

    /**
     * gets the cards suit
     *
     * @return the suit of the card at a specific location
     */

    @Override
    public String toString() {
        return "";
    }
    /**
     * A test to see if the player has cards in their hand
     * @return a blank card inside an array
     */

}