package org.iesfm.tasks.segundoEjercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Search {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File archivo = new File ("/home/dapalo/files/1.txt");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            if ((linea = br.readLine())!= null) {
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
