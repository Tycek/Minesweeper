package com.example.tycek.minesweeper;

/**
 * Created by Tycek on 1.12.2017.
 */

public class Mine {
    public int x;
    public int y;
    private int state;
    private boolean visited;
    private boolean flag;
    public int size;

    public Mine(int X, int Y, int Size) {
        x = X;
        y = Y;
        size = Size;
        visited = false;
        flag = false;
    }

    public void changeState(int code) {
        //-1 mina, 0 prázdné, 1-8 počet min
        state = code;
    }

    public int getState() {
        return state;
    }

    public boolean Visited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }

    public boolean flagged() {
        return flag;
    }

    public void flag() {
        flag = true;
    }

    public void unflag() {
        flag = false;
    }
}
