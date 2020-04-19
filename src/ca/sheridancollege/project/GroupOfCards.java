/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0
 * Date Complete: 2020-04-19
 */
public class GroupOfCards {

    protected ArrayList<Card> cards = new ArrayList<Card>();
    private int size;
    /**
     *  The group of cards, stored in an ArrayList
     *  @param size the size of the grouping
     */

    public GroupOfCards(int givenSize) {
        size = givenSize;
    }
    /**
     * A method that will get the group of cards as an ArrayList
     * @param givenSize size of the hand
     * @return the group of cards.
     */
    
    public ArrayList<Card> showCards() {
        return cards;
    }
    /**
     * @return the cards in the hand
     */

    public void shuffle() {
        Collections.shuffle(cards);
    }
    /**
     * @return shuffled cards
     */
    
    
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

}//end class
