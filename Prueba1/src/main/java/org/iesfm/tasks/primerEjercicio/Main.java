package org.iesfm.tasks.primerEjercicio;

//Lea el contenido de /tmp/hla.txt. Imprime en patalla el contenido

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File archivo = new File ("/tmp/hola.txt");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!= null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
