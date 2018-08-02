package com.company;

public class Robot {
    private static final int Up = 0;
    private static final int Right = 1;
    private static final int Down = 2;
    private static final int Left = 3;
    private int Xaxis;
    private int Yaxis;
    private int Direction;
    private int Beepers;

    public Robot(int xaxis, int yaxis, int direccion) {
        this.Xaxis = xaxis;
        this.Yaxis = yaxis;
        this.Direction = direccion;
    }


    public void Rotate() {
        this.Direction = (this.Direction + 1) % 4;
    }

    public void Move() {
        if (this.Direction == Up) {
            this.Yaxis -= 1;

        } else if (this.Direction == Right) {
            this.Xaxis += 1;

        } else if (this.Direction == Down) {
            this.Yaxis += 1;

        } else if (this.Direction == Left) {
            this.Xaxis -= 1;
        }
    }

    public void Pick () { this.Beepers += 1;}

    @Override
    public String toString() {
        String str = "";
        if (this.Direction == 0) {
            str = "^";
        } else if (this.Direction == 1) {
            str = ">";
        } else if (this.Direction == 2) {
            str = "v";
        } else if (this.Direction == 3) {
            str = "<";
        }
        return str;
    }
}






