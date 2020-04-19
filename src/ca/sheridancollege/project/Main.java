
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        
        Game game = new Game("Go Fish"); // Go fish Game created
        Scanner input = new Scanner(System.in);
        ArrayList<Card> cardsOfTheGame = new ArrayList<Card>();
        
         int handSize =0;
    
        int playerSize = game.startGame() - 1; 
        if(playerSize > 1 && playerSize < 4){
            handSize = 6; // dealing with arrays so 6 = 7 elements
            
        }
        else if(playerSize >= 4 && playerSize <=8){
             handSize = 4;
        }
       
        DealCards cards = new DealCards(handSize);
        
        ArrayList<DealCards> cardsDealt = new ArrayList<DealCards>();
        
        for(int i = 0; i < playerSize;i++){
            cardsDealt.add(cards);  // create and array and pass cardsDeault = cards[i].dealHand
        }
        
        for(int a = 0;a <cardsDealt.size();a++){
        
            cardsDealt.get(a).dealHand();
            System.out.println(cardsDealt.get(a).showCards());
        }
        
         int randp;
        
        ArrayList<Player> players = new ArrayList<Player>();
        players = game.getPlayers();
        
        /*for(int i = 0;i < players.size();i++){   // this code updates the computers hands at the start of each turn if they have the cards the requesting computer is asking for
         randp = 0 + (int)(Math.random()*((3 - 0) + 1 ));
         cardsOfTheGame = players.get(i).startTurn(cardsDealt.get(i).dealHand(), cardsDealt.get(randp).showCards());
         cardsDealt.get(i).addNewHand(cardsOfTheGame);
         
        } */
        
        int books = 0;
        Scanner playerInput = new Scanner(System.in);
        String cardSelected = "";
        int playerSelected = 0;      
        //System.out.println("This is player 1 hand: " +cardsDealt.get(0).showHand());
        
         
         cardsDealt.get(0).showHand().forEach(cardsPrinted ->{
                 System.out.println("This is player 1 hand: " +cardsPrinted);
                });
        
        while(books < 13){
            System.out.println("Player");
            
            for(int i = 0;i < players.size();i++){
            if(i == 0){
                System.out.println(players.get(i).getPlayerID() + "'s Turn");
                System.out.println("Select a player to choose card from");
                playerSelected = playerInput.nextInt();
                System.out.println("Request a card from the player:");
                
                cardSelected = playerInput.next();        
                cardsDealt.get(0).addNewCard(cardsDealt.get(playerSelected-1).realPlayerCheck(cardSelected));  // this will add the card if the opponent actually has that 
                
                //System.out.println(cardsDealt.get(0).showHand());
                
                cardsDealt.get(0).showHand().forEach(name ->{
                 System.out.println(name);
                });
                
            }
            
            }
            
            
        
        }
        
        
        
        //GroupOfCards group = new GroupOfCards(4); 
        //for(int i = 0;i < 4;i++){
       //     cards.showCards().get(i);
       // }
        
        
        
    }
    
}
