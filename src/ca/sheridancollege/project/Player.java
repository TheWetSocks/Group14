
package ca.sheridancollege.project;

import java.util.ArrayList;


public class Player 
{
    private String playerID; //the unique ID for this player
    private int booksCollected;
    private ArrayList<Card> cards;
    public Player(String name)
    {
        playerID = name;
    }
    

  
    public String getPlayerID() 
    {
        return playerID;
    }

   
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    
    
    public ArrayList<Card> startTurn(ArrayList<Card> p1,ArrayList<Card> p2){       //may use 2 card paramters having 2 different dealHand iterations
        ArrayList<Card> firstPlayerHand = p1;
        ArrayList<Card> secondPlayerHand = p2;
        int cardCount = 0;
        
        //this.cards = cards;
        
       
       
       int randS = 0 + (int)(Math.random()*((3 - 0) + 1 ));
       int randV = 0 + (int)(Math.random()*((12 - 0) + 1 ));
       int randV2 = 0 + (int)(Math.random()*((12 - 0) + 1 ));
       int randS2 = 0 + (int)(Math.random()*((3 - 0) + 1 ));
       
       if(firstPlayerHand.get(randV) == secondPlayerHand.get(randV2) && firstPlayerHand.get(randS) == secondPlayerHand.get(randS2) ){
           System.out.println("You earned one book!!");
           
           firstPlayerHand.add(new Card(randS,randV));
           // need to add book if player has 4 similar cards in hand
           for(int i = 0;i < firstPlayerHand.size();i++){
                     if(firstPlayerHand.get(i).equals(new Card(randS,randV))){
                         cardCount++;
                     }
     
               
           }
           
            if(cardCount == 4)
                     booksCollected+= 1;
         
           
       }
       else if(!(firstPlayerHand.get(randV) == secondPlayerHand.get(randV2) && firstPlayerHand.get(randS) == secondPlayerHand.get(randS2))){
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