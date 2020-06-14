package com.rks.game.chess;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {
    List<Piece> pieces = new ArrayList<>();

    public PieceFactory(List<Piece> pieces) {
        pieces.add(new Horse());
        pieces.add(new Bishop());
        pieces.add(new Queen());
        pieces.add(new Rook());
        pieces.add(new King());
    }

    public Piece construct(String pieceName) {
        return pieces.stream().filter(p -> p.getName().equals(pieceName)).findFirst().orElse(null);
    }
}
