package com.company;

import java.util.stream.Stream;

public class Wall {
    public int Xaxis;
    public int Yaxis;

    public Wall (int x, int y) {
        this.Xaxis = x;
        this.Yaxis = y;
    }

    @Override
    public String toString() {
        return "*";
    };

}
