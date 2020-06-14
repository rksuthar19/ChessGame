package com.rks.game.chess;

import com.rks.game.chess.util.Coordinate;

public class ChessBoard {
    private ChessBox[][] boxes = new ChessBox[8][8];

    /**
     * Attach Chess Box on Chess Board
     */
    public ChessBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                boxes[y][x] = new ChessBox(new Coordinate(x, y));
            }
        }
    }

    public static boolean isValidChessBoardCoordinate(Coordinate coordinate) {
        return coordinate.getX_pos() >= 0 && coordinate.getX_pos() <= 7 && coordinate.getY_pos() >= 0 && coordinate.getX_pos() <= 7;
    }

    @Override
    public String toString() {
        StringBuilder displayString = new StringBuilder();
        for (ChessBox[] box : boxes) {
            for (ChessBox chessBox : box) {
                displayString.append(chessBox);
            }
            displayString.append("\n");
        }
        return displayString.toString();
    }
}