package com.rks.game;

class Coordinate {
    private int x_pos;
    private int y_pos;

    Coordinate(int x_pos, int y_pos) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }

    public int getX_pos() {
        return x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x_pos=" + x_pos +
                ", y_pos=" + y_pos +
                '}';
    }

    public String getIdentifier() {
        return (char) ('A' + getX_pos()) + "" + (char) ('8' - getY_pos());
    }
}
