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
public class GameTest {

    public GameTest() {
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
    public void testGoodGame() {
        System.out.println("getGameName");
        Game game = new Game("Go Fish");
        String expResult = "Go Fish";
        String result = game.getGameName();
        assertEquals(expResult, result);
    }

    @Test
    public void testBadGame() {
        System.out.println("getGameName");
        Game game2 = new Game("Fish Go");
        String expResult = "Fish Go";
        String result = game2.getGameName();
        assertEquals(expResult, result);
    }

    @Test
    public void testBoundaryBadGame() {
        System.out.println("getGameName");
        Game game2 = new Game("");
        String expResult = "";
        String result = game2.getGameName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGoodSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = new ArrayList<Player>();
        Game instance = new Game("Go Fish");
        instance.setPlayers(players);
    }

    @Test
    public void testBadSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = new ArrayList<Player>(-1);
        Game instance = new Game("Go Fish");
        instance.setPlayers(players);
    }

    @Test
    public void testBoundarySetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = new ArrayList<Player>(8);
        Game instance = new Game("Go Fish");
        instance.setPlayers(players);
    }

    @Test
    public void testGoodStartGame() {
        System.out.println("startGame");
        Game game = new Game("Go Fish");
        int expResult = 5;
        int result = game.startGame();
        assertEquals(expResult, result);
    }

    @Test
    public void testBadStartGame() {
        System.out.println("startGame");
        Game game = new Game("Go Fish");
        int expResult = -1;
        int result = game.startGame();
        assertEquals(expResult, result);
    }

    @Test
    public void testBoundaryStartGame() {
        System.out.println("startGame");
        Game game = new Game("Go Fish");
        int expResult = 8;
        int result = game.startGame();
        assertEquals(expResult, result);
    }

    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game game = new Game("Go Fish");
        game.declareWinner();
    }

}
