package org.iesfm.segundoEjercicio;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File(".");
        try {
            System.out.println("Directorio actual: " +file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
