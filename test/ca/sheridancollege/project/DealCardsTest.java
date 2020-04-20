/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maksim
 */
public class DealCardsTest {
    
    public DealCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGoodDealHand() {
        System.out.println("dealHand");
        DealCards dealCards = new DealCards(4);
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = dealCards.dealHand();
        assertEquals(expResult, result);
    }
    

    @Test
    public void testAddNewHand() {
        System.out.println("addNewHand");
        ArrayList<Card> newHand = null;
        DealCards instance = null;
        instance.addNewHand(newHand);
    }

    @Test
    public void testAddNewCard() {
        System.out.println("addNewCard");
        Card newCard = null;
        DealCards instance = null;
        instance.addNewCard(newCard);
    }

    @Test
    public void testShowHand() {
        System.out.println("showHand");
        DealCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.showHand();
        assertEquals(expResult, result);
    }

    @Test
    public void testRealPlayerCheck() {
        System.out.println("realPlayerCheck");
        String card = "ACE";
        DealCards instance = null;
        Card expResult = instance.realPlayerCheck(card);
        Card result = instance.realPlayerCheck(card);
        assertEquals(expResult, result);
    }
    
}
