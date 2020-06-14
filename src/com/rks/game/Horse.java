package com.rks.game;

import java.util.List;

public class Horse extends Piece {

    @Override
    public String getName() {
        return "Horse";
    }

    public List<Coordinate> possibleMoves(Coordinate start) {
        return null;
    }
}