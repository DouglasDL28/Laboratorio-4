package com.company;

import java.util.ArrayList;

public class Map {
    private int Height;
    private int Lenght;
    public ArrayList <Wall> walls;
    public ArrayList <Beepers> beepers;
    private Robot robot;

    public Map(int height, int lenght) {
        Height = height;
        Lenght = lenght;
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

    public boolean executeMove (){
        for (int i = 0; i < this.walls.size(); i++) {
            if ((this.walls[i].Xaxis == this.robot.Xaxis) && (this.walls[i].Xaxis == this.robot.Yaxis)) {

            }
        }

    }

    @Override
    public String toString(){
        return "";
    }
}