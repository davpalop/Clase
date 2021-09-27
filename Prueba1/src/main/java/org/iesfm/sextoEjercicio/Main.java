package org.iesfm.sextoEjercicio;

import java.io.File;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void showInfo(File fileToCheck) {

        log.info("El nombre del archivo es: " + fileToCheck.getName());
        log.info("El camino absoluto: " + fileToCheck.getAbsolutePath());
        log.info("El tamaño es de " + fileToCheck.length());
        log.info("¿Es fichero? " + fileToCheck.isFile());
        log.info("¿Es directorio? " + fileToCheck.isDirectory());
        log.info("Última modificacion " + fileToCheck.lastModified());
        log.info("¿Tiene permiso de escritura? " + fileToCheck.canWrite());
        log.info("¿Tiene permiso de lectura? "  + fileToCheck.canRead());
        log.info("¿Tiene permiso de ejecución? " + fileToCheck.canExecute());

    }

    public static void main(String[] args) {

        if (args.length == 0) {
            log.error("Debe introducir argumento");
        } else {
            File file = new File (args[0]);

            showInfo(file);
        }

    }

}
