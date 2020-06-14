package com.rks.game;

import java.util.List;

public abstract class Piece {

    public abstract String getName();

    public abstract List<Coordinate> possibleMoves(Coordinate start);
}