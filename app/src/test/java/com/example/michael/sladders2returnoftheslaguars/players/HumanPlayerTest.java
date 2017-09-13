package com.example.michael.sladders2returnoftheslaguars.players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michael on 13/09/2017.
 */
public class HumanPlayerTest {
    Player player;

    @Before
    public void before() {
        player = new HumanPlayer("Allyson");
    }

    @Test
    public void getName() {
    assertEquals( "Allyson", player.getName());
    }

    @Test
    public void getPosition() {
    assertEquals( 0, player.getPosition());
    }

}