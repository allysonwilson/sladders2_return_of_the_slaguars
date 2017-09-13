package com.example.michael.sladders2returnoftheslaguars;

import com.example.michael.sladders2returnoftheslaguars.modifiers.Sladder;
import com.example.michael.sladders2returnoftheslaguars.modifiers.SladderType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 13/09/2017.
 */
public class SladderTest {
    Sladder ladder;
    Sladder snake;
    Sladder jaguar;

    @Before
    public void before()  {
        ladder = new Sladder(2, 8);
        snake = new Sladder(8, 2);
        jaguar = new Sladder(7, -1);
    }

    @Test
    public void getStartPosition()  {
        assertEquals( 2, ladder.getStartPosition() );
    }

    @Test
    public void getEndPosition() {
        assertEquals( 8, ladder.getEndPosition() );
    }

    @Test
    public void getTypeLadder()  {
        assertEquals( SladderType.LADDER, ladder.getType() );
    }

    @Test
    public void getTypeSnake()  {
        assertEquals( SladderType.SNAKE, snake.getType() );
    }

    @Test
    public void getTypeJaguar()  {
        assertEquals( SladderType.JAGUAR, jaguar.getType() );
    }

    @Test
    public void offset()  {
        assertEquals( 6, ladder.getOffset() );
    }
}