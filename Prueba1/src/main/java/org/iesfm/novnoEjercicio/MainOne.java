package org.iesfm.novnoEjercicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class MainOne {

    private final static Logger log = LoggerFactory.getLogger(org.iesfm.sextoEjercicio.Main.class);

    public static void showInfo(File data) {
        if (!data.exists()) {
            log.error("No existe ningun archivo con ese nombre");
        } else {
            if (data.isDirectory()) {
                log.info("Es un directorio y su nombre es " + data.getName());
                log.info("Dentro de este directorio existen estos archivos " +data);
            } else {
                log.info("Es un fichero y tiene un tamaño de " + data.length());
            }
        }
    }


    public static void main(String[] args) {
        File file = new File(args [0]);
        showInfo(file);
    }

}
