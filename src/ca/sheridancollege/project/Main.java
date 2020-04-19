
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        
        Game game = new Game("Go Fish"); // Go fish Game created
        Scanner input = new Scanner(System.in);
        ArrayList<Card> cardsOfTheGame = new ArrayList<Card>();
       
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
        
        for(int a = 0;a <cardsDealt.size();a++){
        
            cardsDealt.get(a).dealHand();
            System.out.println(cardsDealt.get(a).showCards());
        }
        
         int randp;
        
        ArrayList<Player> players = new ArrayList<Player>();
        players = game.getPlayers();
        
        for(int i = 0;i < players.size();i++){
         randp = 0 + (int)(Math.random()*((3 - 0) + 1 ));
         cardsOfTheGame = players.get(i).startTurn(cardsDealt.get(i).dealHand(), cardsDealt.get(randp).showCards());
         cardsDealt.get(i).addNewHand(cardsOfTheGame);
         
        }
        
        int books = 0;
        Scanner playerInput = new Scanner(System.in);
        String cardSelected = "";
        int playerSelected = 0;      
    
        while(books < 13){
            System.out.println("Player");
            
            for(int i = 0;i < players.size();i++){
            if(i == 0){
                System.out.println(players.get(i).getPlayerID() + "'s Turn");
                System.out.println("Select a player to choose card from");
                playerSelected = playerInput.nextInt();
                System.out.println("Request a card from the player:");
                
                cardSelected = playerInput.next();
                if(cardSelected.toUpperCase() == "Two" || cardSelected.toUpperCase() == "Three" || cardSelected.toUpperCase() == "Three"){
                
                }
                
                cardsDealt.get(playerSelected).realPlayerCheck(cardSelected);
                
               
                
                
            }
            }
            
            
        
        }
        
        
        
        //GroupOfCards group = new GroupOfCards(4); 
        //for(int i = 0;i < 4;i++){
       //     cards.showCards().get(i);
       // }
        
        
        
    }
    
}
