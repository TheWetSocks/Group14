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
 * @author Redbark
 */
public class DealCards extends GroupOfCards {
      private int handSize = 5;
      //Card[] cards = new Card[handSize];
    
    DealCards(int size){
    super(size);
    }
        public void dealHand(){
            int countCards = 0;
            Random random = new Random();
            
            Card c = new Card();
            int x =c.getValue().values().length;
            int y =c.getSuit().values().length;
            for(int i = 0; i < handSize; i++){
                c = new Card(y,x);
                c.getSuit();
                c.getValue();
                //cards[countCards] = (new Card());
                countCards++;
            }//end outter for
        }//end method

    }