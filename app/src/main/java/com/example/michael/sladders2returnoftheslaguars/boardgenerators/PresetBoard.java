package com.example.michael.sladders2returnoftheslaguars.boardgenerators;

import com.example.michael.sladders2returnoftheslaguars.modifiers.Modifier;
import com.example.michael.sladders2returnoftheslaguars.modifiers.Sladder;

import java.util.HashMap;

/**
 * Created by michael on 13/09/2017.
 */

public class PresetBoard implements BoardGenerator {
    @Override
    public HashMap<Integer, Modifier> generateModifiers() {
        HashMap<Integer, Modifier> modifiers = new HashMap<>();
        modifiers.put(3 , new Sladder(3, 51));
        modifiers.put(6 , new Sladder(6, 27));
        modifiers.put(20 , new Sladder(20, 70));
        modifiers.put(36, new Sladder(36, 55));
        modifiers.put(63 , new Sladder(63, 95));
        modifiers.put(68 , new Sladder(68, 98));
        modifiers.put(99 , new Sladder(99, 69));
        modifiers.put(65 , new Sladder(65, 52));
        modifiers.put(91 , new Sladder(91, 61));
        modifiers.put(25 , new Sladder(25, 15));
        modifiers.put(47, new Sladder(47, 19));
        modifiers.put(34, new Sladder(34, 1));
        modifiers.put(87, new Sladder(87, 57));
        modifiers.put(4, new Sladder(4, -1));
        return modifiers;
    }
}
