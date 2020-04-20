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
public class GroupOfCardsTest {

    public GroupOfCardsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inside @BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Inside @AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Inside @Before");
    }

    @After
    public void tearDown() {
        System.out.println("Inside @After");
    }

    @Test
    public void testGoodShowCards() {
        System.out.println("showCards");
        GroupOfCards game = new GroupOfCards(5);
        ArrayList<Card> expResult = new ArrayList<Card>(5);
        ArrayList<Card> result = game.showCards();
        assertEquals(expResult, result);
    }

    @Test
    public void testBadShowCards() {
        System.out.println("showCards");
        GroupOfCards game = new GroupOfCards(1);
        ArrayList<Card> expResult = new ArrayList<Card>(1);
        ArrayList<Card> result = game.showCards();
        assertEquals(expResult, result);
    }

    @Test
    public void testGoodSetSize() {
        System.out.println("setSize");
        int givenSize = 6;
        GroupOfCards groupOfCards = new GroupOfCards(6);
        groupOfCards.setSize(givenSize);
    }

    @Test
    public void testBadSetSize() {
        System.out.println("setSize");
        int givenSize = 1;
        GroupOfCards groupOfCards = new GroupOfCards(1);
        groupOfCards.setSize(givenSize);
    }

    @Test
    public void testBoundarySetSize() {
        System.out.println("setSize");
        int givenSize = 8;
        GroupOfCards groupOfCards = new GroupOfCards(8);
        groupOfCards.setSize(givenSize);
    }

}
