package com.rks.game;


import com.rks.game.chess.*;
import com.rks.game.chess.util.Coordinate;
import org.junit.Test;

import java.util.List;

import static com.rks.game.chess.ChessBoard.isValidChessBoardCoordinate;
import static org.junit.Assert.*;

public class TestChessGameComponents {
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

        //System.out.println(coordinate);

        coordinate = new Coordinate(0, 1);
        assertEquals("A7", coordinate.getIdentifier());

        coordinate = new Coordinate("A8");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(0, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(0, 2);
        assertEquals("A6", coordinate.getIdentifier());

        coordinate = new Coordinate("A8");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(0, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(0, 7);
        assertEquals("A1", coordinate.getIdentifier());

        coordinate = new Coordinate("A1");
        assertEquals(0, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(2, 7);
        assertEquals("C1", coordinate.getIdentifier());

        coordinate = new Coordinate("C1");
        assertEquals(2, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(7, 7);
        assertEquals("H1", coordinate.getIdentifier());

        coordinate = new Coordinate("H1");
        assertEquals(7, coordinate.getX_pos());
        assertEquals(7, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(2, 3);
        assertEquals("C5", coordinate.getIdentifier());

        coordinate = new Coordinate("C5");
        assertEquals(2, coordinate.getX_pos());
        assertEquals(3, coordinate.getY_pos());

        //System.out.println(coordinate);

        coordinate = new Coordinate(5, 5);
        assertEquals("F3", coordinate.getIdentifier());

        coordinate = new Coordinate("F3");
        assertEquals(5, coordinate.getX_pos());
        assertEquals(5, coordinate.getY_pos());

        //System.out.println(coordinate);
    }

    @Test
    public void testChessBoard() {
        ChessBoard chessBoard = new ChessBoard();
        //System.out.println(chessBoard);
        assertFalse(isValidChessBoardCoordinate(new Coordinate(8, 9)));
        assertFalse(isValidChessBoardCoordinate(new Coordinate(-6, 7)));

        assertTrue(isValidChessBoardCoordinate(new Coordinate(0, 0)));
        assertTrue(isValidChessBoardCoordinate(new Coordinate(7, 7)));
        assertTrue(isValidChessBoardCoordinate(new Coordinate(4, 5)));
    }

    @Test
    public void testHorsePossibleMoves() {
        Piece horse = new Horse();
        List<Coordinate> coordinates = horse.possibleMoves(new Coordinate("A8"));
        //coordinates.forEach(c -> System.out.println(c.getIdentifier()));
        assertEquals(2, coordinates.size());
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("B6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C7")));

        coordinates = horse.possibleMoves(new Coordinate("E3"));
        assertEquals(8, coordinates.size());
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C2")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D1")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("F1")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("F5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("G2")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("G4")));
    }

    @Test
    public void testKingPossibleMoves() {
        Piece king = new King();
        List<Coordinate> coordinates = king.possibleMoves(new Coordinate("D5"));
        //coordinates.forEach(c -> System.out.println(c.getIdentifier()));
        assertEquals(8, coordinates.size());
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E4")));
    }

    @Test
    public void testQueenPossibleMoves() {
        Piece queen = new Queen();
        List<Coordinate> coordinates = queen.possibleMoves(new Coordinate("D5"));
        //coordinates.forEach(c -> System.out.println(c.getIdentifier()));
        assertEquals(63, coordinates.size());
        assertFalse(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("A1")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("A2")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("A3")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("B6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E5")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E4")));
    }

    @Test
    public void testBishop() {
        Piece bishop = new Bishop();
        List<Coordinate> coordinates = bishop.possibleMoves(new Coordinate("D5"));
        //coordinates.forEach(c -> System.out.println(c.getIdentifier()));
        assertEquals(13, coordinates.size());


        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("A8")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("B7")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C6")));

        assertFalse(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("D5")));

        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E6")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("F7")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("G8")));


        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("C4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("B3")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("A2")));

        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("E4")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("F3")));
        assertTrue(coordinates.stream().anyMatch(v -> v.getIdentifier().equals("G2")));
    }
}
