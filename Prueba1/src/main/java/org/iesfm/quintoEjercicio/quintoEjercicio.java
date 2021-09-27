package org.iesfm.quintoEjercicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class quintoEjercicio {

    public static Logger log = LoggerFactory.getLogger(quintoEjercicio.class);

    public static void renameFile(String selectedPath, String newPath) {
        File file = new File(selectedPath);
        if (file.exists()) {
            file.renameTo(new File(newPath));
        } else {
            log.error("No se pudo renombrar, no existe");
        }
    }

    public static void moveAndRenameFile(String selectedPath, String destinationPath) {
        File file = new File(selectedPath);
        if (file.exists()) {
            log.info("Renombrando/moviendo " + selectedPath + " a un nuevo camino  " + destinationPath);
        } else {
            log.error("No se pudo renombrar o mover el archivo");
        }
    }

    public static void deleteFolder(String selectedpath) {
        File folder = new File(selectedpath);
        log.info("Eliminando... " + selectedpath);
        if (folder.exists()) {
            folder.delete();
        } else {
            log.error("No existe el archivo");
        }
    }

    public static void main(String[] args) {
        moveAndRenameFile("/tmp/d1/f11.txt", "/tmp/d1/f12.txt");
        renameFile("/tmp/d2/f21.txt", "/tmp/d1/f21.txt");
        deleteFolder("/tmp/d2/");
    }

}