package com.example.michael.sladders2returnoftheslaguars;

import com.example.michael.sladders2returnoftheslaguars.boardgenerators.BoardGenerator;
import com.example.michael.sladders2returnoftheslaguars.modifiers.Modifier;

import java.util.HashMap;

/**
 * Created by michael on 13/09/2017.
 */

public class Board {
    private HashMap<Integer, Modifier> modifiers;
    private BoardGenerator generator;

    public Board(BoardGenerator generator) {
        this.generator = generator;
        modifiers = generator.generateModifiers();
    }

    public boolean isPositionModifier(int position) {
        return modifiers.containsKey(position);
    }


    public Object getModifier(int position) {
        return modifiers.get(position);
    }
}