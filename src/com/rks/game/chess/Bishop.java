package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static com.rks.game.chess.ChessBoard.isValidChessBoardCoordinate;

public class Bishop extends Piece {
    @Override
    public String getName() {
        return "Bishop";
    }

    @Override
    public List<Coordinate> possibleMoves(Coordinate start) {
        Coordinate possibleCoordinate;
        List<Coordinate> possibleMoves = new ArrayList<Coordinate>();
        //ANY STEP DIAGONAL
        for (int i = 1; i < 8; i++) {
            possibleCoordinate = new Coordinate(start.getX_pos() + i, start.getY_pos() + i);
            if (isValidChessBoardCoordinate(possibleCoordinate)) {
                possibleMoves.add(possibleCoordinate);
            }
            possibleCoordinate = new Coordinate(start.getX_pos() - i, start.getY_pos() + i);
            if (isValidChessBoardCoordinate(possibleCoordinate)) {
                possibleMoves.add(possibleCoordinate);
            }
            possibleCoordinate = new Coordinate(start.getX_pos() + i, start.getY_pos() - i);
            if (isValidChessBoardCoordinate(possibleCoordinate)) {
                possibleMoves.add(possibleCoordinate);
            }
            possibleCoordinate = new Coordinate(start.getX_pos() - i, start.getY_pos() - i);
            if (isValidChessBoardCoordinate(possibleCoordinate)) {
                possibleMoves.add(possibleCoordinate);
            }
        }
        return possibleMoves;
    }
}