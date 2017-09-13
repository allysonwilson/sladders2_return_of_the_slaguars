package com.example.michael.sladders2returnoftheslaguars.players;

/**
 * Created by michael on 13/09/2017.
 */

public interface Player {
    String getName();
    int getPosition();

    void move(int offset);
}
