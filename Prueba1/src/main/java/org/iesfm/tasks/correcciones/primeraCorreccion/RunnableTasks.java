package org.iesfm.tasks.correcciones.primeraCorreccion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableTasks implements Runnable {

    Logger log = LoggerFactory.getLogger(RunnableTasks.class);

    private String palabra;

    public RunnableTasks(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void run() {
        int vecesRepetidas = Buscador.buscar(palabra);
        log.info("La palabra " + palabra + " se repite " + vecesRepetidas + " veces.");
    }
}
