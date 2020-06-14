package com.rks.game;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiece {
    @Test
    public void testPiece() {
        Piece horse = new Horse();
        assertEquals("Horse", horse.getName());
    }
}
