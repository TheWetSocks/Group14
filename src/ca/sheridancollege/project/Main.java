/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Maksim
 */
public class Main {
    public static void main(String[] args){
        GroupOfCards deck = new GroupOfCards();
        
        Player p1 = new Player("Max");
        Game g = new Game();
        
        System.out.println("Welcome to: " + g.getGameName());
        System.out.println("Players in the game: " + p1.getPlayers());
        
                GroupOfCards ch = new GroupOfCards();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue());
                }
    }
}
     enum cardType {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }