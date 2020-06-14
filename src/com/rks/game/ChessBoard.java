package com.rks.game;

class ChessBoard {
    private ChessBox[][] boxes = new ChessBox[8][8];

    /**
     * Attach Chess Box on Chess Board
     */
    ChessBoard() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                boxes[y][x] = new ChessBox(new Coordinate(x, y));
            }
        }
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