package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

import java.util.ArrayList;
import java.util.List;

import static com.rks.game.chess.ChessBoard.isValidChessBoardCoordinate;

public class Queen extends Piece {
    @Override
    public String getName() {
        return "Queen";
    }

    @Override
    public List<Coordinate> possibleMoves(Coordinate start) {
        Coordinate possibleCoordinate;
        List<Coordinate> possibleMoves = new ArrayList<Coordinate>();
        //ANY STEP ALL8 DIRECTION
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!(i == start.getX_pos() && j == start.getY_pos())) {
                    possibleCoordinate = new Coordinate(i, j);
                    if (isValidChessBoardCoordinate(possibleCoordinate)) {
                        possibleMoves.add(possibleCoordinate);
                    }
                }
            }
        }
        return possibleMoves;
    }
}