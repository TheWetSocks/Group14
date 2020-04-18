
package ca.sheridancollege.project;

import java.util.ArrayList;


public class Player 
{
    private String playerID; //the unique ID for this player
    private int booksCollected;
    private ArrayList<Card> cards;
    public Player(String name)
    {
        playerID= name;
    }
    

  
    public String getPlayerID() 
    {
        return playerID;
    }

   
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    
    
    public ArrayList<Card> startTurn(ArrayList<Card> cards,Player player){
        ArrayList<Card> otherPlayerHand = new ArrayList<Card>();
        this.cards = cards;
       
        otherPlayerHand = player.cards;
       int randS = 0 + (int)(Math.random()*((3 - 0) + 1 ));
       int randV = 0 + (int)(Math.random()*((12 - 0) + 1 ));
       int randV2 = 0 + (int)(Math.random()*((12 - 0) + 1 ));
       int randS2 = 0 + (int)(Math.random()*((3 - 0) + 1 ));
       
       if(cards.get(randV) == otherPlayerHand.get(randV2) && cards.get(randS) == otherPlayerHand.get(randS2) ){
           System.out.println("You earned one book!!");
           booksCollected+= 1;
           
       }
       else if(!(cards.get(randV) == otherPlayerHand.get(randV2) && cards.get(randS) == otherPlayerHand.get(randS2))){
           System.out.println("Go fish!");
           goFish();
       }
       
        return cards;
    }
  
    private void goFish(){
         int randS = 0 + (int)(Math.random()*((3 - 0) + 1 ));
         int randV = 0 + (int)(Math.random()*((12 - 0) + 1 ));
        cards.add(new Card(randS,randV));
    }
   
    public void play(){}

}