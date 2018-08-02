package com.company;

public class Robot {
    public int Xaxis;
    public int Yaxis;
    private int Direccion;
    private int Beepers;

    public Robot(int xaxis, int yaxis, int direccion) {
        this.Xaxis = xaxis;
        this.Yaxis = yaxis;
        this.Direccion = direccion;
    }

    public void Rotate() {
        this.Direccion = (this.Direccion + 1) % 4;
    }

    public boolean Move() {
        if (this.Direccion == 0) {
            this.Xaxis -= 1;
            return true;

        } else if (this.Direccion == 1) {
            this.Xaxis += 1;
            return true;

        } else if (this.Direccion == 2) {
            this.Yaxis += 1;
            return true;

        } else if (this.Direccion == 3) {
            this.Xaxis -= 1;
            return true;
        }
        return false;
    }

    public void Pick () { this.Beepers += 1;}

    @Override
    public String toString() {
        String str = "";
        if (this.Direccion == 0) {
            str = "^";
        } else if (this.Direccion == 1) {
            str = ">";
        } else if (this.Direccion == 2) {
            str = "v";
        } else if (this.Direccion == 3) {
            str = "<";
        }
        return str;
    }
}






