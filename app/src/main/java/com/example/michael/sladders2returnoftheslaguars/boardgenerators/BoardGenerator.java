package com.example.michael.sladders2returnoftheslaguars.boardgenerators;

import com.example.michael.sladders2returnoftheslaguars.modifiers.Modifier;

import java.util.HashMap;

/**
 * Created by michael on 13/09/2017.
 */

public interface BoardGenerator {
    HashMap<Integer, Modifier> generateModifiers();
}
