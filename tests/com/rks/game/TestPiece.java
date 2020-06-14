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
        assertEquals("A8", coordinate.getIdentifier());

        coordinate = new Coordinate("A8");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(0, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(0, 1);
        assertEquals("A7", coordinate.getIdentifier());

        coordinate = new Coordinate("A8");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(0, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(0, 2);
        assertEquals("A6", coordinate.getIdentifier());

        coordinate = new Coordinate("A8");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(0, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(0, 7);
        assertEquals("A1", coordinate.getIdentifier());

        coordinate = new Coordinate("A1");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(2, 7);
        assertEquals("C1", coordinate.getIdentifier());

        coordinate = new Coordinate("C1");
        assertEquals(2, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(7, 7);
        assertEquals("H1", coordinate.getIdentifier());

        coordinate = new Coordinate("H1");
        assertEquals(7, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(2, 3);
        assertEquals("C5", coordinate.getIdentifier());

        coordinate = new Coordinate("C5");
        assertEquals(2, coordinate.getX_pos());
        assertEquals(3, coordinate.getY_pos());

        System.out.println(coordinate);

        coordinate = new Coordinate(5, 5);
        assertEquals("F3", coordinate.getIdentifier());

        coordinate = new Coordinate("F3");
        assertEquals(5, coordinate.getX_pos());
        assertEquals(5, coordinate.getY_pos());

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
