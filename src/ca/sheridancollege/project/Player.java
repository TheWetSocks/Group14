package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @modifier Ahmad Al Sayyed, Daniel Ayala, Max Ivashkevich
 * @version 1.7
 * @since 1.0 Date Complete: 2020-04-19
 */
public class Player {

    /*
    playerID: the unique ID for this player
    booksCollected: the numbers of books the player has collected
    cards: the hand of cards the player has
     */
    private String playerID;
    private int booksCollected;
    private ArrayList<Card> cards;

    /**
     * The constructor for the player
     *
     * @param name initializes the name for the player
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     * Gets the players id/name
     *
     * @return the players id/name
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Gets the amount of books the player collected
     *
     * @return the books
     */
    public int getBooks() {
        return booksCollected;
    }

    /**
     * Initializes the player id
     *
     * @param givenID
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     * The AI logic that gets 2 random values(suit and value) and checks a
     * random players hand for a card it selects. Method continues until there
     * are no matching cards, then AI draws card
     *
     * @param p1
     * @param p2
     * @return the updated hand ArrayList
     */
    public ArrayList<Card> startTurn(ArrayList<Card> p1, ArrayList<Card> p2) {       //may use 2 card paramters having 2 different dealHand iterations
        ArrayList<Card> firstPlayerHand = p1;
        ArrayList<Card> secondPlayerHand = p2;
        int cardCount = 0;
        //this.cards = cards;
        int randS = 0 + (int) (Math.random() * ((3 - 0) + 1));
        int randV = 0 + (int) (Math.random() * ((12 - 0) + 1));
        int randV2 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        int randS2 = 0 + (int) (Math.random() * ((3 - 0) + 1));

        if (firstPlayerHand.get(randV) == secondPlayerHand.get(randV2) && firstPlayerHand.get(randS) == secondPlayerHand.get(randS2)) {
            System.out.println("You earned one book!!");

            firstPlayerHand.add(new Card(randS, randV));
            // need to add book if player has 4 similar cards in hand
            for (int i = 0; i < firstPlayerHand.size(); i++) {
                if (firstPlayerHand.get(i).equals(new Card(randS, randV))) {
                    cardCount++;
                }
            }
            if (cardCount == 4) {
                booksCollected += 1;
                System.out.println(playerID + ",you have " + booksCollected + " books ");
            }
        } else if (!(firstPlayerHand.get(randV) == secondPlayerHand.get(randV2) && firstPlayerHand.get(randS) == secondPlayerHand.get(randS2))) {
            System.out.println("Go fish!");
            goFish();
        }

        return cards;
    }

    /**
     * @return draws a random card from the deck and adds it to the users hand
     */
    private void goFish() {
        int randS = 0 + (int) (Math.random() * ((3 - 0) + 1));
        int randV = 0 + (int) (Math.random() * ((12 - 0) + 1));
        cards.add(new Card(randS, randV));
    }

    public void play() {
    }
}
