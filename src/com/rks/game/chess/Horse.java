package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static com.rks.game.chess.ChessBoard.isValidChessBoardCoordinate;

public class Horse extends Piece {

    @Override
    public String getName() {
        return "Horse";
    }

    public List<Coordinate> possibleMoves(Coordinate start) {
        Coordinate possibleCoordinate;
        List<Coordinate> possibleMoves = new ArrayList<Coordinate>();

        //TWO STEP X AND TURN
        possibleCoordinate = new Coordinate(start.getX_pos() + 2, start.getY_pos() + 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() + 2, start.getY_pos() - 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 2, start.getY_pos() + 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 2, start.getY_pos() - 1);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }

        //TWO STEP Y AND TURN
        possibleCoordinate = new Coordinate(start.getX_pos() + 1, start.getY_pos() + 2);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 1, start.getY_pos() + 2);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() + 1, start.getY_pos() - 2);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        possibleCoordinate = new Coordinate(start.getX_pos() - 1, start.getY_pos() - 2);
        if (isValidChessBoardCoordinate(possibleCoordinate)) {
            possibleMoves.add(possibleCoordinate);
        }
        return possibleMoves;
    }
}