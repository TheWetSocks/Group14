/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0
 * Date Complete: 2020-04-19
 */
public class DealCards extends GroupOfCards {

    private int handSize = 5;
    /**
    * @return the hand size
    */
    //Card[] cards = new Card[handSize];
    
    DealCards(int size) {
        super(size);
    }

    public void dealHand() {
        int countCards = 0;
        Random random = new Random();
        Card c = new Card();
        int x = c.getValue().values().length;
        int y = c.getSuit().values().length;
        /**
         * declares a card counter to make a hand of 5-7 depending on the players
         * Makes an instance of the Card class to use the getSuit/Value methods
         */
        for (int i = 0; i < handSize; i++) {
            c = new Card(y, x);
            c.getSuit();
            c.getValue();
            //cards[countCards] = (new Card());
            countCards++;
        }//end outter for
    }//end method

}
