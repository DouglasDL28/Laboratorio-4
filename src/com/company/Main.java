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

        System.out.println("Ingrese el archivo de texto del mapa: ");
        String archivo = input.nextLine();

        try {
            Stream<String> lines = Files. lines(
                    Paths.get(archivo),
                    StandardCharsets.UTF_8
            );


            int lenght = lines.findFirst().get().length();
            int height = 0;
            lines.forEach(y -> height += 1);

            Map newMap = new Map(height, lenght);

            AtomicInteger counter = new AtomicInteger();

            lines.forEach(y -> {
                int Ycounter = counter.getAndIncrement();
                for (int x =0; x < y.length(); x++) {

                    String Character = y.substring(x ,x + 1);
                    switch (Character) {
                        case "^":
                            newMap.addRobot(new Robot (x, Ycounter, 0));
                            break;

                        case ">":
                            newMap.addRobot(new Robot (x, Ycounter, 1));
                            break;

                        case "v":
                            newMap.addRobot(new Robot (x, Ycounter, 2));
                            break;

                        case "<":
                            newMap.addRobot(new Robot (x, Ycounter, 3));
                            break;

                        case "*":
                            newMap.addWall(new Wall (x, Ycounter));

                    }
                }
            });


        } catch (IOException exception) {
            System.out.println("Error!");
        }

        System.out.print("Ingrese el archivo de instrucciones: ");
        String instrucciones = input.nextLine();

        try {
            Stream<String> lines = Files. lines(
                    Paths.get(archivo),
                    StandardCharsets.UTF_8
            );

            lines.forEach(command -> System.out.printf(command));

            lines.forEach(command -> {});
        } catch (IOException exception) {
            System.out.println("Error!");
        }



    }
}
