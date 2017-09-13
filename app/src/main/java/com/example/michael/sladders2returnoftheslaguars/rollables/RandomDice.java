package com.example.michael.sladders2returnoftheslaguars.rollables;

import com.example.michael.sladders2returnoftheslaguars.rollables.Rollable;

import java.util.Random;

/**
 * Created by michael on 13/09/2017.
 */

public class RandomDice implements Rollable {
    int numberOfSides;

    public RandomDice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll(){
        Random random = new Random();
        int result = random.nextInt(numberOfSides) + 1;
        return result;
    }
}

