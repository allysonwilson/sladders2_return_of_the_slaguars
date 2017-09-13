package com.example.michael.sladders2returnoftheslaguars;

import com.example.michael.sladders2returnoftheslaguars.boardgenerators.*;
import com.example.michael.sladders2returnoftheslaguars.players.*;
import com.example.michael.sladders2returnoftheslaguars.rollables.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by michael on 13/09/2017.
 */
public class GameTest {
    Player player1;
    Player player2;
    ArrayList<Player> players;
    BoardGenerator generator;
    Board board;
    Rollable dice;
    Game game;

    @Before
    public void before() {
        player1 = new HumanPlayer("Allyson");
        player2 = new HumanPlayer("Michael");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        generator = new PresetBoard();
        board = new Board(generator);
        dice = Mockito.mock(Rollable.class);
        game = new Game(players, board, dice);
    }

    @Test
    public void getPlayers() {
        assertEquals( player1, game.getPlayers().get(0));
        assertEquals( player2, game.getPlayers().get(1));
    }

    @Test
    public void player1MovesBy4WhenRollIs4() {
        Mockito.when( dice.roll() ).thenReturn(4).thenReturn(2) ;
        game.playTurn();
        assertEquals( 4, player1.getPosition());
    }

    @Test
    public void player2MovesBy2WhenRollIs2() {
        Mockito.when( dice.roll() ).thenReturn(4).thenReturn(2) ;
        game.playTurn();
        assertEquals( 2, player2.getPosition());
    }
}