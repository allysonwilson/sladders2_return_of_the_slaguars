package com.example.michael.sladders2returnoftheslaguars;

/**
 * Created by michael on 13/09/2017.
 */

public class Sladder {
    private int startPosition;
    private int endPosition;
    private SladderType type;

    public Sladder(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        calculateType();
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public SladderType getType() {
        return type;
    }

    public int offset() {
        return endPosition - startPosition;
    }

    private void calculateType() {
        if (endPosition <= -1) {
            type = SladderType.JAGUAR;
        } else if (endPosition > startPosition) {
            type = SladderType.LADDER;
        } else {
            type = SladderType.SNAKE;
        }
    }
}
