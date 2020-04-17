/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye test
 */
public class Card {

    private ArrayList<Card> deck = new ArrayList<Card>(52);

        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Value value;
        
        public Card(Value cVal)
        {
           value = cVal;
        }
	public Value getValue() {
		return this.value;
	}

    //default modifier for child classes
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
}
