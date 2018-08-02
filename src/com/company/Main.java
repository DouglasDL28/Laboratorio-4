package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Pedir archivo del mapa.
        System.out.println("Ingrese el archivo de texto del mapa: ");
        String archivo = input.nextLine();

        ArrayList<String> linesList = new ArrayList<>();

        try {
            Stream<String> lines = Files.lines(
                    Paths.get(archivo),
                    StandardCharsets.UTF_8
            );
            lines.forEach(line -> linesList.add(line));


        } catch (IOException exception) {
            System.out.println("Error!");
        }

        int height = linesList.size();
        int lenght = linesList.get(1).length();

        Map newMap = new Map(height, lenght);

            AtomicInteger counter = new AtomicInteger();

            linesList.forEach(y -> {
                int Ycounter = counter.getAndIncrement();
                for (int x = 0; x < y.length(); x++) {

                    String Character = y.substring(x, x + 1);
                    switch (Character) {
                        case "^":
                            newMap.addRobot(new Robot(x, Ycounter, 0));
                            break;

                        case ">":
                            newMap.addRobot(new Robot(x, Ycounter, 1));
                            break;

                        case "v":
                            newMap.addRobot(new Robot(x, Ycounter, 2));
                            break;

                        case "<":
                            newMap.addRobot(new Robot(x, Ycounter, 3));
                            break;

                        case "*":
                            newMap.addWall(new Wall(x, Ycounter));
                    }
                }
            });


        //Pedir instrucciones
        System.out.print("Ingrese el archivo de instrucciones: ");
        String instructions = input.nextLine();

        ArrayList<String> instructionsList = new ArrayList<>();


        try {
            Stream<String> line = Files.lines(
                    Paths.get(instructions),
                    StandardCharsets.UTF_8
            );

            line.forEach(command -> instructionsList.add(command));

        } catch (IOException exception) {
            System.out.println("Error!");
        }

        for (int x = 0; x < instructionsList.size(); x++) {
            switch (instructionsList.get(x)){
                case "MOVE":
                    newMap.robot.Move();
                    break;

                case "ROTATE":
                    newMap.robot.Rotate();
                    break;

                case "PICK":
                    newMap.robot.Pick();
                    break;
            }
        }
    }


}


