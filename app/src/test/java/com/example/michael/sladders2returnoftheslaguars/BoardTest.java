package com.example.michael.sladders2returnoftheslaguars;

import com.example.michael.sladders2returnoftheslaguars.boardgenerators.BoardGenerator;
import com.example.michael.sladders2returnoftheslaguars.boardgenerators.PresetBoard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 13/09/2017.
 */
public class BoardTest {
    Board board;
    BoardGenerator generator;

    @Before
    public void before() {
        generator = new PresetBoard();
        board = new Board(generator);
    }

    @Test
    public void testPosition3IsModifier(){

        assertEquals( true, board.isPositionModifier(3));
    }

    @Test
    public void testPosition2IsNotModifier(){

        assertEquals( false, board.isPositionModifier(2));
    }

    @Test
    public void canGetModifierAt3() {
        assertNotNull(board.getModifier(3));
    }

    @Test
    public void cannotGetModifierAt2() {
        assertNull(board.getModifier(2));
    }
}