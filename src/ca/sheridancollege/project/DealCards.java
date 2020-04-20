package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class deals the cards out to the players in the array of players. It
 * also adds new cards to the players hand.
 *
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0 Date Complete: 2020-04-19
 */
public class DealCards extends GroupOfCards {

    /**
     * Uses super class constructor to get size of hand
     *
     * @param size gets the size of hand
     */
    public DealCards(int size) {
        super(size);
    }

    public ArrayList<Card> dealHand() {

        int randS = 0 + (int) (Math.random() * ((3 - 0) + 1));
        int randV = 0 + (int) (Math.random() * ((12 - 0) + 1));
        /**
         * declares a card counter to make a hand of 5-7 depending on the
         * players Makes an instance of the Card class to use the getSuit/Value
         * methods
         */
        for (int i = 0; i < size; i++) {
            randS = 0 + (int) (Math.random() * ((3 - 0) + 1));
            randV = 0 + (int) (Math.random() * ((12 - 0) + 1));
            //System.out.println(randV + " "+ randS);
            //cardHand[i] = new Card(randS,randV);
            cards.add(new Card(randS, randV));

        }

        for (int i = 0; i < size; i++) {
            // System.out.println(cardHand[i].getSuit());
            //  System.out.println(cardHand[i].getValue());
            //System.out.println(cards.get(i));
            System.out.println(cards.get(i).getValue() + " of " + cards.get(i).getSuit());

        }
        // cardHand[1].getSuit();
        System.out.println();

        return cards;
    }

    /**
     * Updates the player's hand with a new hand through an ArrayList
     *
     * @param newHand
     */
    public void addNewHand(ArrayList<Card> newHand) {

        cards = newHand;
    }

    /**
     * Gives the player the card they chose from another players hand
     *
     * @param newCard
     */
    public void addNewCard(Card newCard) {
        cards.add(newCard);
    }

    /**
     * Displays the hand of a specific player by iterating through the arraylist
     *
     * @return display players hand
     */
    public ArrayList<Card> showHand() {
        //for(int i = 0; i <cards.size();i++){
        //cards.get(i);
        // }
        return cards;
    }

    /**
     * Checks if the card that the user specified is in the hand of another
     * player and adds that card to the users hand(multiple times if the other
     * player has multiples of the selected card)
     *
     * @param card is the specific card the player chose
     * @return the card object at the index where the specified card matches the
     * card in the opponents hand
     */
    public Card realPlayerCheck(String card) {
        Card cardTaken = null;
        for (int i = 0; i < cards.size(); i++) {
            if (card.equals(cards.get(i).getValue())) {
                cardTaken = new Card(cards.get(i).getValue());
            }
        }
        return cardTaken;
    }
}
