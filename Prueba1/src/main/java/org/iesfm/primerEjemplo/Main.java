package org.iesfm.primerEjemplo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta donde guardar el fichero");
        String path = scanner.nextLine();

        File userFolder = new File(path);

        if (!userFolder.exists()) {
            System.out.println("Error, no existe el path " +userFolder.getAbsolutePath());
        } else {
            System.out.println("Perfecto, ahora introduce el nombre de usuario ");
            String userPath = scanner.nextLine();
            File user = new File(path + userPath+ ".txt");
            try {
                user.createNewFile();
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo: " + e.getMessage());
            }

        }


    }


}
