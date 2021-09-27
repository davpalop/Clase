package org.iesfm.segundoEjemplo;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String path = ("/home/dapalo");

        File directory = new File(path);

        directory.list();

        for(String file : directory.list()) {
            System.out.println(file);
        }

    }

}
