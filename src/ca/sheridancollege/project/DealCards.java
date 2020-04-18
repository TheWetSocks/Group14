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
      //private int handSize = 4;
      //private ArrayList<Card> card = cards;
        
    
    DealCards(int size){
    super(size);
    
    }
    
   
        public ArrayList<Card> dealHand()
        {
            int randS = 0 + (int)(Math.random()*((3 - 0) + 1 ));
            int randV = 0 + (int)(Math.random()*((12 - 0) + 1 ));
            Card[] cardHand = new Card[size];
            
            for(int i = 0;i < size;i++){
                randS = 0 + (int)(Math.random()*((3 - 0) + 1 ));
                randV = 0 + (int)(Math.random()*((12 - 0) + 1 ));
                 System.out.println(randV + " "+ randS);
                cardHand[i] = new Card(randS,randV);
                cards.add(cardHand[i]);
                
               
            
            }
            
            for(int i = 0;i<size;i++){
                System.out.println(cardHand[i].getSuit());
                 System.out.println(cardHand[i].getValue());
            }
           // cardHand[1].getSuit();
            
              
           
            
               
            return cards;
    }
}
    
    

