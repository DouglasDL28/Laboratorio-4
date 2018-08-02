package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
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
            for ()
 //           lines.forEach(j -> System.out.println(j));



        } catch (IOException exception) {
            System.out.println("Error!");
        }

    }
}
