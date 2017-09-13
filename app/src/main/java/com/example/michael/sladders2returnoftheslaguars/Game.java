package com.example.michael.sladders2returnoftheslaguars;

import com.example.michael.sladders2returnoftheslaguars.modifiers.Modifier;
import com.example.michael.sladders2returnoftheslaguars.players.Player;
import com.example.michael.sladders2returnoftheslaguars.rollables.Rollable;

import java.util.*;

/**
 * Created by michael on 13/09/2017.
 */

public class Game {
    private ArrayList<Player> players;
    private Board board;
    private Rollable dice;

    public Game(ArrayList<Player> players, Board board, Rollable dice) {
        this.players = players;
        this.board = board;
        this.dice = dice;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void playTurn() {
        for (Player player : players) {
            int diceRoll = dice.roll();
            player.move(diceRoll);
            int newPosition = player.getPosition();
            if (board.isPositionModifier(newPosition)) {
                Modifier modifier = board.getModifier(newPosition);
                int offset = modifier.getOffset();
                player.move(offset);
            }
        }
    }
}
