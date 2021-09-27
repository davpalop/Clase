package org.iesfm.cuartoEjercicio;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    private static void createTmpDir(String dir) {
        File folder = new File("/tmp/" + dir);
        folder.mkdir();
    }

    private static void createTmpFile(String dir, String fileName) throws IOException {
        File file = new File("/tmp/" +dir+ "/" + fileName);
        file.createNewFile();
    }

    public static void main(String[] args){
        try {
        log.info("Creando directorio d1");
        createTmpDir("d1");
        log.info("Creando archivo f11");
        createTmpFile("d1", "f11.txt");
        log.info("Creando directorio d2");
        createTmpDir("d2");
        log.info("Creando fichero f21");
        createTmpFile("d2", "f21.txt");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Ha habido un error inesperado al crear los archivos");
        }
    }

}
