package com.company;

public class Beepers {
    private int Amount;
    private int Xaxis;
    private int Yaxis;

    public Beepers (int x,int y,int amount){
        this.Amount = amount;
        this.Xaxis = x;
        this.Yaxis = y;

    }

    @Override
    public String toString(){
        return Integer.toString(this.Amount);
    }

}
