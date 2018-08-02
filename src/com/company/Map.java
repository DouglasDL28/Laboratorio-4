package com.company;

import java.util.ArrayList;

public class Map {
    private int Height;
    private int Lenght;
    private ArrayList<Wall> walls;
    private ArrayList<Beepers> beepers;
    public Robot robot;

    public Map(int height, int lenght) {
        this.Height = height;
        this.Lenght = lenght;
        this.walls = new ArrayList<>();
        this. beepers = new ArrayList<>();
    }


    public void addWall(Wall wall) {
        this.walls.add(wall);
    }

    public void addBeepers(Beepers beepers) {
        this.beepers.add(beepers);
    }

    public void addRobot(Robot robot) {
        this.robot = robot;
    }


    @Override
    public String toString(){
        return "";
    }
}