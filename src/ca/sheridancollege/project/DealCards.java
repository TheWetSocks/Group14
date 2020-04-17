/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Redbark
 */
public class DealCards extends GroupOfCards {
      private int handSize = 4;
      Card[] cards = new Card[handSize];
    
    DealCards(int size){
    super(size);
    }
    
   
        public void dealHand()
        {
                int countCards = 0;
        for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                         cards[countCards] = (new Card(s,v));
                         countCards++;
                        
                    }
                }//end outter for
        }//end method

    }
    
    

