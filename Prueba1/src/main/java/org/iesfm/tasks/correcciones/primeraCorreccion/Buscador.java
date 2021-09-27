package org.iesfm.tasks.correcciones.primeraCorreccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    public static int buscar(String palabra) {
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                        "src/main/resources/el_quijote.txt"
                ))
        ) {
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(palabra)) {
                    contador++;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contador;
    }

}

