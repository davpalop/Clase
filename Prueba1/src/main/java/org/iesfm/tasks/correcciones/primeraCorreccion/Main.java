package org.iesfm.tasks.correcciones.primeraCorreccion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {


    private static Logger log = LoggerFactory.getLogger(Main.class);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String palabra = "";
        while (!palabra.equals("exit")) {
            log.info("Introduce la palabra que desea buscar");
            palabra = scanner.nextLine();
            if (!palabra.equals("exit")) {
                Thread t = new Thread(new RunnableTasks(palabra));
                t.start();
            }
        }
    }

}
