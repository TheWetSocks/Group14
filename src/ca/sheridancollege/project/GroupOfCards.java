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
    Player p = new Player();
    
    private int handSize = 52;
    public Card[] cards = new Card[handSize];
    
            public void generateHand()
        {
                int countCards = 0;
                for(int i = 0; i < 4; i++){
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}//end class
