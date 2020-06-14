package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

public class ChessBox {
    private Coordinate coordinate;
    private Piece piece;

    public ChessBox(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "[" +
                coordinate.getIdentifier() + '\'' +
                "[" + (piece == null ? "" : piece) + "]" +
                ']';
    }
}