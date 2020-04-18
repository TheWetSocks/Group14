
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        
        Game game = new Game("Go Fish"); // Go fish Game created
        Scanner input = new Scanner(System.in);
         int handSize =0;
    
        int playerSize = game.startGame(); 
        if(playerSize > 1 && playerSize < 4){
            handSize = 7;
            
        }
        else if(playerSize >= 4 && playerSize <=8){
             handSize = 5;
        }
       
        DealCards cards = new DealCards(handSize);
        
        ArrayList<DealCards> cardsDealt = new ArrayList<DealCards>();
        
        for(int i = 0; i < playerSize;i++){
            cardsDealt.add(cards);
        }
        
        for(int i = 0;i <cardsDealt.size();i++){
        
            cardsDealt.get(i).dealHand();
            cards.showCards().get(i);
        }
        
        
        
        //GroupOfCards group = new GroupOfCards(4); 
        for(int i = 0;i < 4;i++){
            cards.showCards().get(i);
        }
        
        
        
    }
    
}
