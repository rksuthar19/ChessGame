package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

import java.util.List;

public abstract class Piece {

    public abstract String getName();

    public abstract List<Coordinate> possibleMoves(Coordinate start);
}