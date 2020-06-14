package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static com.rks.game.chess.ChessBoard.isValidChessBoardCoordinate;

public class King extends Piece {
    @Override
    public String getName() {
        return "King";
    }

    @Override
    public List<Coordinate> possibleMoves(Coordinate start) {
        Coordinate possibleCoordinate;
        List<Coordinate> possibleMoves = new ArrayList<Coordinate>();
        //ONE STEP ALL8 DIRECTION
        possibleCoordinate = new Coordinate(start.getX_pos(), start.getY_pos() + 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos(), start.getY_pos() - 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() + 1, start.getY_pos() + 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() + 1, start.getY_pos() - 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 1, start.getY_pos() + 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 1, start.getY_pos() - 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() + 1, start.getY_pos());
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 1, start.getY_pos());
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        return possibleMoves;
    }
}