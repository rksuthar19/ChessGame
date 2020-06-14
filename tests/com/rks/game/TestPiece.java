package com.rks.game;


import org.junit.Test;

import static com.rks.game.ChessBoard.isValidChessBoardCoordinate;
import static org.junit.Assert.*;

public class TestPiece {
    @Test
    public void testPiece() {
        Piece horse = new Horse();
        assertEquals("Horse", horse.getName());
    }

    @Test
    public void testCoordinates() {
        Coordinate coordinate;

        coordinate = new Coordinate(0, 0);
        assertEquals("A1", coordinate.getIdentifier());
        System.out.println(coordinate);

        coordinate = new Coordinate(0, 1);
        assertEquals("A2", coordinate.getIdentifier());
        System.out.println(coordinate);

        coordinate = new Coordinate(0, 7);
        assertEquals("A8", coordinate.getIdentifier());
        System.out.println(coordinate);

        coordinate = new Coordinate(7, 7);
        assertEquals("H8", coordinate.getIdentifier());
        System.out.println(coordinate);
    }

    @Test
    public void testChessBoard() {
        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard);
        assertFalse(isValidChessBoardCoordinate(new Coordinate(8, 9)));
        assertFalse(isValidChessBoardCoordinate(new Coordinate(-6, 7)));

        assertTrue(isValidChessBoardCoordinate(new Coordinate(0, 0)));
        assertTrue(isValidChessBoardCoordinate(new Coordinate(7, 7)));
        assertTrue(isValidChessBoardCoordinate(new Coordinate(4, 5)));
    }

    @Test
    public void testHorsePossibleMoves() {
        Piece horse = new Horse();
        horse.possibleMoves(new Coordinate(0, 0));
    }
}
