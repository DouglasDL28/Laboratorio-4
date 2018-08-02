package com.company;

import java.util.stream.Stream;

public class Wall {
    private int Xaxis;
    private int Yaxis;

    public Wall (int x, int y) {
        this.Xaxis = x;
        this.Yaxis = y;
    }

    @Override
    public String toString() {
        return "*";
    };

}
