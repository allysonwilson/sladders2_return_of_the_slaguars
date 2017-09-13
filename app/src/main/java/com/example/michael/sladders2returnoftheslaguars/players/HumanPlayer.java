package com.example.michael.sladders2returnoftheslaguars.players;

/**
 * Created by michael on 13/09/2017.
 */

public class HumanPlayer implements Player {
    private String name;
    private int position;

    public HumanPlayer(String name) {
        this.name = name;
        this.position = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void move(int offset) {
        this.position += offset;
    }
}
