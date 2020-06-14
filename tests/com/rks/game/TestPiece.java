package com.rks.game;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
