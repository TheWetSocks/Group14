
package ca.sheridancollege.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        Game game = new Game("Go Fish"); // Go fish Game created
        Scanner input = new Scanner(System.in);
    
        game.startGame(); 
        
        DealCards cards = new DealCards(4);
        cards.dealHand();
        for(Card c: cards.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
        
        
    }
    
}
